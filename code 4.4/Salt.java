class Salt{
	String name;
	String formula;
	String color;
	boolean soluble;
	boolean edible;
	int weight;

	Salt(String name,String formula,String color,boolean soluble,boolean edible,int weight){
		this.name=name;
		this.formula=formula;
		this.color=color;
		this.soluble=soluble;
		this.edible=edible;
		this.weight=weight;
	}

	void saltInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Formula:"+this.formula);
		System.out.println("Color:"+this.color);
		System.out.println("Soluble:"+this.soluble);
		System.out.println("Edible:"+this.edible);
		System.out.println("Weight:"+this.weight);
	}
}