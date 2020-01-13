package drawFiguresRec;

import java.util.Scanner;

public class InputNumbersForFigures {
Scanner scanner = new Scanner(System.in);
DrawRecur drawRecur = new DrawRecur();

    public int [] enterLengthAndHeight() {

        System.out.print("Enter numbers:");

        String inputLine = scanner.nextLine();
        inputLine =  inputLine.trim();
        String[] arrStr = inputLine.split(" ");
        int[] arr = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);

        }

        return arr;
    }


    public int lengthParameter(int[] arr) {
        int length = arr[0];

        return length;
    }


    public int heightParameter(int[] arr) {
        int height = 0;
        if (arr.length == 2) {

            height = arr[1];
        }
        return height;
    }


   /* public void startDrawing(int lengthOfRectangle, int heightOfRectangle, int length, int height){
        drawRecur.recursionDrawing(length,height,0,0);
*/
    }

