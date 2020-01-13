package RecursionListOFNumbers;

import java.util.Scanner;

public class NumberForListRecursion {
    Scanner scanner = new Scanner(System.in);


    public int inputNumberForListOfNumbers(){
        System.out.print("Enter number:");
        int numberForList = scanner.nextInt();


        return numberForList;
    }


    public String  outPutListOfNumbers(int numberForList){
        if(numberForList==1){

            return "1";
        }

        return outPutListOfNumbers(numberForList - 1)+ "\n" + numberForList;
    }


}
