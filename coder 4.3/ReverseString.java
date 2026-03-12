class ReverseString
{
	public static void main(String[] args)
	{
		String name = "Java";
		String reverse = "";

		for(int i=name.length()-1; i>=0; i--)
		{
			reverse = reverse + name.charAt(i);
		}

		System.out.println("Original String: " + name);
		System.out.println("Reversed String: " + reverse);
	}
}