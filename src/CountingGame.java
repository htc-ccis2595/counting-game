/**
 * Created by Owner on 1/24/2016.
 */
public class CountingGame {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=30; i++) {
            if (i%5==0) {
                System.out.println("beep");
            }
            if (i%8==0) {
                System.out.println("buzz");
            }
            if (i%12==0) {
                System.out.println("zap");
            }
            if(i%5!=0 && i%8!=0 && i%12!=0)
            {
                System.out.println(i);
            }
        }

    }
}
