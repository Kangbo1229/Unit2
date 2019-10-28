import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter the x coordinate of the first point: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int y = scan.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int sx = scan.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int sy = scan.nextInt();
        double xp = Math.pow((sx-x),2);
        double yp = Math.pow((sy-y),2);
        double r = Math.sqrt(xp+yp);
        System.out.println("The distance between "+"("+x+","+y+")"+" and "+"("+sx+","+sy+")"+" is "+r);

    }
}
