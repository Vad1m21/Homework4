package ListOfNumbers;
import java.util.Scanner;


public class Input {

    Scanner scanner = new Scanner(System.in);

   protected int enterNumberForFunc (){

       System.out.println("Enter number:");
        int number = scanner.nextInt();

        return number;
    }

}
