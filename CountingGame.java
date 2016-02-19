/** 
This Program will play a word game where a certain word 
will print depending on what the # is divisible by. 
Melissa Custard  
*/

 
public class CountingGame
{
	public static void main(String[]args)
	{ 
		String beep = "beep"; // 5
		String buzz = "buzz"; // 8
		String zap = "zap"; // 12
	
		for (int i = 1; i <= 30; i++)
		
		{
      
         if (i%12 == 0 && i%8 == 0 && i%5 == 0)
			{
			System.out.println (zap + buzz + beep);
         }
 
         else if (i%12 == 0 && i%8 == 0)
			{
			System.out.println (zap + buzz);
         }

         else if (i%8 == 0 && i%5 == 0)
			{
			System.out.println (buzz + beep);
         }
         
         else if (i%12 == 0 && i%5 == 0)
			{
			System.out.println (zap + beep);
         }
         
			else if (i %12 == 0)
			{
			System.out.println (zap);
			}
			
			else if (i % 8 == 0)
			{
			System.out.println (buzz);
			}
			
			else if (i % 5 == 0)
			{
			System.out.println (beep);
         }
  
         else  
         {
         System.out.println (i);
			}
		}
		
			
	}
}