package my.bigdata.repository.utils.hadoop;

import org.apache.hadoop.conf.Configuration;

/**
 * Notice: 需要注意更改 hdfs 的文件权限.
 * @author djh on  2019/6/25 20:17
 * @E-Mail 1544579459@qq.com
 */
public class ConfUtil {

    public static void setRemoteConfig(Configuration configuration) {
        configuration.set("fs.default.name", "hdfs://hadoop1-host:9000");
        // 意思是跨平台提交，在windows下如果没有这句代码会报错 "/bin/bash: line 0: fg: no job control"，去网上搜答案很多都说是linux和windows环境不同导致的一般都是修改YarnRunner.java，但是其实添加了这行代码就可以了。
        configuration.set("mapreduce.app-submission.cross-platform", "true");
        // 集群的方式运行，非本地运行.
        configuration.set("mapreduce.framework.name", "yarn");
        configuration.set("yarn.resourcemanager.hostname", "hadoop2-host");
        // 需要设置 MapReduce 程序的 jar 包所在地, 不然远程提交时会报错 ClassNotFound.
        configuration.set("mapred.jar", "E:\\Code\\MyBigDataDemo\\target\\HadoopDemo-1.0-SNAPSHOT.jar");
    }

}
