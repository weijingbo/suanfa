package learn.chapter07;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Java03_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        Hashtable<String,String> table = new Hashtable<>();
        //put 方法既可以用来添加数据，也可以用来修改数据，有返回值
        System.out.println(map.put("0", "a")); //初次添加为null
        System.out.println(map.put("0", "b")); //之后添加为之前所存储的值

        //使用putIfAbsent确保数据不会被更新
        map.putIfAbsent("1","zhangsan");
        map.putIfAbsent("1","lisi");
        System.out.println(map);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }

        // TODO HashMap 和Hashtable的区别
        // TODO 1、实现方式不一样，继承的父类不一样
        // TODO 2、底层的容量不同 HashMap（16） table（11）
        // TODO 3、Hashtable 的 K,V不可以为null
        // TODO 4、底层定位信息方式不同HashMap底层采用hash算法，Hashtable底层采用的是Hashcode
        // TODO 5、HashMap的效率较高，Hashtable的效率较低
        map.clear();
        map.put(null,null);
        System.out.println(map);
        table.put(null,null);
        System.out.println(table);
    }
}
