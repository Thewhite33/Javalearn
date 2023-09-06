import java.util.Scanner;

public class arrays{

    public static void update(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int ls(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; //-Infinity

        for(int i =0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        // System.out.println(smallest);
        return largest;
    }
    //Binary Search
    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    //Reversing an array
    public static void rev(int numbers[]){
        int start = 0, last = numbers.length-1;

        while(start<last){
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
        //return rev(numbers);
    }
    //Paring Array
    public static void pairarray(int numbers[]){
        int tp = 0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }System.out.println("Total Pair: "+tp);
    }

    //Subarrays (Find Sum of subarrays)
    // public static void subaaray(int numbers[]){
    //     //int sum = 0;
    //     for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         //int t = numbers[start];
    //         for(int j=1;j<numbers.length;j++){
    //             int end = j;
    //             //int c = numbers[end];
                
    //             for(int k=start;k<=end;k++){
    //                 System.out.print(numbers[k]+" ");
    //                 //int sum = t+c;
    //                 //System.out.println("Sum of the array is : "+sum);
    //             }
    //             System.out.println();
                
    //         }
    //         System.out.println();
    //         //System.out.println(t);
    //     }
    // }

    //Max Subarray Sum
    // public static void maxsubaaray(int numbers[]){
    //     //int sum = 0;
    //     int curr = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];
    //     for(int c=1;c<prefix.length;c++){
    //         prefix[c] = prefix[c-1] + numbers[c];
    //     }



    //     for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         //int t = numbers[start];
    //         for(int j=1;j<numbers.length;j++){
    //             int end = j;
    //             curr = start ==0 ? prefix[end]prefix[end]-prefix[start-1];
    //             //int c = numbers[end];
                
    //             // for(int k=start;k<=end;k++){
    //             //     System.out.print(numbers[k]+" ");
    //             //     curr +=numbers[k];
    //                 //int sum = t+c;
    //                 //System.out.println("Sum of the array is : "+sum);
    //             }
    //             System.out.println(curr);
    //             if(maxSum<curr){
    //                 maxSum=curr;
    //             }
                
    //         }
    //         System.out.println("Maximum sum is "+maxSum);
    //         //System.out.println(t);
    //     }
    // }

    //Kades Rule
    public static void kades(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<numbers.length;i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subarray sum is:"+ms);
    }

    //Trapping Rainwater
    public static int trappedRainwater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];

        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);

        }
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-height[i];
        }

        return trappedWater;

    }

    //Buy and Sell Stocks
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);

            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    
    public static void main(String args[]){
        //int marks[] = new int[50];

        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // System.out.println(marks[0]); 
        //int marks[] = {97,98,99};
        // update(marks);
        // for(int i =0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println();

        //Linear Search
        // int numbers[] = {23,445,33,10,34,55};
        // int key = 23;
        
        // int index = ls(numbers, key);
        // if(index==-1){
        //     System.out.println("Not found");
        // }
        // else{
        //     System.out.println("Found at "+ index);
        // }

        //Largest Number
        // int numbers[] = {2,4,6,8,10,12,14};
        // int key = 1;
        // System.out.println(getLargest(numbers));
        //System.out.println(binarySearch(numbers, key));
        //Swapping Concept
        // int numbers[] = {2,4,6,8,10,12,14};
        // rev(numbers);
        // for(int i=0;i<numbers.length;i++){
        //     System.out.println(numbers[i]+" ");
        // }
        // System.out.println();

        //Pairing array
        // int numbers[] = {2,4,6,8,10,12,14};
        // pairarray(numbers);

        //Subarrays
        // int numbers[] = {2,4,6,8,10,12,14};
        // subaaray(numbers);

        // int numbers[] = {2,4,6,8,10};
        // maxsubaaray(numbers);

        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // kades(numbers);

        //Trapped Water

        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedRainwater(height));

        //Buy n Sell Stocks
        int prices[] = {7,1,5,3,6,4};
        System.out.println(stocks(prices));

    }

}
