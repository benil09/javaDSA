package Arrays2D;

public class diagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum =0;
        // for (int i=0;i<=matrix.length;i++){  // time complexity = O(n^2)
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j | i+j== matrix.length-1){
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }

        //optimized code
        System.out.println(matrix.length);
        for(int i=0;i<matrix.length;i++){
            //pd sum
            sum=sum+matrix[i][i];

            //sd sum
            if(i!=matrix.length-i-1){
            sum=sum+matrix[i][matrix.length-i-1];
            }
        }


        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        
        System.out.println(diagonalSum(matrix));
    }
    
}
