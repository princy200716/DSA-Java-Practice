public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 40, 15};

        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}