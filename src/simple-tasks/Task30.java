/*
 Zeichne n * n Kreise. In der Diagonale sollen die Kreise getrennt sein. Sprich eine Seite soll grün sein und die Andere soll blau sein.
 Das Fester soll mit einer Fixen breite von 400 Pixel sein. Die größe der Kreise soll propertional zu der Anzahl sein.
 */
import java.awt.*;

public class Task30 {

    public static void main(String[] args) {
        int count = 5;

        if (count <= 2) {
            throw new IllegalArgumentException("Count muss größer als 2 sein");
        }

        int size = 400;
        int radiusCircel = (size / count) / 2;
        int anzBlue = 0;

        StdDraw.setCanvasSize(size, size);
        StdDraw.setScale(0, size);
        StdDraw.setPenRadius(0.01);

        for (int i = 0, xpos = radiusCircel; i < count; i++, anzBlue++, xpos += 2 * radiusCircel) {
            for (int j = 0; j < anzBlue; j++) {
                StdDraw.setPenColor(Color.BLUE);
                StdDraw.circle(radiusCircel + radiusCircel * 2 * j, radiusCircel + radiusCircel * 2 * i, radiusCircel);
            }
            for (int j = 0; j < count - anzBlue; j++) {
                StdDraw.setPenColor(Color.GREEN);
                StdDraw.circle(xpos + radiusCircel * 2 * j, radiusCircel + radiusCircel * 2 * i, radiusCircel);
            }

        }
        StdDraw.show();
    }

}
