public class backtracking {
    public static void changeArr(int arr[],int i,int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1); //fxn call step
        arr[i] = arr[i] - 2; //backtracking step


    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void findSubsets(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }

    public static void findPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
            char chr = str.charAt(i);
            String Newstr = str.substring(0, i)+str.substring(i+1);
            findPermutations(Newstr, ans+chr);
        }
        
    }

    public static boolean isSafe(char board[][],int row,int col){
        //Vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("----chess board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafee(int suduko[][],int row,int col,digit){
        for(int i=0;i<=8;i++){
            if(suduko[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(suduko[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3X3
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j] == digit){
                    return false;
                } 
            }
        }
        return true;
    }

    public static boolean sudukoSolver(int suduko[][],int row,int col){
        if(row == 9 && col == 9){
            return true;
        }else if(row ==9){
            return false;
        }
        int nextRow = row,nextCol = col+1;
        if(col+1 == 9){
            nextRow = row=1;
            nextCol = 0;
        }
        if(suduko[row][col]!=0){
            return sudukoSolver(suduko, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafee(suduko,row,col,digit)){
                suduko[row][col] = digit;
                if(sudukoSolver(suduko,nextRow ,col)){
                    return true;
                }
                suduko[row][col] = 0;
            }
        }
        return false;
    }
    printSudoku
    public static void main(String args[]){
        // int arr[] = new int[5];
        // changeArr(arr,0,1);
        // printArr(arr);
        // String str = "abc";
        // //findSubsets(str, "", 0);
        // findPermutations(str, "");
        // int n = 4;
        // char board[][] = new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j] = 'X';
        //     }
        // }
        // nQueens(board, 0);

        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    
    if(sudukoSolver(suduko,0,0)){
        System.out.println("Solution exists");
        printSudoku(sudoku);
    } else{
        System.out.println("No soln");
    }
}
