import java.util.*;
public class twodarray{
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell(" + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){ // 

            //Top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //Right
            for(int i=startRow+1;i<=endCol;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //Bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endCol][j] +" ");
            }

            //Left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static int diaSum(int matrix[][]){
        int sum = 0;
        //Bruteforce solution of tc O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){ //O(n)
            //pd
            sum+= matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] ==key){
                System.out.println("found key at ("+row+","+col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]){
        // int matrix[][] = new int[3][3]; //3*3 matrix
        // int n = matrix.length,m=matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // //Output
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j] + " ");
                
        //     }
        //     System.out.println();
        
        // }
        // search(matrix, 5);
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 330;
        //printSpiral(matrix);
        //System.out.println(diaSum(matrix));
        staircaseSearch(matrix, key);
    }

    //HW need to be done its done now and correctly

}