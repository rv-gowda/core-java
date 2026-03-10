class Carpenter{

	String[] name;
	Tool[] tool;

	Carpenter(String[] name, Tool[] tool){
		this.name = name;
		this.tool = tool;
	}

	void display(){
		System.out.println("Executing the display method in Carpenter.");

		if(this.name != null){
			System.out.println("Total number of carpenters: " + this.name.length);
			for(String name : this.name){
				System.out.println("Carpenter name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.tool != null){
			System.out.println("Total number of tools: " + this.tool.length);
			for(Tool tools : this.tool){
				tools.getTool();
			}
		}else{
			System.out.println("The tool is null.");
		}
	}
}