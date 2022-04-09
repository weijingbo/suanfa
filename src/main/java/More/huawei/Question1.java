package More.huawei;

import java.io.InputStream;
import java.util.*;

public class Question1 {
    public static String[] question1(int topN,List<String> topic){
//        HashMap<String,Integer> map1 = new HashMap<>();
//        HashMap<String,Integer> map2 = new HashMap<>();// 当得分相同时用来比较
//        for (int i = 0; i < topic.size(); i++) {
//            int wight = i/2==1 ? 3:1; //确定权重
//            String s = topic.get(i);
//            String[] words = s.split(" ");//将字符串按照空格拆分
//            for (String word:words) {
//                map1.put(word, (map1.getOrDefault(word, 0) + wight));
//            }
//        }
//        for (int i = 0; i < topic.size(); i++) {
//            int wight = i/2==1 ? 4:1; //这里将权重改为4：1，若两个得分相同，标题多的得分大;
//            String s = topic.get(i);
//            String[] words = s.split(" ");
//            for (String word:words) {
//                map2.put(word, (map2.getOrDefault(word, 0) + wight));
//            }
//        }
//        String[] ans = new String[topN]; //创建一个数组
//        for(int i=0;i<topN;i++){
//            String temp=" "; //记录hashmap的value
//            int max = 0;//记录hashmap的当前最大值
//            for(Map.Entry<String, Integer> entry : map1.entrySet()){
//                if(max<entry.getValue()){   //如果当前value大于max，更改temp和max
//                    max = entry.getValue();
//                    temp = entry.getKey();
//                }if(max == entry.getValue()){//如果当前value等于max，使用map2
//                    int m2 = map2.get(entry.getKey());
//                    if(m2>entry.getValue()){
//                        temp = entry.getKey();
//                    }
//                }
//            }
//            map1.remove(temp); //删除当前的最大值
//            ans[i] = temp;
//        }
//        return ans;
        HashMap<String,List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < topic.size(); i++) {
            boolean istop = i / 2 == 1;
            int wight = i/2==1 ? 3:1; //确定权重
            String s = topic.get(i);
            String[] words = s.split(" ");//将字符串按照空格拆分
            for (String word:words) {
                if(map1.containsKey(word)){
                    List<Integer> chengji = map1.get(word);
                    if(istop) chengji.set(0,chengji.get(0)+1);
                    chengji.set(1,chengji.get(1)+wight);
                    map1.put(word,chengji);
                }else{
                    List<Integer> chengji = new ArrayList<>();
                    if(istop)chengji.add(1);
                    else chengji.add(0);
                    chengji.add(wight);
                    map1.put(word,chengji);
                }
            }

        }
        String[] ans = new String[topN]; //创建一个数组
//        for(int i=0;i<topN;i++){
//            String temp=" "; //记录hashmap的value
//            int max = 0;//记录hashmap的当前最大值
//            for(Map.Entry<String, Integer> entry : map1.entrySet()){
//                if(max<entry.getValue()){   //如果当前value大于max，更改temp和max
//                    max = entry.getValue();
//                    temp = entry.getKey();
//                }if(max == entry.getValue()){//如果当前value等于max，使用map2
//                    int m2 = map2.get(entry.getKey());
//                    if(m2>entry.getValue()){
//                        temp = entry.getKey();
//                    }
//                }
//            }
//            map1.remove(temp); //删除当前的最大值
//            ans[i] = temp;
//        }
        return ans;
    }


    public static void main(String[] args) {
        int n = 3;
        List<String> topic = new ArrayList<>();
        topic.add("xinguan feiyan xinzeng bendi quezhen anli");
        topic.add("ju baodao chengdu xinzeng xinguan feiyan bendi anli yili shenzhen xinzeng bendi quezhen anli laingli yiqing zhengti kongzhi lianghao");
        System.out.println(Arrays.toString(question1(n,topic)));
    }
}
