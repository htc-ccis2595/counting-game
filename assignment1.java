class test {
    public static void main(String args[]) {
        int count;
        for (count = 1; count <= 30; count = count + 1)
        {
            if (count % 5 == 0) 
            {
                if (count % 8 == 0)
                {
                    if (count % 12 == 0) System.out.println("beep buzz zap");
                    else System.out.println ("beep buzz");
                }
                else if (count % 12 == 0) System.out.println("beep zap");
                else System.out.println("beep");
            }
            else if (count % 8 == 0)
            {
                if (count % 12 == 0) System.out.println("buzz zap");
                else System.out.println("buzz");
            }
            else if (count % 12 == 0) System.out.println("zap");
            else System.out.println(count);
        }
    }
}