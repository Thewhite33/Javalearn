import java.util.*;
public class stacks2 {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                else if((s.peek() == '(' && ch==')') 
                || (s.peek() == '{' && ch=='}')
                || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //closing
            if(ch==')'){
                int cnt = 0;
                while(s.peek()!= '('){
                    s.pop();
                    cnt++;
                }
                if(cnt<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))";
        String str2 = "(a-b)";
        //String str = "(({})[]";
        System.out.println(isDuplicate(str2));
    }
}
