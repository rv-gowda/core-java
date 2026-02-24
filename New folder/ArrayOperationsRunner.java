class ArrayOperationsRunner {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 40, 15};

        ArrayOperations.findMin(numbers);
        System.out.println("----------------");

        ArrayOperations.findMax(numbers);
        System.out.println("----------------");

        ArrayOperations.findAverage(numbers);
    }
}