class  PetroleumCompany{
	
	String[] names;
	int currentIndex=0;
	PetroleumCompany(String[]names)
	{
		this.names=names;
	}
     
    void display(String companyName){
		System.out.println("Exectuing the PetroleumCompany Names:");
		System.out.println("Names:"+this.names);
		
		if (names!=null)
		{
			int size=this.names.length-1;
			System.out.println("the Max Items of the Array");
			if(this.index<=size)
			{
				this.names[index]=companyName;
				System.out.println("Current Name:"+this.currentIndex);
				this.index++;
				System.out.println("Company Name is Saved Next name:"+this.currentIndex);
				
			}
			else
			{
				System.out.println("Soory the Company Name has fulled it can't be Stored ");
			}
			
		}
		else{
			System.out.println("the Company Name can't be Null");
		}
	}
	
}