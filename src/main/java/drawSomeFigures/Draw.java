package drawSomeFigures;

public class Draw {

        public void drawRectangle (int height, int length){

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print("+");
                }
                System.out.println(" ");
            }
        }

    public void drawRectangle ( int length){

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("+");
            }
            System.out.println(" ");
        }
    }

}

