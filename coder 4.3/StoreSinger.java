class StoreSinger
{
	String[] singerName;
	int index=0;
	
	StoreSinger(String[] singerName)
	{
		this.singerName=singerName;
	}
	
	void getSingerName(String singer)
	{
		System.out.println("executing getSingerName in StoreSinger."+"\nname:"+singer);
	
		if(singerName!=null)
		{
			int size=this.singerName.length-1;
			System.out.println("the max items of the array:"+size);
			
			if(this.index<=size)
			{
				this.singerName[index]=singer;
				System.out.println("current index: "+this.index);
				this.index++;
				System.out.println("singer name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, singer names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the singer name should not be null");
		}
	}
}