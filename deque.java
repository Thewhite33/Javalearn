import java.util.*;
public class deque {
    static class Stack{
        Deque<Integer> d = new LinkedList<>();
        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
    public static void main (String args[]){
        // Deque<Integer> q = new LinkedList<>();
        // q.addFirst(1);
        // q.addFirst(2);
        // System.out.println(q);
        // q.removeFirst();
        // System.out.println(q);

        // //getFirst and getLast


        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+s.peek());
    }
}
