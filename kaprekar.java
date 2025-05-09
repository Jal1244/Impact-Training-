import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int count = 0;

       
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        
        int divisor = 1;
        for (int i = 0; i < count; i++) {
            divisor *= 10;
        }

        int right = square % divisor;
        int left = square / divisor;

        if (right + left == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }

        sc.close();
    }
}
