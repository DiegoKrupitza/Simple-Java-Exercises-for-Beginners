/**
 * Task 10) StdDraw, 5 bzw. 7 Kreise die immer kleiner und dunkler werden,
 * außen weiß bzw. Grau und je weiter nach innen desto dunkler, alles in einem 500x500 canvas.
 */
public class Task10 {
    public static void main(String[] args) {

        int numberOfCircels = 7;
        int color = 235;
        int stepsColor = color / numberOfCircels;
        int baseRadius = 500 / 2;
        int stepRadius = (baseRadius) / numberOfCircels;


        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(0, 500);

        for (int i = 0; i < numberOfCircels; i++, color -= stepsColor, baseRadius -= stepRadius) {
            StdDraw.setPenColor(color, color, color);
            StdDraw.filledCircle(250, 250, baseRadius);
        }

    }

}

