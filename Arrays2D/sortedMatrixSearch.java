package Arrays2D;

public class sortedMatrixSearch {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0,col=matrix.length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("the key is found at index ("+row+","+col+")" );
                
                return true;
                }
                else if(matrix[row][col]>key){
                    col--;
                    
                    }
                    else{
                        row++;
                    }
        }

        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=39;
    //     int row=0;
    //     int col=matrix[0].length-1;
    //     while(row<matrix.length && col>=0){
    //         if(matrix[row][col]==key){
    //             System.out.println("Element is found at position ("+row+","+(col+1)+
    //             ") in the matrix");
    //             break;
    //             }else if(matrix[row][col]>key){
    //                 col--;
    //                 }else{
    //                     row++;
    //                     }

    // }

    stairCaseSearch(matrix, key);
    System.out.println(stairCaseSearch(matrix, key));
    
}
}