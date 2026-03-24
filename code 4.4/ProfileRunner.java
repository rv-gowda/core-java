class ProfileRunner{
	public static void main(String[] args){

		Profile profile1=new Profile("Rahul",22,"rahul@gmail.com","9876543210","Bangalore","Engineer");
		Profile profile2=new Profile("Amit",25,"amit@gmail.com","9876501234","Delhi","Doctor");
		Profile profile3=new Profile("Sneha",21,"sneha@gmail.com","9876512345","Mysore","Student");
		Profile profile4=new Profile("Kiran",28,"kiran@gmail.com","9876523456","Hyderabad","Manager");
		Profile profile5=new Profile("Priya",23,"priya@gmail.com","9876534567","Chennai","Designer");
		Profile profile6=new Profile("Arjun",26,"arjun@gmail.com","9876545678","Pune","Developer");
		Profile profile7=new Profile("Meena",24,"meena@gmail.com","9876556789","Kerala","Teacher");
		Profile profile8=new Profile("Ravi",30,"ravi@gmail.com","9876567890","Mumbai","Businessman");
		Profile profile9=new Profile("Divya",22,"divya@gmail.com","9876578901","Coimbatore","Nurse");
		Profile profile10=new Profile("Vikram",27,"vikram@gmail.com","9876589012","Goa","Chef");

		Profile[] profiles=new Profile[10];
		ProfileStore store=new ProfileStore(profiles);

		profile1.profileInfo(); store.saveProfile(profile1);
		profile2.profileInfo(); store.saveProfile(profile2);
		profile3.profileInfo(); store.saveProfile(profile3);
		profile4.profileInfo(); store.saveProfile(profile4);
		profile5.profileInfo(); store.saveProfile(profile5);
		profile6.profileInfo(); store.saveProfile(profile6);
		profile7.profileInfo(); store.saveProfile(profile7);
		profile8.profileInfo(); store.saveProfile(profile8);
		profile9.profileInfo(); store.saveProfile(profile9);
		profile10.profileInfo(); store.saveProfile(profile10);
	}
}