class SaltRunner{
	public static void main(String[] args){

		Salt salt1=new Salt("Sodium Chloride","NaCl","White",true,true,1);
		Salt salt2=new Salt("Potassium Chloride","KCl","White",true,true,1);
		Salt salt3=new Salt("Calcium Carbonate","CaCO3","White",false,false,2);
		Salt salt4=new Salt("Magnesium Sulfate","MgSO4","White",true,false,1);
		Salt salt5=new Salt("Ammonium Chloride","NH4Cl","White",true,false,1);
		Salt salt6=new Salt("Sodium Bicarbonate","NaHCO3","White",true,true,1);
		Salt salt7=new Salt("Copper Sulfate","CuSO4","Blue",true,false,1);
		Salt salt8=new Salt("Iron Sulfate","FeSO4","Green",true,false,1);
		Salt salt9=new Salt("Zinc Sulfate","ZnSO4","White",true,false,1);
		Salt salt10=new Salt("Silver Nitrate","AgNO3","White",true,false,1);

		Salt[] salts=new Salt[10];
		SaltStore store=new SaltStore(salts);

		salt1.saltInfo(); store.saveSalt(salt1);
		salt2.saltInfo(); store.saveSalt(salt2);
		salt3.saltInfo(); store.saveSalt(salt3);
		salt4.saltInfo(); store.saveSalt(salt4);
		salt5.saltInfo(); store.saveSalt(salt5);
		salt6.saltInfo(); store.saveSalt(salt6);
		salt7.saltInfo(); store.saveSalt(salt7);
		salt8.saltInfo(); store.saveSalt(salt8);
		salt9.saltInfo(); store.saveSalt(salt9);
		salt10.saltInfo(); store.saveSalt(salt10);
	}
}