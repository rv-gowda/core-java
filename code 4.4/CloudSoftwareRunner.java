class CloudSoftwareRunner{
	public static void main(String[] args){

		CloudSoftware software1=new CloudSoftware("AWS","Amazon","IaaS",true,true,1000);
		CloudSoftware software2=new CloudSoftware("Azure","Microsoft","PaaS",true,true,800);
		CloudSoftware software3=new CloudSoftware("Google Cloud","Google","IaaS",true,true,900);
		CloudSoftware software4=new CloudSoftware("Dropbox","Dropbox","Storage",true,true,500);
		CloudSoftware software5=new CloudSoftware("OneDrive","Microsoft","Storage",true,true,600);
		CloudSoftware software6=new CloudSoftware("iCloud","Apple","Storage",true,true,700);
		CloudSoftware software7=new CloudSoftware("Slack","Slack","Communication",true,true,400);
		CloudSoftware software8=new CloudSoftware("Zoom","Zoom","Meeting",true,true,300);
		CloudSoftware software9=new CloudSoftware("Salesforce","Salesforce","CRM",true,true,1000);
		CloudSoftware software10=new CloudSoftware("Heroku","Salesforce","PaaS",true,true,350);

		CloudSoftware[] softwares=new CloudSoftware[10];
		CloudSoftwareStore store=new CloudSoftwareStore(softwares);

		software1.cloudSoftwareInfo(); store.saveCloudSoftware(software1);
		software2.cloudSoftwareInfo(); store.saveCloudSoftware(software2);
		software3.cloudSoftwareInfo(); store.saveCloudSoftware(software3);
		software4.cloudSoftwareInfo(); store.saveCloudSoftware(software4);
		software5.cloudSoftwareInfo(); store.saveCloudSoftware(software5);
		software6.cloudSoftwareInfo(); store.saveCloudSoftware(software6);
		software7.cloudSoftwareInfo(); store.saveCloudSoftware(software7);
		software8.cloudSoftwareInfo(); store.saveCloudSoftware(software8);
		software9.cloudSoftwareInfo(); store.saveCloudSoftware(software9);
		software10.cloudSoftwareInfo(); store.saveCloudSoftware(software10);
	}
}