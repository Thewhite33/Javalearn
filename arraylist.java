import java.util.*;
public class arraylist {
    public static void swap(ArrayList<Integer> list,int id1,int id2){
        int temp = list.get(id1);
        list.set(id1,list.get(id2));
        list.set(id2,temp);


    }
    public static void main(String args[]){
        //definig arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);

        //System.out.println(list);
        //System.out.println(list.get(2));
        //list.remove(2);
        //list.set(0,20);
        //System.out.println(list.contains(3));
        //System.out.println(list);

        //Reverse print
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        
        //Get the max no.
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max<list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);
        //swapping
        // int id1 = 1,id2 = 2;
        // System.out.println(list);
        // swap(list,id1,id2);
        // System.out.println(list);

        //Sorting array list
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
