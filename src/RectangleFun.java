import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Width: ");
        int w = scan.nextInt();
        System.out.print("Height: ");
        int h = scan.nextInt();
        System.out.print("x: ");
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();
        Rectangle r = new Rectangle(x,y,w,h);
        double perimeter = (r.getWidth()+r.getHeight())*2;
        System.out.println("Perimeter = "+perimeter);
        r.setLocation( x-4, y+2);
        System.out.println("New location is "+"("+r.getX()+","+r.getY()+")");



    }
}
