import java.util.Scanner;

public class adamnumber {
    public static int reverse(int num){
        int rev = 0;
        while (num != 0 ) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        int square = num * num;
        int revnum = reverse(num);
        int revsquare = revnum * revnum;
        int revofrevsquare = reverse(revsquare); 

        if(square == revofrevsquare){
            System.out.print(num + " is an Adam Number");
        } else {
            System.out.print(num + " is not an Adam Number");
        }
        sc.close();
    }
}
