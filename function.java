import java.util.*;
public class function{
    public static void printHello(){
        System.out.println("Hello World !");
    }
    public static  int calSum(int a,int b){ //parameters
        int sum = a+b;
        return sum;
        
    }
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
        System.out.println("A is "+a);
        System.out.println("B is "+b);
    }
    public static int multiply(int a,int b){
            int product = a*b;
            return product;
        }
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n,int r){
        int fn = fac(n);
        int fr = fac(r);
        int fnmr = fac(n-r);

        int binCoeff = fn/(fr*fnmr);
        return binCoeff;
    }
    //Fuction Overloading

    public static float sum(float a,float b){
        return a + b;
    }
    // public static int sum(float a,float b,float c){
    //     return a + b + c;
    // }

    //Check if a number is prime or not
    public static boolean prime(int d){
        //Corner cases -- 1
        if (d == 2){
            return true;
        }
        boolean prime = true;
        for(int i=2;i<=Math.sqrt(d);i++){
            if(d%i == 0){
                prime = false;
                break;
            }
            
            
        }
        return prime;
    }

    //Prime in range
    public static void prRn(int v){
        for(int i=2; i<=v;i++){
            if(prime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
    }

    public static void binConvert(int binNum){
        int myn = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int ld = binNum%10;
            decNum = decNum + ld* (int)Math.pow(2, pow);

            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + myn + " is " + decNum);
    }

    //Dec to Bin
    public static void dtb(int m){
        int an = m;
        int pow = 0;
        int binum = 0;

        while(m>0){
            int rem = m%2;
            binum = binum + (rem*(int)Math.pow(10, pow));
            pow++;
            m = m/2;
        }
        System.out.println("Binary form of "+ an +" is " +binum);
    }

    public static void main(String args[]){
        //printHello();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calSum(a, b); //arguments
        // System.out.println("Sum is: "+sum);
        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // int a =3;
        // int b=5;
        // int pr = multiply(a, b);
        // System.out.println(pr);
        // int v = fac(0);
        // System.out.println(v);
        // System.out.println(binCoeff(5, 4));

        //System.out.println(sum(3.3f,2.8f));

        //System.out.println(prime(15));
        //prRn(100);

        //binConvert(10111008);

        dtb(5655);

        

        
        

    }
}