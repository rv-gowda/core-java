class CloudSoftware{
	String name;
	String provider;
	String type;
	boolean subscription;
	boolean secure;
	int users;

	CloudSoftware(String name,String provider,String type,boolean subscription,boolean secure,int users){
		this.name=name;
		this.provider=provider;
		this.type=type;
		this.subscription=subscription;
		this.secure=secure;
		this.users=users;
	}

	void cloudSoftwareInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Provider:"+this.provider);
		System.out.println("Type:"+this.type);
		System.out.println("Subscription:"+this.subscription);
		System.out.println("Secure:"+this.secure);
		System.out.println("Users:"+this.users);
	}
}