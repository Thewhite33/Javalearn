import java.util.*;
public class conditional{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18){
        //     System.out.println("You can vote");
        // }
        // if (age>13 && age<18){
        //     System.out.println("You are teenager");
        // }
        // else{
        //     System.out.println("You cannot vote");
        // }

        //Largest of two numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enetr 1st no. : ");
        // int a = sc.nextInt();
        // System.out.print("Enter 2nd no.");
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("1st no. is greater");
        // }
        // else{
        //     System.out.println("2nd no. is greater");
        // }

        //Odd or Even
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number to check : ");
        // int no = sc.nextInt();
        // if(no%2 == 0){
        //     System.out.println("Its a even no");
        // }
        // else{
        //     System.out.println("Its a odd no");
        // }

        //Income tax calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income: ");
        // int income = sc.nextInt();
        // if (income<500000){
        //     System.out.println("You have to pay no tax");
        // }
        // else if(income>=500000 && income<1000000){
        //     System.out.println("You have to pay tax of : " + income*0.2);
        // }
        // else{
        //     System.out.println("You have to pay tax of : " + income*0.3);
        // }

        //Largest of three number
        // int A = 1, B = 3, C = 6;
        // if((A>=B) && (A>=C)){
        //     System.out.println(A);
        // }
        // else if(B>=C){
        //     System.out.println(B);
        // }
        // else{
        //     System.out.println("C is largest");
        // }

        //Ternary Operator
        // int number = 5;
        // String type = ((number%2) == 0) ? "even":"odd";
        // System.out.println(type);

        //Switch Statement
        // int number = 3;
        // switch(number){
        //     case 1: System.out.println("Sa");
        //                 break;
        //     case 2 : System.out.println("nta");
        //                 break;
        //     case 3 : System.out.println("nota");
        //                 break;
        //     default : System.out.println("Gone");
        // }

        //Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        int operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Wrong");
            

        }
    }
}