import java.util.*;

public class greedy {
    //6.Job question
    // static class Job{
    //     int deadline;
    //     int profit;
    //     int id;

    //     public Job(int i,int d,int p){
    //         id = i;
    //         deadline = d;
    //         profit = p;
    //     }
    // }
    public static void main(String args[]){
        // //1.You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. 
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};

        // //sorting
        // int activities[][] = new int [start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0] = i;
        //     activities[i][1] = start[i];
        //     activities[i][2] = end[i];
        // }
        // //Lambda function -> shortfrom
        // Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        // //End time basis sorted
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // //1st activity
        // maxAct = 1;
        // ans.add(activities[0][0]); //if sorted we use .add(0)
        // int lastEnd = activities[0][2]; //if sorted we use end[0]
        // for(int i=0;i<end.length;i++){
        //     if(activities[i][1]>=lastEnd){
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }

        // }

        // System.out.println("max activities = "+maxAct);
        // for(int i=0;i<ans.size();i++){
        //     System.out.print("A"+ans.get(i)+" ");
        // }
        // System.out.println();

        //2.Given the weights and profits of N items, in the form of {profit, weight} put these items in a knapsack of capacity W to get the maximum total profit in the knapsack. In Fractional Knapsack, we can break items for maximizing the total value of the knapsack.
        // int val[] = {60,100,120};
        // int weight[] = {10,20,30};
        // int W = 50;

        // double ratio[][] = new double[val.length][2];
        // //0th col-idx;1st col-ratio

        // for(int i=0;i<val.length;i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = val[i]/(double)weight[i];
        // }
        // //Asscending order sorting
        // Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        // int capacity = W;
        // int finalVal = 0;

        // for(int i=ratio.length-1;i>=0;i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity>=weight[idx]){
        //         finalVal += val[idx];
        //         capacity -= weight[idx];
        //     }else{
        //         //include fractional
        //         finalVal += (ratio[i][1]*capacity);
        //         capacity = 0;
        //         break;
        //     }
        // }
        // System.out.println("final val = "+finalVal);
        //3.Given an array of n distinct integers. The problem is to find the sum of minimum absolute difference of each array element. For an element x present at index i in the array its minimum absolute difference is calculated as: 
        // int A[] = {1,2,3};
        // int B[] = {2,1,3};

        // Arrays.sort(A);
        // Arrays.sort(B);

        // int minDiff = 0;

        // for(int i=0;i<A.length;i++){
        //     minDiff += Math.abs(A[i]-B[i]);
        // }
        // System.out.println("min absolute diff is = "+minDiff);
        //4.You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. Find the longest chain which can be formed from a given set of pairs. 
        // int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        // Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        // int chainLen = 1;
        // int chainEnd = pairs[0][1];

        // for(int i=1;i<pairs.length;i++){
        //     if(pairs[i][0]>chainEnd){
        //         chainLen++;
        //         chainEnd = pairs[i][1];
        //     }
        // }
        // System.out.println("max length of chain = "+chainLen);
        
        //5.Given a value V, if we want to make a change for V Rs, and we have an infinite supply of each of the denominations in Indian currency, i.e., we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, what is the minimum number of coins and/or notes needed to make the change.
        // Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        // Arrays.sort(coins,Comparator.reverseOrder());

        // int count = 0;
        // int amount = 590;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i=0;i<coins.length;i++){
        //     if(coins[i]<=amount){
        //         while(coins[i]<=amount){
        //             count++;
        //             ans.add(coins[i]);
        //             amount -= coins[i];
        //         }
        //     }
        // }

        // System.out.println("Total min coins used : "+ count);

        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i)+" ");
        // }
        // System.out.println();

        //6.Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.
        // int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        // ArrayList<Job> jobs = new ArrayList<>();

        // for(int i=0;i<jobsInfo.length;i++){
        //     jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        // }

        // Collections.sort(jobs,(a,b) -> b.profit-a.profit); //decending order profit

        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;
        // for(int i=0;i<jobs.size();i++){
        //     Job curr = jobs.get(i);
        //     if(curr.deadline>time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }
        // //Print Seq
        // System.out.println("max jobs = "+seq.size());
        // for(int i=0;i<seq.size();i++){
        //     System.out.print(seq.get(i)+" ");
        // }
        // System.out.println();

        //7.You have one chocolate bar that consists of some chunks. Each chunk has its own sweetness given by the array sweetness.
        // You want to share the chocolate with your K friends so you start cutting the chocolate bar into K+1 pieces using K cuts, each piece consists of some consecutive chunks.
        // Being generous, you will eat the piece with the minimum total sweetness and give the other pieces to your friends.
        // Find the maximum total sweetness of the piece you can get by cutting the chocolate bar optimally.
    
        int n=4,m=6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost = 0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Min cuts "+ cost);
    
    
    }
    
}
