import java.awt.*;

/**
 * Task 3) Mehrere Quadrate (Anzahl laut einer Variable) in einem Ausgabefenster ausgeben,
 * wobei ein bestimmter Abstand vom Rand gegeben war und die Quadrate außerdem
 * denselben Abstand untereinander haben mussten.
 */
public class Task3 {
    public static void main(String[] args) {

        int squares = 4;
        int spacing = 20;

        int width = 400;
        int height = 400;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, 400);
        StdDraw.setYscale(0, 400);


        int widhtPerSquare = (width - ((squares + 1) * spacing)) / 4; // jedes Square soll gleich breit sein und soll den selben abstand zwischen sich haben und zum rand

        for (int yPosition = spacing; yPosition < height - spacing; yPosition += widhtPerSquare + spacing) {
            for (int i = 0, xPosition = spacing; i < squares; i++, xPosition += widhtPerSquare + spacing) {

                StdDraw.setPenColor(Color.red);
                StdDraw.filledSquare(xPosition + widhtPerSquare / 2, yPosition + widhtPerSquare / 2, widhtPerSquare / 2);


            }
        }


        StdDraw.show();
    }
}

