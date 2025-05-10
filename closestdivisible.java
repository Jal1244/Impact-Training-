public class closestdivisible {

    public static int findClosestDivisible(int num, int m) {
        
        int lower = (num / m) * m;

        
        int upper = lower;
        if (lower < num) {
            upper = lower + m;
        }

       
        int distLower = num - lower;
        int distUpper = upper - num;

        
        if (distLower == distUpper) {
            return Math.max(lower, upper);
        }

        
        return distLower < distUpper ? lower : upper;
    }

    public static void main(String[] args) {
        int num = 15; 
        int m = 4;    
        
        System.out.println("The closest divisible number is: " + findClosestDivisible(num, m));
    }
 {
    }
}
