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
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
