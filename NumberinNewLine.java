import java.util.Scanner;

public class NumberinNewLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            num = -num;
            System.out.println("-"); 
        }

       
        int reversed = 0;
        int temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

       
        while (reversed > 0) {
            System.out.println(reversed % 10);
            reversed /= 10;
        }

        scanner.close();
    }
}
