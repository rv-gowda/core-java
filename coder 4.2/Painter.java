class Painter{

	String[] name;
	Paint[] paint;

	Painter(String[] name, Paint[] paint){
		this.name = name;
		this.paint = paint;
	}

	void display(){
		System.out.println("Executing the display method in Painter.");

		if(this.name != null){
			System.out.println("Total number of painters: " + this.name.length);
			for(String name : this.name){
				System.out.println("Painter name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.paint != null){
			System.out.println("Total number of paints: " + this.paint.length);
			for(Paint paints : this.paint){
				paints.getPaint();
			}
		}else{
			System.out.println("The paint is null.");
		}
	}
}