class Product {

	String name;
	String make;
	String mfgDate;
	double cost;
	ProductType type;
	String seller;
	WarrantyYears warrantyYears;
	boolean warrantyExpired;
	int uniqueId;
	String originCountry;

	Product(String name, String make, String mfgDate, double cost,
	        ProductType type, String seller, WarrantyYears warrantyYears,
	        boolean warrantyExpired, int uniqueId, String originCountry) {

		this.name = name;
		this.make = make;
		this.mfgDate = mfgDate;
		this.cost = cost;
		this.type = type;
		this.seller = seller;
		this.warrantyYears = warrantyYears;
		this.warrantyExpired = warrantyExpired;
		this.uniqueId = uniqueId;
		this.originCountry = originCountry;
	}

	void display() {
		System.out.println("-----------------------------------");
		System.out.println("ID: " + uniqueId);
		System.out.println("Name: " + name);
		System.out.println("Make: " + make);
		System.out.println("Cost: " + cost);
		System.out.println("Type: " + type);
		System.out.println("Seller: " + seller);
		System.out.println("Warranty: " + warrantyYears);
		System.out.println("Expired: " + warrantyExpired);
		System.out.println("Country: " + originCountry);
	}
}