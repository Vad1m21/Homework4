package ListOfNumbers;

public class LauncherForListOfNumbers {



    public void launchListOfNumbers(){
        Input input = new Input();
        Output output = new Output();
        int number = input.enterNumberForFunc();
        output.OutputNumbers(number);
    }

}
