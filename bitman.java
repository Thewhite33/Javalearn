import java.util.*;
public class bitman{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearIbits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return(n&(n-1))==0;
    }
    public static int countBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        // System.out.println(5|6);
        // System.out.println(5&6); //Use single &
        // System.out.println(5^6);
        // System.out.println(~0); //Interesting
        // System.out.println(5<<2);
        // System.out.println(6>>1);

        //oddOrEven(3);
        //System.out.println(getIthBit(10, 2));
        //System.out.println(setIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        //System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearIBits(15, 2));
        //System.out.println(clearIbits(10, 2,4));
        //System.out.println(isPowerOfTwo(9));
        //System.out.println(countBit(100));
        System.out.println(fastExpo(2, 100));
    
    
    }
}
