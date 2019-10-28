import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        System.out.println("What is the description of the course? ");
        Scanner scan = new Scanner(System.in);
        String d = scan.nextLine();

        int one = d.indexOf(" ");
        String f = d.substring(0,one);
        System.out.println("Department: "+f);
        int s = d.indexOf(" ",one+1);
        String c = d.substring(one,s);
        System.out.println("Course Number: "+c);
        String t = d.substring(s);
        System.out.println("Title: "+t);






    }
}
