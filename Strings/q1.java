// Count how many times a lowercase vowels occur in a given string entered by the user



package Strings;

import java.util.Scanner;

public class q1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
          char  ch=str.charAt(i);
               if(ch =='a' || ch == 'e'|| ch == 'i' || ch=='o'||ch=='u' ){
                count++;
               }


    }
    System.out.println(count);
}
}