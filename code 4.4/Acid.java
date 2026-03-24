class Acid{
	String name;
	String formula;
	String type;
	boolean strong;
	boolean corrosive;
	int phValue;

	Acid(String name,String formula,String type,boolean strong,boolean corrosive,int phValue){
		this.name=name;
		this.formula=formula;
		this.type=type;
		this.strong=strong;
		this.corrosive=corrosive;
		this.phValue=phValue;
	}

	void acidInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Formula:"+this.formula);
		System.out.println("Type:"+this.type);
		System.out.println("Strong:"+this.strong);
		System.out.println("Corrosive:"+this.corrosive);
		System.out.println("pH Value:"+this.phValue);
	}
}