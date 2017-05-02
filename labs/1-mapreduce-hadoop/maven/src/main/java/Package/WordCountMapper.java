package main.java.Package;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
       private final static IntWritable one = new IntWritable(1);
       private Text word = new Text();
           
       public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
           String line = value.toString();
           StringTokenizer tokenizer = new StringTokenizer(line);
           while (tokenizer.hasMoreTokens()) {
               word.set(getOnlyStrings(tokenizer.nextToken().toString()));
               context.write(word, one);
           }
       }
       public String getOnlyStrings(String s) {
    	    Pattern pattern = Pattern.compile("[^a-z A-Z 0-9 ' -]");
    	    Matcher matcher = pattern.matcher(s);
    	    String number = matcher.replaceAll("");
    	    return number;
    	 }
    } 
