package learn.chapter07;

import java.util.*;

public class Java04_HashMap_iter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        Set<String> keySets = map.keySet();
//        for (String k : keySets) {
//            if("b".equals(k)){
//                map.remove(k);
//            }
//            System.out.println(k);
//        }

        // TODO 迭代器
        Iterator<String> iterator = keySets.iterator();
        if(iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("b")){
                iterator.remove();
            }
            System.out.println(map.get(next));
        }
    }
}
