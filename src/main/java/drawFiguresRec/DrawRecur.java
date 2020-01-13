package drawFiguresRec;

public class DrawRecur {

public static void drawRectangleRecursive(int height,int length){
    drawLineRecursive(length);

    System.out.println();

    if(height > 1){
        drawRectangleRecursive(height -1,length);
    }


}


public static void drawLineRecursive(int length){
    System.out.print("+ ");
    if(length > 1){
        drawLineRecursive(length - 1);
    }
}
}
