package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x, y, z, count;
        String strone = "beep";
        String strtwo = "buzz";
        String strthree = "zap";
        String strPrint = "";


        for (count = 1; count < 31; count++) {

            // Test if the count is divisible by all three values
            // If it is not, then print the count
            x = count % 5;
            y = count % 8;
            z = count % 12;

                     if (x > 0 & y > 0 & z > 0) {
                        System.out.println(count);
                    }
                    //divisible by 5
                    if (x == 0 & y > 0 & z > 0) {
                        System.out.println(strone);
                     }
                    //divisible by 5 & 8
                    if (x == 0 & y == 0 & z > 0) {
                        System.out.println(strone + strtwo);
                    }
                    // divisible by 8
                    if (x > 0 & y == 0 & z > 0) {
                        System.out.println(strtwo);
                    }
                    // divisible by 12
                    if (x > 0 & y > 0 & z == 0) {
                        System.out.println(strthree);
                    }
                    // divisible by 8 and 12
                    if (x > 0 & y == 0 & z == 0) {
                        System.out.println(strtwo + strthree);
                    }
                    // divisible by 5 and 12
                    if (x == 0 & y > 0 & z == 0) {
                        System.out.println(strone + strthree);
                    }
                    // divisible by 5 and 8 and 12
                    if (x == 0 & y == 0 & z == 0) {
                        System.out.println(strone + strtwo + strthree);
                    }
            }

        System.out.println("Done!");
    }
}