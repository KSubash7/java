import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.print("Array elements: ");
        for (String num : arr) {
            System.out.println(num + " ");
        }

        sc.close();
    }
    }
