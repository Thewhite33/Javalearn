import java.util.*;
public class stack {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> sr = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            sr.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!sr.isEmpty()){
            char curr = sr.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);
        }
    }
    // static class Node{
    //         int data;
    //         Node next;
    //         Node(int data){
    //             this.data = data;
    //             this.next = null;
    //         }
    // }
    // static class Stack{
    //     // //Using Array list
    //     // static ArrayList<Integer> list = new ArrayList<>();
    //     // public static boolean isEmpty(){
    //     //     return list.size() == 0;
    //     // }

    //     // //Push
    //     // public static void push(int data){
    //     //     list.add(data);
    //     // }
    //     // //Pop
    //     // public static int pop(){
    //     //     if(isEmpty()){
    //     //         return -1;
    //     //     }
    //     //     int top = list.get(list.size()-1);
    //     //     list.remove(list.size()-1);
    //     //     return top;
    //     // }

    //     // //Peek
    //     // public static int peek(){
    //     //     if(isEmpty()){
    //     //         return -1;
    //     //     }
    //     //     return list.get(list.size()-1);
    //     // }
        


    //     //Using LinkedList
    //     //Empty
    //     static Node head = null;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }
    //     //Push
    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
            
    //     }
    //     //Pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }
    //     //Peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }

    //}
    public static void main (String args[]){

        // int stocks[]  = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks,span);

        // for(int i=0;i<span.length;i++){
        //     System.out.println(span[i]+" ");
        // }

        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //While loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //If-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //Push in s
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
        //Stack s = new Stack();
        // Stack<Integer> s = new Stack<>(); //Using JCF
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // pushAtBottom(s, 4);
        // System.out.println(s);

        // String str = "Hello";
        // System.out.println(reverseString(str));

        // reverseStack(s);
        // printStack(s);
    }
}
