package my.bigdata.repository.utils.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


/**
 * @author djh on  2019/6/27 10:29
 * @E-Mail 1544579459@qq.com
 */
public class JobUtil {

    public static Job getJob(Configuration configuration, Class jarByClass, Class<? extends Mapper> mapperClass,
                             Class<? extends Reducer> reducerClass, Class mapOutKeyClass, Class mapOutValueClass,
                             Class outPutKeyClass, Class outPutValueClass) {
        Job job = null;
        try {
            job = Job.getInstance(configuration);

            job.setJarByClass(jarByClass);

            job.setMapperClass(mapperClass);
            job.setReducerClass(reducerClass);

            job.setMapOutputKeyClass(mapOutKeyClass);
            job.setMapOutputValueClass(mapOutValueClass);

            job.setOutputKeyClass(outPutKeyClass);
            job.setOutputValueClass(outPutValueClass);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return job;
    }
}
