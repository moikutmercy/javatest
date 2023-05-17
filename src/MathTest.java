import java.util.Scanner;
public class MathTest {
//    public static void main(String[] args) {
//        System.out.println("Enter the Two numbers for subtraction: ");
//        Scanner readInput = new Scanner(System.in);
//        int a = readInput.nextInt();
//        int b = readInput.nextInt();
//
//        readInput.close();
//        // It will return the sum of a and b.
//        System.out.println("The sum of a and b is = " + sum(a, b));
//        System.out.println("The take away of a and b is = " + takeaway(a, b));
//        System.out.println("The divide of a and b is = " + divide(a, b));
//        System.out.println("The multiply of a and b is = " + multiple(a, b));
//        System.out.println("The modulus of a and b is = " + modulus(a, b));
//    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum1(int a, int b) {
        return Integer.sum(a,b);
    }

    public int takeaway(int a, int b) {
        return a - b;
    }

    public  int divide(int a, int b) {
        return a / b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }
    public int modulus(int a,int b)  {
        return a % b;
    }
}





