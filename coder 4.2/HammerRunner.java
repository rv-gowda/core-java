class HammerRunner{

	public static void main(String[] args){

		String[] name = {"SteelHammer","IronHammer","HeavyHammer","MiniHammer","WoodHammer"};

		Metal metal1 = new Metal("Steel",2.5);
		Metal metal2 = new Metal("Iron",3.2);
		Metal metal3 = new Metal("Alloy",1.8);

		Metal[] metal = new Metal[3];
		metal[0] = metal1;
		metal[1] = metal2;
		metal[2] = metal3;

		Hammer hammer = new Hammer(name, metal);
		hammer.display();
	}
}