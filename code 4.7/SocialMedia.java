class SocialMedia extends Media {

    String platformName;
    int users;
    boolean verifiedAccounts;
    double dailyActiveUsers;
    String headquarters;

    void displayDetails() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Users: " + users);
        System.out.println("Verified Accounts: " + verifiedAccounts);
        System.out.println("Daily Active Users: " + dailyActiveUsers);
        System.out.println("Headquarters: " + headquarters);
    }
}