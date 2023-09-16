import java.util.*;
public class arraylist {
    // public static void swap(ArrayList<Integer> list,int id1,int id2){
    //     int temp = list.get(id1);
    //     list.set(id1,list.get(id2));
    //     list.set(id2,temp);
    // }
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=0;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j-i;
                int currWater = ht*wd;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    //2 pointer
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }

    public static boolean pairSum1(ArrayList<Integer> height,int target){
        for(int i = 0;i<height.size();i++){
            for(int j=0;j<height.size();j++){
                if(height.get(i)+height.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    //2 pointer 
    public static boolean pairSum2(ArrayList<Integer> height,int target){
        int lp = 0;
        int rp = height.size()-1;

        while(lp!=rp){
            if(height.get(lp)+height.get(rp)==target){
                return true;
            }
            if(height.get(lp)+height.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }

    public static boolean pairSum3(ArrayList<Integer> height,int target){
        int bp = -1;
        int n = height.size();
        for(int i=0;i<height.size();i++){
            if(height.get(i)>height.get(i+1)){
                bp =i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(height.get(lp)+height.get(rp) == target){
                return true;
            }
            if(height.get(lp)+height.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }

    public static void main(String args[]){
        //definig arraylist
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        // height.add(7);
        // height.add(8);
        // height.add(9);

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
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);lis.add(2);
        mainList.add(lis);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        mainList.add(list2);

        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        //System.out.println("The heigth is : "+storeWater2(height));
        System.out.println(pairSum3(height, 100));
        

    }
}
