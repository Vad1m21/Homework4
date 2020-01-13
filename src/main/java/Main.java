
import FindMaxNumber.InputNumbers;
import ListOfNumbers.LauncherForListOfNumbers;
import RecursionListOFNumbers.NumberForListRecursion;
import drawFiguresRec.DrawRecur;
import drawFiguresRec.InputNumbersForFigures;
import drawFiguresRec.LauncherForDrawRecursion;
import drawSomeFigures.Draw;
import drawSomeFigures.LauncherForDrawing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
        LauncherForListOfNumbers launcherForListOfNumbers = new LauncherForListOfNumbers();
        launcherForListOfNumbers.launchListOfNumbers();
        */


   /*
*/
     /*   InputNumbers inputNumbers = new InputNumbers();
        inputNumbers.enterNumbers();
*/
      /*  LauncherForList launcherForList = new LauncherForList();
        launcherForList.getInputNumberForList();
*/

      /*
        NumberForListRecursion numberForListRecursion = new NumberForListRecursion();
       int numberForList =  numberForListRecursion.inputNumberForListOfNumbers();
        System.out.print(numberForListRecursion.outPutListOfNumbers(numberForList));
*/
/*
        InputNumbersForFigures inputNumbersForFigures = new InputNumbersForFigures();
        int []arr = inputNumbersForFigures.enterLengthAndHeight();
        int lengthOfRectangle = inputNumbersForFigures.lengthParameter(arr);
        int heightOfRectangle = inputNumbersForFigures.heightParameter(arr);
        int i = 0 ;
        int j =0;
        inputNumbersForFigures.startDrawing(lengthOfRectangle,heightOfRectangle,i,j);
/*



*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, choose program which do you want to use");
        boolean check = true;
        while(check) {
            System.out.println("1. List of numbers\n2.Draw Rectangle\n3.Get max number\n4.List of numbers(recursion)\n5.Draw rectangle(recursion)");
            System.out.println("Choose program:");
            String input = scanner.next();
            while (!input.matches("^[1-5]$")) {

                System.out.println("Invalid input,please enter number(1-5):");
                input = scanner.next();

            }
            byte numberForChoosingProgram = Byte.parseByte(input);

            if (numberForChoosingProgram == 1) {
                System.out.println("Run 'List of numbers'");
                LauncherForListOfNumbers launcherForListOfNumbers = new LauncherForListOfNumbers();
                launcherForListOfNumbers.launchListOfNumbers();
            } else if (numberForChoosingProgram == 2) {
                System.out.println("Run 'Draw rectangle'");
                LauncherForDrawing launcherForDrawing = new LauncherForDrawing();
                launcherForDrawing.launchDrawRectangle();
            } else if (numberForChoosingProgram == 3) {
                System.out.println("Run 'Get max number'");
                InputNumbers inputNumbers = new InputNumbers();
                inputNumbers.enterNumbers();
            } else if (numberForChoosingProgram == 4) {
                System.out.println("Run 'List of numbers(recursion)'");
                NumberForListRecursion numberForListRecursion = new NumberForListRecursion();
                int numberForList = numberForListRecursion.inputNumberForListOfNumbers();
                System.out.print(numberForListRecursion.outPutListOfNumbers(numberForList));
            } else if (numberForChoosingProgram == 5) {
                System.out.println("Run 'Draw rectangle(recursion)'");
                LauncherForDrawRecursion launcherForDrawRecursion = new LauncherForDrawRecursion();

            }
            System.out.println("do you want to do something else(0-1):");
            String inputForFinish = scanner.next();
            while (!inputForFinish.matches("^[0-1]$")) {

                System.out.println("Invalid input,please enter number(0-1):");
                inputForFinish = scanner.next();

            }
            byte numberForFinish = Byte.parseByte(input);
            if(numberForFinish == 1){
                check = true;
            }
            else {
                check = false;
                System.out.println("Program is closing!");
            }
        }
    }



}
