import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[] args){
        System.out.print("Enter your word: ");
        Scanner scan = new Scanner(System.in);
        String four = scan.nextLine();
        int value = (int) Math.sqrt(four.length());
        char fr = four.charAt(value);
        System.out.println("The \"square root\" of " + four + " is " + fr);





    }

}
