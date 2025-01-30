public class reverse {
    public static void main(String[] args) {
        int number = 938908;
        int reverse = 0;
        
        while (number > 0) {
            int remainder = number % 10;  // Extract last digit
            reverse = (reverse * 10) + remainder; // Build reversed number
            number = number / 10;  // Remove last digit
        }
        
        System.out.println("Reversed number: " + reverse);
    }
}

