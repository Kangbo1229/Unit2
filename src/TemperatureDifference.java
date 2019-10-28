import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args) {
        System.out.print("Enter the first temperature: ");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        System.out.print("Enter the second temperature: ");
        int temp2 = scan.nextInt();
        int f = temp-temp2;
        int a = Math.abs(f);
        System.out.println("The temperature changed " + a + " degrees.");


    }
}
