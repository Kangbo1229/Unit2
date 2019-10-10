import java.util.Scanner;

public class TheNameGame {
    public static void Game (String name) {
        System.out.println(" ");
        System.out.println(name+" "+name+", "+"bo-"+"B"+name.substring(1));
        System.out.println("Banana-fana fo-"+name);
        System.out.println("Fee-fi-mo-Mifty");
        System.out.println(name.toUpperCase());

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first name?");
        String First = scan.next();
        System.out.print("What is your last name?");
        String Last = scan.next();
        Game(First);
        Game(Last);



    }
}
