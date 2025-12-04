package com.bpi.day3.M2;

public class SleepExample {

    // Method to check sleep quality
    String sleep(String placeToSleep, int hours) {
        int wellRestedSleepHours = 8;
        String result = null;

        if (hours >= wellRestedSleepHours) {
            result = "I am well rested, I slept at " + placeToSleep;
        } else if (hours < wellRestedSleepHours) {
            result = "I did not sleep well, I slept at " + placeToSleep;
        }

        return result;
    }

    public static void main(String[] args) {
        SleepExample example = new SleepExample();

        // Call the method
        String message1 = example.sleep("bed", 9);
        String message2 = example.sleep("couch", 5);

        // Print results
        System.out.println(message1);
        System.out.println(message2);
    }
}
