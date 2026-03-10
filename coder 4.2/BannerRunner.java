class BannerRunner{

	public static void main(String[] args){

		String[] name = {"WelcomeBanner","FestivalBanner","EventBanner","SaleBanner","CollegeBanner"};

		Message message1 = new Message("Welcome","Red");
		Message message2 = new Message("Happy Festival","Blue");
		Message message3 = new Message("Big Sale","Green");

		Message[] message = new Message[3];
		message[0] = message1;
		message[1] = message2;
		message[2] = message3;

		Banner banner = new Banner(name, message);
		banner.display();
	}
}