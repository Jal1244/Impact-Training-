import java.util.Scanner;
public class trendy_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit Number:"); 
        int number = sc.nextInt();

        if (number >= 100 && number <=999){
            int middledigit =(number / 10)%10;
            if (middledigit % 3 ==0 ){
            System.out.print(number+ "number is a Trendy number");
        } else{
            System.out.print("The number is not a Trendy Number");
        } }
        else {
            System.out.print("The number is not a three digit number");
        }
        sc.close();

    }
    
}
