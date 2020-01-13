package drawFiguresRec;

public class LauncherForDrawRecursion {
    public LauncherForDrawRecursion() {
        InputNumbersForFigures inputNumbersForFigures = new InputNumbersForFigures();
        int[] arr = inputNumbersForFigures.enterLengthAndHeight();
        int lengthOfRectangle = inputNumbersForFigures.lengthParameter(arr);
        int heightOfRectangle = inputNumbersForFigures.heightParameter(arr);


        DrawRecur drawRecur = new DrawRecur();
        drawRecur.drawRectangleRecursive(lengthOfRectangle, heightOfRectangle);
    }

}
