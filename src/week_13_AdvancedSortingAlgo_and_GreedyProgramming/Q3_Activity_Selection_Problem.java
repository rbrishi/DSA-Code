package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

import java.util.Arrays;

public class Q3_Activity_Selection_Problem {

    static class Activity{
        int start, finish;

        public Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void main(String[] args) {
        int start[] = {10,12,20};
        int finish[] = {20,25,30};
        System.out.println(activitySelection(start,finish));
    }
    static int activitySelection(int start[], int finish[]){
        int n = start.length;
        Activity activities[] = new Activity[n];

        for (int i = 0; i < n; i++){
            activities[i] = new Activity(start[i], finish[i]);
        }
        Arrays.sort(activities, ((o1, o2) -> o1.finish - o2.finish));
        int count = 1;
        int curFinish = activities[0].finish;

        for(int i = 1; i < n; i++){
            if(activities[i].start >= curFinish){
                count++;
                curFinish = activities[i].finish;
            }
        }
        return count;
    }
}
