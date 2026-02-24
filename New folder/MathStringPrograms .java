class MathStringPrograms {

    static void reverseString(String str) {

        System.out.println("The given string is : " + str);

        if (str == null) {
            System.out.println("The data is invalid");
            return;
        }

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("The reversed string is : " + reverse);
    }

    static void checkPalindrome(String str) {

        System.out.println("The given string is : " + str);

        if (str == null) {
            System.out.println("The data is invalid");
            return;
        }

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static void fibonacciSeries(int n) {

        System.out.println("The number is : " + n);

        if (n <= 0) {
            System.out.println("The data is invalid");
            return;
        }

        int a = 0, b = 1;

        System.out.print("Fibonacci Series : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    static void checkArmstrong(int num) {

        System.out.println("The number is : " + num);

        if (num < 0) {
            System.out.println("The data is invalid");
            return;
        }

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    static void factorial(int num) {

        System.out.println("The number is : " + num);

        if (num < 0) {
            System.out.println("The data is invalid");
            return;
        }

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial is : " + fact);
    }

