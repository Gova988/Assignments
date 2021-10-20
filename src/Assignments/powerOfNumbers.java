package Assignments;

public class powerOfNumbers {
		static boolean checkNumber(int n)
		{
			if (n == 0)
				return false;

			while (n != 1) {
				if (n % 2 != 0)
					return false;
				n = n / 2;
			}
			return true;
		}

		public static void main(String args[])
		{
			if (checkNumber(64))
				System.out.println("squre of number is correct");
			else
				System.out.println("square of number is not correct");

		
		}
	}

