import java.util.Scanner;

public class sumofdigits {

    
    public static int sumOfDigitsUntilSingleDigit(int num) {
        
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        
        int result = sumOfDigitsUntilSingleDigit(num);
        System.out.println("The single digit sum is: " + result);

        scanner.close(); 
    }
}
