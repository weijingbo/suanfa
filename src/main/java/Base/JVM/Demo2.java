package Base.JVM;

public class Demo2 {

    public static void main(String[] args) {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        //OOM
         //1、尝试扩大堆内存看结果
        //2、分析代码
        //能够看到代码第几行出错：内存快照分析工具，MAT，Jprofiler
        //Debug，一行行分析
        // -Xms 设置初始化内存分配大小
        // -Xmx 设置最大分配内存
        //-Xms1024m -Xmx1024m -XX:+PrintGCDetails
        //+XX:HeapDumpOnOutOfMemory
        System.out.println("max="+max+"字节\t"+(max/(double)1024/1024)+"MB");
    }
}
