import java.util.Scanner;
public class Array1
	{

		public static void main(String[] args)
			{
				doExcercise1();
				doExcercise2();
				doExcercise3();
				doExcercise4();	
				doExcercise5();
				doExcercise6();
				doExcercise7();
			}
		
		public static void doExcercise1()
			{
			String[] array1 = {"Bob", "Fred", "Frank", "Joe", "Heidi"};
			System.out.println(array1[2]);
			}
		
		public static void doExcercise2()
			{
			int[] array2 = {1, 5, 7, 3, 8};
			System.out.println(array2[4]);
			}
		
		public static void doExcercise3()
			{
			int[] array2 = {1, 5, 7, 3, 8};
			for (int i = 0; i < array2.length; i++)
				{
				System.out.println(array2[i]);
				}
			}
		
		public static void doExcercise4()
			{
			double[] array2 = {1, 5, 7, 3, 8};
			double sum = 0;
			for (int i = 0; i < array2.length; i++)
				{
				sum = sum + array2[i];
				}
			System.out.println(sum/array2.length);
			}
		
		public static void doExcercise5()
			{
			int[] array3 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
			for (int i = 0; i < array3.length; i++)
				{
				System.out.println(array3[i]*array3[i]);
				}
			}
		
		public static void doExcercise6()
			{
			String[] array4 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			
			System.out.println("Say a number between 1-12 and i will tell you which month it corresponds with.");
			Scanner userInput = new Scanner(System.in);
			int month = userInput.nextInt();
			System.out.println(array4[month-1]);
			}
		
		public static void doExcercise7()
			{
			String ranks[] = {"king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
			String suits[] = {"spades", "clubs", "diamonds", "hearts"};
			int r = (int)(Math.random()*13);
			int s = (int)(Math.random()*4);
			System.out.println(ranks[r] + " of " + suits[s]);
			}

	}
