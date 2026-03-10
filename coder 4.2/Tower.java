class Tower{

	String[] name;
	Floor[] floor;

	Tower(String[] name, Floor[] floor){
		this.name = name;
		this.floor = floor;
	}

	void display(){
		System.out.println("Executing the display method in Tower.");

		if(this.name != null){
			System.out.println("Total number of towers: " + this.name.length);
			for(String name : this.name){
				System.out.println("Tower name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.floor != null){
			System.out.println("Total number of floors: " + this.floor.length);
			for(Floor floors : this.floor){
				floors.getFloor();
			}
		}else{
			System.out.println("The floor is null.");
		}
	}
}