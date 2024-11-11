// Determine if two strings are anagrams or not

package Strings;
import java.util.*;

public class q4 {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "nilkam";
        if(str1.length() == str2.length()){
            char str1Chararray[]=str1.toCharArray();
            char str2Chararray[]=str2.toCharArray();
            
            Arrays.sort(str1Chararray);
            Arrays.sort(str2Chararray);
            
            System.out.println(str1Chararray);
            System.out.println(str2Chararray);


            if(Arrays.equals(str1Chararray,str2Chararray)){
                System.out.println("Anagrams");

            }else{
                System.out.println("Not Anagrams");
            }



        }else{
            System.out.println("Not anagrams");
        }    

    }
}