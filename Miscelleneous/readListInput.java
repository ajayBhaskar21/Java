/*
 * 
 * problem: Read array elements without array size. 
 * 
 * 
*/

import java.util.ArrayList;
import java.util.Scanner;

class readListInput {


    public static void main(String[] args) {
        

        String s = "1 2 3 4 5";
        String[] ch = s.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();

        

        for (int i = 0; i < ch.length; i++){
           
            nums.add(Integer.parseInt(ch[i]));

        }

        System.out.println(nums + " , " + nums.size());




    }
}










