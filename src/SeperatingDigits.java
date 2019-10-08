import java.util.Scanner;

public class SeperatingDigits {

    public static int quotient (int value){
        int num = value/10;
        return num;
    }
    public static int remainder (int value2){
        int num = value2/10;
        return num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int one = scan.nextInt();
        int v1 = remainder(one);
        int vr = quotient(one);
        int v2 = remainder(vr);
        int v2r = quotient(vr);
        int v3 = remainder(v2r);
        int v3r = quotient(v2r);
        int v4 = remainder(v3r);
        int v4r = quotient(v3r);
        System.out.print(v4+" "+v3+" "+v2+" "+v1);

    }

}
