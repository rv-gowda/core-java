class MapRunner{
	public static void main(String[] args){

		Map map1=new Map("Political","India","Oxford",true,true,2020);
		Map map2=new Map("Physical","World","Pearson",false,true,2018);
		Map map3=new Map("Road","Karnataka","Navneet",true,false,2021);
		Map map4=new Map("Tourist","Goa","IndiaPub",true,true,2019);
		Map map5=new Map("Railway","India","Govt",false,true,2022);
		Map map6=new Map("Weather","Global","NASA",true,true,2023);
		Map map7=new Map("Topographic","Himalaya","Survey",true,false,2017);
		Map map8=new Map("Digital","USA","Google",false,true,2024);
		Map map9=new Map("Historical","Europe","HistoryPub",true,true,2015);
		Map map10=new Map("City","Bangalore","MetroPub",true,true,2022);

		Map[] maps=new Map[10];
		MapStore store=new MapStore(maps);

		map1.mapInfo(); store.saveMap(map1);
		map2.mapInfo(); store.saveMap(map2);
		map3.mapInfo(); store.saveMap(map3);
		map4.mapInfo(); store.saveMap(map4);
		map5.mapInfo(); store.saveMap(map5);
		map6.mapInfo(); store.saveMap(map6);
		map7.mapInfo(); store.saveMap(map7);
		map8.mapInfo(); store.saveMap(map8);
		map9.mapInfo(); store.saveMap(map9);
		map10.mapInfo(); store.saveMap(map10);
	}
}