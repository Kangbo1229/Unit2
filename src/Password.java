import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("First name: ");
        String first = scan.next();
        System.out.print("Middle name: ");
        String middle = scan.next();
        System.out.print("Last name: ");
        String last = scan.next();
        System.out.print("Age: ");
        String age = scan.next();
        System.out.println(" ");
        int mid1 = first.length()/2;
        int mid2 = middle.length()/2;
        int mid3 = last.length()/2;
        String part1 = first.substring(mid1,mid1+1);
        String part2 = middle.substring(mid2,mid2+1);
        String part3 = last.substring(mid3,mid3+1);
        String part4 = first.substring(first.length()-1,first.length());
        String part5 = middle.substring(middle.length()-1,middle.length());
        String part6 = last.substring(last.length()-1,last.length());
        System.out.print("Password :"+part1.toUpperCase()+part2.toUpperCase()+part3.toUpperCase()+part4+part5+part6);




    }
}
