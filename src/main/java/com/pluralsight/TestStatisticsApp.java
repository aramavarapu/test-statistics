package com.pluralsight;

public class TestStatisticsApp {
    public static void main(String[] args) {

        int[] scores = {22, 80, 88, 77, 10, 11, 75, 90, 100, 98};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > high) {
                high = scores[i];
            }
            if (scores[i] < low) {
                low = scores[i];
            }



    }
        double average = (double) sum / scores.length;

        System.out.printf("Average: %.2f\n", average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);


    }
}
