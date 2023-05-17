import java.util.Scanner;

public class Math {
        public static void main(String[] args){
                MathTest math  = new MathTest();
                System.out.println("Enter the Two numbers to add: ");
                Scanner readInput=new Scanner(System.in);
                int a=readInput.nextInt();
                int b=readInput.nextInt();

                System.out.println("The sum of a and b is = " + math.sum(a, b));
                System.out.println("Enter the Two numbers to subtract: ");
                a=readInput.nextInt();
                b=readInput.nextInt();
                System.out.println("The take away of a and b is = " +math.takeaway(a, b));
                System.out.println("Enter the Two numbers to divide: ");
                a=readInput.nextInt();
                b=readInput.nextInt();
                System.out.println("The divide of a and b is = " +math.divide(a, b));
                System.out.println("Enter the Two numbers to multiple: ");
                a=readInput.nextInt();
                b=readInput.nextInt();
                System.out.println("The multiply of a and b is = " + math.multiple(a, b));
                System.out.println("Enter the Two numbers to modulus: ");
                a=readInput.nextInt();
                b=readInput.nextInt();
                System.out.println("The modulus of a and b is = " + math.modulus(a, b));
                readInput.close();
        }
}

