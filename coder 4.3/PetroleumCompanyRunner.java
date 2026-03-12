class PetroleumCompanyRunner{
	
	public static void main (String[] values)
	{
		String[] names=new String[5];
		PetroleumCompany petroleumCompany=new PetroleumCompany(names);
		
		petroleumCompany.display("Bharath petrolium");
		petroleumCompany.display("Hindusthan petrolium");
		petroleumCompany.display("Jio");
		petroleumCompany.display("Relence");
		petroleumCompany.display("Shell");
	}
}