import java.util.*;

public class stri{
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String st){
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i));
                return false;
            

        }
        return true;
    }
    public static int getShortestPath(String path){
        int x = 0,y=0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }

        }
        int x2 = (x*x);
        int y2 = (y*y);
        return (int)Math.sqrt(x2 + y2);

    }
    public static String subString(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String st3){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(st3.charAt(0));
        sb.append(ch);

        for(int i=1;i<st3.length();i++){
            if(st3.charAt(i)== ' ' && i<st3.length()-1){
                sb.append(st3.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st3.charAt(i)));

            }else{
                sb.append(st3.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String st4){
        String newStr = "";

        for(int i=0;i<st4.length();i++){
            Integer count = 1;
            while(i<st4.length()-1 && st4.charAt(i)==st4.charAt(i+1)){
                count++;
                i++;
            }
            newStr += (st4.charAt(i));
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        char arr[] = {'a','b','c'};
        String str = "abcd";
        String st2 = new String("xyz");
        //System.out.println(st2);

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        String fullName = "Tonny Stark";
        //System.out.println(fullName.length());

        //Concatenation
        String firstName = "Tony";
        String lastName = "Strak";
        String fn = firstName + " "+lastName;
        //System.out.println(fn);

        //printLetter(fn);

        String st = "ram";
        //System.out.println(isPalindrome(st));
        String path = "NS";
        //System.out.println(getPath(path));

        String stu = "HelloWorld";
        //System.out.println(subString(stu, 0, 5));
        // String fruits[] = {"apple","mango","banana"};

        // String largest = fruits[0];
        // for (int i=0;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // StringBuilder sb  = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);  //O(26)
        // }
        // System.out.println(sb);

        String st3 = "hi I am Rohit";
        //System.out.println(toUpperCase(st3));

        String st4 = "aaabbcccdd";
        System.out.println(compress(st4));
    }
}