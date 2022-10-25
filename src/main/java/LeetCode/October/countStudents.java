package LeetCode.October;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class countStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> student = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            student.addLast(students[i]);
        }

        int j = 0;
        int count = 0;
        while(student.size()>0){
            if(count>student.size()) break;
            int temp = student.pop();
            if(temp==sandwiches[j]){
                j++;
                count = 0;
            }else {
                student.addLast(temp);
                count++;
            }
        }
        return student.size();
    }

    public static void main(String[] args) {
        countStudents countStudents = new countStudents();
        System.out.println(countStudents.countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1}));
    }
}
