public class Counting_Game {
    public static void main(String arg[]) {
        /*Count from 1 to 30.
         1. If a number is divisible by 5, then print "beep" instead of the number
         2. If a number is divisible by 8, then print "buzz" instead of the number
         3. If a number is divisible by 12, then print "zap" instead of the number
         */

        for(int i = 1; i <= 30; i++) {
            boolean div5, div8, div12;
            if(i % 5 == 0) div5 = true;
            else div5 = false;
            
            if(i % 8 == 0) div8 = true;
            else div8 = false;
            
            if(i % 12 == 0) div12 = true;
            else div12 = false;
            
            if (div5 | div8 | div12) {
                if(div5) System.out.print("beep ");
                if(div8) System.out.print("buzz ");
                if(div12)System.out.print("zap");
                System.out.println();
            } 
            else System.out.println(i);
    

        }
    }
}


