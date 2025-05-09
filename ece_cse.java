import java.util.Scanner;
public class ece_cse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int seatNo = sc.nextInt();
        if (seatNo <= row) {
            System.out.println("CSE");
        } 
        else if (seatNo % row == 0){
            System.out.println("CSE");
        }
        else if (seatNo % row == 1){
            System.out.println("CSE");
        }
        else {
            System.out.println("ECE");
        }
    }
}
