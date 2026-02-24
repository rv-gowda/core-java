class ArrayOperations {

    static void findMin(int[] arr) {

        System.out.println("Finding Minimum Value");

        if (arr == null || arr.length == 0) {
            System.out.println("The data is invalid");
            return;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum value is : " + min);
    }

    static void findMax(int[] arr) {

        System.out.println("Finding Maximum Value");

        if (arr == null || arr.length == 0) {
            System.out.println("The data is invalid");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum value is : " + max);
    }

    static void findAverage(int[] arr) {

        System.out.println("Finding Average");

        if (arr == null || arr.length == 0) {
            System.out.println("The data is invalid");
            return;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("The average is : " + average);
    }
}