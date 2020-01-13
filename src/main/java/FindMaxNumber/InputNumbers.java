package FindMaxNumber;

import java.util.Scanner;

public class InputNumbers {
    Scanner scanner = new Scanner(System.in);
    CompareNumbers compareNumbers = new CompareNumbers();

    public  void  enterNumbers(){

        System.out.println("enter numbers:");
        String inputFirstNumber = scanner.nextLine();
        inputFirstNumber = inputFirstNumber.trim();
        String [] arrStr = inputFirstNumber.split(" ");
        if(inputFirstNumber.contains(".")){
            float [] numbersArrayForFloat = new float[arrStr.length];
            for(int i = 0; i <arrStr.length;i++){
                numbersArrayForFloat[i] = Float.parseFloat(arrStr[i]);

            }
            compareNumbers.getMax(numbersArrayForFloat);
        }else {
            int [] numbersArrayForInt = new int[arrStr.length];
            for(int i = 0; i <arrStr.length;i++){
                numbersArrayForInt[i] =Integer.parseInt(arrStr[i]);


            }
            compareNumbers.getMax(numbersArrayForInt);
        }




    }
}
