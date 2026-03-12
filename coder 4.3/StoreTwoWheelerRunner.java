class StoreTwoWheelerRunner
{
	public static void main(String... values)
	{
		String[] modelName=new String[50];
		StoreTwoWheeler storeTwoWheeler=new StoreTwoWheeler(modelName);
		
		storeTwoWheeler.getModelName("Activa");
		storeTwoWheeler.getModelName("Dio");
		storeTwoWheeler.getModelName("Jupiter");
		storeTwoWheeler.getModelName("Access");
		storeTwoWheeler.getModelName("NTorq");
		storeTwoWheeler.getModelName("Pleasure");
		storeTwoWheeler.getModelName("RayZR");
		storeTwoWheeler.getModelName("Fascino");
		storeTwoWheeler.getModelName("Burgman");
		storeTwoWheeler.getModelName("Avenis");
	}
}