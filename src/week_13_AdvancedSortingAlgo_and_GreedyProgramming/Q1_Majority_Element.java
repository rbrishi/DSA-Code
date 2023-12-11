package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

public class Q1_Majority_Element {
    public static void main(String[] args) {
        int a[] = {3,3,4,2,4,4,2,4,4};
        System.out.println(majorityElement(a));
    }

    //Moore's Voting Algorithm
    static int majorityElement(int a[]){
        int count = 1;
        int majority = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] == majority){
                count++;
            }else {
                count--;
            }
            if(count == 0){
                majority = a[i]; //update majority
                count = 1;
            }
        }
        int freq = 0;
        for(int e : a){
            if(e == majority) freq++;
        }
        return freq > a.length/2 ? majority : -1;
    }
}


