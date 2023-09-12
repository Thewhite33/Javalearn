public class recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }

    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sumn(n-1);
        int sn = n + sumn(n-1);
        return sn;
    }

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fb = fibnm1 + fibnm2;
        return fb;
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key, i+1);
    }

    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = pow(x,n-1);
        // int xn = x*xnm1;
        return x*pow(x, n-1);
    }

    public static int optimizedPow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPow = optimizedPow(a, n/2);
        int halfPowsq = halfPow*halfPow;

        if((n%2) != 0){
            halfPowsq = a*halfPowsq;
        }
        return halfPowsq;
    }

    public static int tillingProb(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tillingProb(n-1);
        int fnm2 = tillingProb(n-2);
        int totWays = fnm1+fnm2;
        return totWays;
    }

    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void printBinStrings(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0"); 
        if(lastplace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        //int n = 10;
        //printDec(n);
        //printInc(n);
        //System.out.print(fact(5));
        //System.out.println(sumn(5));
        //System.out.println(fib(26));
        int arr[] = {6,5,3,2,1,1,3};
        //System.out.println(isSorted(arr,0));
        //System.out.println(firstOccurence(arr, 1,0));
        //System.out.println(lastOccurence(arr, 1,0));
        //System.out.println(pow(2, 10));
        //System.out.println(optimizedPow(2, 100));
        //System.out.println(tillingProb(3));
        // String str = "apnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(friendsPairing(3));
        printBinStrings(3, 0,"");
    }
}
