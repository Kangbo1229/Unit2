import java.awt.*;
import java.util.Scanner;

public class FourRectanglePrinter {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(0,0,3,4);
        System.out.println(box);
        box.translate(3,0);
        System.out.println(box);
        box.translate(0,-4);
        System.out.println(box);
        box.translate(-3,0);
        System.out.println(box);

    }
}
