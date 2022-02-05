package lms6;
import lms6.util.JdbcMethods;
import lms6.util.JdbcMethodsImpl;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        JdbcMethods mymethod = new JdbcMethodsImpl();


        while (true) {
            System.out.println(" ----------Таблицаларды табуу---------- ");
            System.out.println("1 - >  find Mayor\n" +
                    "2 -  > find Country\n" +
                    "3  - > find City");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(mymethod.printMayor());
                    break;
                case 2 :
                    System.out.println(mymethod.printCountry());
                    break;
                case 3 :
                    System.out.println(mymethod.printCity());
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}

