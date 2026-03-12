class StoreTwoWheeler
{
	String[] modelName;
	int index=0;
	
	StoreTwoWheeler(String[] modelName)
	{
		this.modelName=modelName;
	}
	
	void getModelName(String model)
	{
		System.out.println("executing getModelName in StoreTwoWheeler."+"\nname:"+model);
	
		if(modelName!=null)
		{
			int size=this.modelName.length-1;
			System.out.println("the max items of the array:"+size);
			
			if(this.index<=size)
			{
				this.modelName[index]=model;
				System.out.println("current index: "+this.index);
				this.index++;
				System.out.println("model name saved,next index: "+this.index);
			}
			else
			{
				System.out.println("sorry, model names are filled, we cant store");
			}
		}
		else
		{
			System.out.println("the model name should not be null");
		}
	}
}