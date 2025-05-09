import java.util.Scanner;
public class digit_sum_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int num = n; num <= m; num++ ){
        int tens = num/10;
        int ones = num % 10;
        int sum = tens + ones;
        int product = tens * ones;

        if (sum + product == num ) {
            System.out.println(num);
        }
    }
    }
}
