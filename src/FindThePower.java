import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args) {
        System.out.print("Enter the base: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int e = scan.nextInt();
        double f = Math.pow(b,e);
        System.out.println(b + " ^ " + e + " = " + f);
    }
}
