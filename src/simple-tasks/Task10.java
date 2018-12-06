/**
 * Task 10) Draw a number of circles. The outermost circle must be grey and the further inside the darker the circle becomes.
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

