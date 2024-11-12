package Arrays2D;
import java.util.Scanner;


public class twoDArrays {
    public static boolean search(int matrix[][],int key){
         
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("the element is found at ("+ i + ","+ j + ")");
                    return true;
                    
                    }
                
        }
    }
    return false;
}
    public static void main(String[] args) {
         int matrix[][]=new int[3][3];
         Scanner sc=new Scanner(System.in);
         for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Enter the element at position ["+i+"]["+j+"] :");
                matrix[i][j]=sc.nextInt();
            }
        }
   
}
}
