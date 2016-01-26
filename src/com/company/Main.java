package com.company;

public class Main {

    public static void main(String[] args) {
		for (int i=1; i<=30;i++) {

			if ( (i%5)==0 )
				System.out.print(" beep");
			else if ( (i%8)==0 )
				System.out.print(" buzz");
			else if ( (i%12)==0 )
				System.out.print(" zap");
			else
			    System.out.print(i);
			System.out.println();
		}
	}
}
