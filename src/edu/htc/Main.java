package edu.htc;

public class Main
{

    public static void main(String[] args) {
        int counter;

        for (counter = 1; counter <= 30; counter++) {

            {
                if ((counter % 12 == 0) &  (counter % 8 == 0) )
                    System.out.println(counter + " ZAP BUZZ");
                else if (counter % 5 == 0)
                    System.out.println(counter + " BEEP");
                else if (counter % 8 == 0)
                    System.out.println(counter + " BUZZ");
                else if (counter % 12 == 0)
                    System.out.println(counter + " FUZZ");

                else
                    System.out.println(counter);
            }


        }

    }
}
