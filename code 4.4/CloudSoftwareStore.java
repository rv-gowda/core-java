class CloudSoftwareStore{
	CloudSoftware[] softwares;
	int currentIndex=0;

	CloudSoftwareStore(CloudSoftware[] softwares){
		this.softwares=softwares;
	}

	void saveCloudSoftware(CloudSoftware software){
		if(this.softwares!=null && software!=null){
			System.out.println("Executing saveCloudSoftware in CloudSoftwareStore");
			int index=this.softwares.length-1;

			if(currentIndex<=index){
				this.softwares[currentIndex]=software;
				System.out.println("Saved CloudSoftware at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}