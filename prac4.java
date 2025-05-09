import java.util.Scanner;
public class prac4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = 321;
        int b = ((a % 10) * 100) + (((a / 10) % 10) * 10) + (a / 100);
        System.out.println(b);
        int totalGoldCoins = sc.nextInt();
        int percentageOfblackbeard = sc.nextInt();
        int percentageOfbens = sc.nextInt();
        int blackbeardShare = (int) ((percentageOfblackbeard * totalGoldCoins) / 100.0);
        System.out.println(blackbeardShare);
        int leftpart1 = totalGoldCoins - blackbeardShare;
        int benShare = (int) ((percentageOfbens * leftpart1) / 100.0);
        System.out.println(benShare);
        int leftpart2 = leftpart1 - benShare;
        int others = (int) (leftpart2 / 3.0);
        System.out.println(others);
        

        
    }
}
