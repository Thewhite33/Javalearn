import java.util.*;
public class hasmap {
    //Valid anagram
        public static boolean isAnangram(String s,String t){
            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }

            for(int i=0;i<t.length();i++){
                char ch = t.charAt(i);
                if(map.get(ch)!=null){
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }else{
                        map.put(ch, map.get(ch)-1);
                    }
                }else{
                    return false;
                }
            }
            return map.isEmpty();
        }
    public static void main(String args[]){

        //Majority element 
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            //same as if else
            //map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if(map.get(key)>arr.length/3){
                //System.out.println(key);
            }
        }

        //Create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",5);
        hm.put("Nepal",6);

        //System.out.println(hm);

        //Get
        int popu = hm.get("India");
        //System.out.println(popu);

        //ContainsKey
        //System.out.println(hm.containsKey("India"));

        //Remove
        //System.out.println(hm.remove("China"));
        
        //Size
        //System.out.println(hm.size());

        //Is empty
        //hm.clear();
        //System.out.println(hm.isEmpty());

        //Iteration
        //hm.entrySet()
        Set<String> keys = hm.keySet();
        //System.out.println(keys);

        for (String k : keys) { 
            //System.out.println("Key="+k+",value= "+hm.get(k));
        
        // TreeMap<String,Integer> tm = new TreeMap<>();
        // tm.put("India", 50);
        // tm.put("China", 150);
        // tm.put("Nepal", 60);

        // System.out.println(tm);


        
        String s = "race";
        String t = "care";
        System.out.println(isAnangram(s, t));

        }
    

        
    }
}
