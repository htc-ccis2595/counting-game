package edu.htc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        for (i=1; i<=30; i++)
        {
            if(i%5 ==0) {
                System.out.print("beep");
                if (i % 8 == 0) {
                    System.out.print(" buzz");
                     if (i % 12 == 0) {
                        System.out.print(" zap");
                    }
                }
                System.out.println();
            }
            else if (i%8 ==0) {
                System.out.print("buzz");
                if (i % 12 == 0) {
                    System.out.print(" zap");
                }
                System.out.println();
            }
            else if (i%12 ==0){
                System.out.print("zap");
                System.out.println();
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}
