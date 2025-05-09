import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int digit = 0;
        int temp = num;

        // Count number of digits
        if (temp == 0) {
            digit = 1;
        } else {
            while (temp != 0) {
                digit++;
                temp /= 10;
            }
        }

        int sum = 0;
        temp = num;

     
        while (temp != 0) {
            int rem = temp % 10;
            sum += (int)Math.pow(rem, digit);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }

        sc.close();
    }
}
