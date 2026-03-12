class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int num = 153;
		int original = num;
		int sum = 0;

		while(num > 0)
		{
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		if(sum == original)
		{
			System.out.println(original + " is Armstrong Number");
		}
		else
		{
			System.out.println(original + " is Not Armstrong Number");
		}
	}
}