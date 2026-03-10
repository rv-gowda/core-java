class TowerRunner{

	public static void main(String[] args){

		String[] name = {"SkyTower","CityTower","MegaTower","RoyalTower","PrimeTower"};

		Floor floor1 = new Floor(5,"Residential");
		Floor floor2 = new Floor(10,"Commercial");
		Floor floor3 = new Floor(15,"Office");

		Floor[] floor = new Floor[3];
		floor[0] = floor1;
		floor[1] = floor2;
		floor[2] = floor3;

		Tower tower = new Tower(name, floor);
		tower.display();
	}
}