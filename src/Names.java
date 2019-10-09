import java.util.Scanner;

public class Names {
    public static void main(String[] args) {


        String First = "Taehyung";
        System.out.println("First name: "+First);
        String Last = "kim";
        System.out.println("Last name: "+Last);
        int len = First.length();
        int len2 = Last.length();
        System.out.println(len+len2);
        System.out.println(First+Last);
        System.out.println(First.compareTo(Last));
        System.out.println(Last.indexOf('a'));
        System.out.println(First.indexOf('b'));
        String mid1 = First.substring(0,First.length()/2)+Last.substring(Last.length()/2);
        String mid2 = Last.substring(0,Last.length()/2)+First.substring(First.length()/2);
        System.out.println(mid1+" "+mid2);


    }
}
