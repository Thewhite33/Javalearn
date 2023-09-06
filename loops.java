import java.util.*;
public class loops{
    public static void main(String args[]){
        //while
        // int counter = 0;
        // while(counter<10){
        //     System.out.println("Binod");
        //     counter++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number till you wanna print: ");
        // int n = sc.nextInt();
        // int a = 1;
        // while(a<=n){
        //     System.out.println(a);
        //     a++;
        // }

        // int counter = 1;
        // while(counter<=10){
        //     System.out.println(counter);
        //     counter++;
        // }

        //For loop
        // for(int i =1;i<=10;i++){
        //     System.out.println("Binod");
        // }
        //Star pattern for loop
        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }
        //While loop
        // int i =1;
        // while(i<=4){
        //     System.out.println("****");
        //     i++;
        // }

        //Sum of first n natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number you want to get sum: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1;i<=n;i++){
        //     sum = sum+i;
            
        // }
        // System.out.println(sum);

        //Do while loop
        // int i= 1;
        // do{
        //     System.out.println("Binod");
        //     i++;
        // }while(i<=10); //it also work one time if condition is false

        //Print reverse
        int n = 10899;
        while(n>0){
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
        System.out.println(n);

    }
}
