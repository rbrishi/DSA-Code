package week_13_AdvancedSortingAlgo_and_GreedyProgramming;

import java.util.Arrays;

public class Q2_Fractional_Knapsack {

    //make custom comparator
    static class Item {
        int wt, value;

        public Item(int value, int wt) {
            this.wt = wt;
            this.value = value;
        }
    }

    static double fractionalKnapsack(Item items[], int capacity) {
        Arrays.sort(items, (o1, o2) -> {
            double ratioThis = (double)o1.value / o1.wt;
            double ratioThat = (double)o2.value / o2.wt;

            if (ratioThis > ratioThat) return -1;
            if(ratioThat > ratioThis) return 1;
            return 0;
        });

        double profit = 0;

        for(int i = 0; i<items.length; i++) {
            if(items[i].wt <= capacity) {
                profit += items[i].value;
                capacity -= items[i].wt;
            } else {
                double fractionProfit = (double) (items[i].value * capacity) /items[i].wt;
                profit += fractionProfit;
                break;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Item i1 = new Item(60, 10);
        Item i2 = new Item(100, 20);
        Item i3 = new Item(120, 30);

        Item items[] = {i1, i2, i3};

        int capacity = 50;

        System.out.println(fractionalKnapsack(items, capacity));
    }
}
