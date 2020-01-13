package drawSomeFigures;

public class LauncherForDrawing {
    public void launchDrawRectangle(){
        InputParameters inputParameters = new InputParameters();

       int []arr = inputParameters.enterLengthAndHeight();
        int lengthOfRectangle = inputParameters.lengthParameter(arr);
        int heightOfRectangle = inputParameters.heightParameter(arr);

        Draw draw = new Draw();

       if(arr.length == 2) {
           draw.drawRectangle(heightOfRectangle, lengthOfRectangle);
       }
       else{
            draw.drawRectangle(lengthOfRectangle);
       }

    }
}
