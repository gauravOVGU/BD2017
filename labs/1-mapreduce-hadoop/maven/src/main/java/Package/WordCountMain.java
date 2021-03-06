package main.java.Package;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class WordCountMain{

	public static void main(String[] args) throws Exception {
		
		if (args.length != 2) {
		      System.out.printf("Usage: StubDriver <input dir> <output dir>\n");
		      System.exit(-1);
		    }
		
		  Configuration conf = new Configuration();         
		  Job job = Job.getInstance(conf, "word count");
		  job.setJarByClass(WordCountMain.class);
		  job.setOutputKeyClass(Text.class);
		  job.setOutputValueClass(IntWritable.class);
		  job.setMapperClass(WordCountMapper.class);
		  job.setReducerClass(WordCountReducer.class);
		  job.setInputFormatClass(TextInputFormat.class);
		  job.setOutputFormatClass(TextOutputFormat.class);
		  FileInputFormat.addInputPath(job, new Path(args[0]));
		  FileOutputFormat.setOutputPath(job, new Path(args[1]));
		  job.waitForCompletion(true);
		  }
	
}
