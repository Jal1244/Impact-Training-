import java.util.Scanner;
public class prac3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 Digit Number:");
        int number = sc.nextInt();

        if (number >= 100 && number <= 999) {
            int reversed = (number % 10) *100 + ((number/10) % 10) *10 + (number / 100);
            System.out.println("Reversed Number:" +reversed);
        } else {
            System.out.println("Please enter a valid number.");
        }
        sc.close();
    }
}