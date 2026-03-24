class Profile{
	String name;
	int age;
	String email;
	String phone;
	String address;
	String profession;

	Profile(String name,int age,String email,String phone,String address,String profession){
		this.name=name;
		this.age=age;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.profession=profession;
	}

	void profileInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Email:"+this.email);
		System.out.println("Phone:"+this.phone);
		System.out.println("Address:"+this.address);
		System.out.println("Profession:"+this.profession);
	}
}