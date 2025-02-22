
import java.util.Scanner;

public class Madlibs{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("Enter the first adjective?(Description) ");
        adjective1=scan.nextLine();

        System.out.print("Enter the first noun?(Animal Or Person) ");
        noun1=scan.nextLine();

        System.out.print("Enter the Second adjective?(Description) ");
        adjective2=scan.nextLine();

        System.out.print("Enter a Verb that end with -(ing) action? ");
        verb1=scan.nextLine();

        System.out.print("Enter the Thrid adjective?(Description) ");
        adjective3=scan.nextLine();


        System.out.println("Today i went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit, i saw a " + noun1 + " .");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " !");
        System.out.println("I was " + adjective3 + " !");
        scan.close();
    }
}