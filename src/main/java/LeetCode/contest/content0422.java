package LeetCode.contest;

import java.util.*;

public class content0422 {
    public static int[] supplyWagon(int[] supplies) {
        if(supplies.length==1||supplies.length==0){
            return supplies;
        }
        int resn = supplies.length-supplies.length/2;
        int num =0;
        while(num<resn){
            supplies =  supplyWagon1(supplies);
            num++;
        }
        return supplies;
    }
    public static int[] supplyWagon1(int[] suppiles){
       int[] res = new int[suppiles.length-1];
       int min = suppiles[1]+suppiles[0];
       int index= 0;
        for (int i = 1; i < suppiles.length; i++) {
           if(min>suppiles[i]+suppiles[i-1]){
               min = suppiles[i]+suppiles[i-1];
               index = i-1;
           }
        }
        int j =0;
        while(j<suppiles.length){
            if(j<index){
                res[j] = suppiles[j];
            }else if(j>index){
                res[j-1]=suppiles[j];
            }else{
                res[j] = suppiles[j]+suppiles[j+1];
                j++;
            }
            j++;
        }
        return  res;
    }

    public static void main(String[] args) {
        // 测试示例1
//        int[] supplies1 = {7, 3, 6, 1, 8};
//        int[] result1 = supplyWagon(supplies1);
//        System.out.println(Arrays.toString(result1)); // 输出：[10, 15]
//
//        // 测试示例2
//        int[] supplies2 = {1, 3, 1, 5};
//        int[] result2 = supplyWagon(supplies2);
//        System.out.println(Arrays.toString(result2)); // 输出：[5, 5]

//        String[] expeditions1 = {"xO->xO->xO","xO->BKbWDH","xO->BKbWDH","BKbWDH->mWXW","LSAYWW->LSAYWW","oAibBvPdJ","LSAYWW->u","LSAYWW->LSAYWW"};
//        String[] expeditions2 = {"Alice->Dex","","Dex"};
//        System.out.println(adventureCamp(expeditions1));
//        System.out.println(adventureCamp(expeditions2));
       // System.out.println(fieldOfGreatestBlessing(new int[][]{{4,4,6},{7,5,3},{1,6,2},{5,6,3}}));
        System.out.println(fieldOfGreatestBlessing(new int[][]{{0,0,1},{1,0,1}}));

    }

    public static int adventureCamp(String[] expeditions) {
        String[] temps = expeditions[0].split("->");
        HashSet<String> set = new HashSet<>(Arrays.asList(temps));
        set.add("");
        int res = -1;
        int count = 0;
        for (int i = 1; i < expeditions.length; i++) {
            int temp =0;
            String[] words = expeditions[i].split("->");
            for (String word :words) {
                if(!set.contains(word)){
                    temp++;
                    set.add(word);
                }
            }
            if(count<temp){
                count = temp;
                res = i;
            }


        }
        return res;
    }


    public static int fieldOfGreatestBlessing(int[][] forceField) {
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < forceField.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i+1; j <forceField.length ; j++) {
                if(iscross(forceField[i],forceField[j])){
                    list.add(j);
                }
            }
            arrayList.add(list);
        }
        int res =0;
        for (List<Integer> integers : arrayList) {
            res = Math.max(integers.size(),res);
        }
        return res;
    }
    public static boolean iscross(int[] A,int[]B){
        float radisA = A[2];
        radisA =  radisA/2;
        float radisB = B[2];
        radisB=  radisB/2;
        float Al = A[0]-radisA,Ar=A[0]+radisA,Ad=A[1]-radisA,Au=A[1]+radisA;
        float Bl = B[0]-radisB,Br=B[0]+radisB,Bd=B[1]-radisB,Bu=B[1]+radisB;
        Boolean heng=false,shu=false;
       if((Al<=Bl && Bl<=Ar)||(Bl<=Al && Al<=Br)||(Al<=Br && Br<=Ar)||(Br<=Al && Ar<=Br)){
           heng =true;
       }
        if((Ad<=Bd && Bd<=Au)||(Bd<=Ad&& Ad<=Bu)||(Ad<=Bu && Bu<=Au)||(Bd<=Au && Au<=Bu)){
            shu =true;
        }
        return heng & shu;
    }
}
