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

    public static boolean isSafee(char[][] board,int row,int col,int number){
        //row n coln
        for(int i=0;i<board.length;i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number +'0')){
                return false;
            }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int k=sr;k<sr+3;k++){
            for(int j=sc;j<sc+3;j++){
                if(board[k][j] == (char)(number + '0')){
                    return false;
                }
                
            }
        }

        
        }
        return true;
    }

    public static boolean helper(char[][] board,int row,int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col!=board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol = 0;
        }
        if(board[row][col]!='0'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }else{
            for(int i=0;i<=9;i++){
                if(isSafee(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(helper(board,nrow,ncol)){
                        return true;
                    }else{
                        board[row][col] = '0';
                    }
                }
            }
        }
        return false;
    }

    public static void solveSuduko(char[][] board){
        helper(board,0,0);
    }

    public static void print(int board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    
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

        int board[][] = {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        System.out.print((board));
    
    }

    
}
