package edu.htc;

public class Counting {

    public static void main(String[] args) {
        int count;

        for (count = 1; count <= 30; count = count + 1) {
            if (count % 5 == 0) {
                System.out.println("Beep");
            }
            else if (count % 12 == 0 && count % 8 == 0) {
                System.out.println("Zap Buzz");
            }

            else if (count % 8 == 0) {
                System.out.println("Buzz");
            }
            else if (count % 12 == 0) {
                System.out.println("Zap");
            }



            else if (count % 5 == 0 && count % 8 == 0) {
                System.out.println("Buzz Beep");
            }

            else if (count % 5 == 0 && count % 12 == 0) {
                System.out.println("Beep Zap");
            }

             else {
                System.out.println("Number count: " + count);
            }
        }
    }
}