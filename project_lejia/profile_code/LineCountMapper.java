package linescount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class LineCountMapper extends
        Mapper<Object, Text, Text, IntWritable> {

    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text("Total Lines");

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        context.write(word, one);
    }
}
