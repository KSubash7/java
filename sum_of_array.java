public class sum_of_array{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
//Sum of array elments 75
