/**
 * Task 8) Zeichne auf einen 500x500 canvas quadrate, wobei sich die Farbe von der
 * einen Ecke ausgehend in die andere ändert. Also das waren 10x10 Quadrate und links unten wars schwarz
 * und in Richtung rechts oben wurde das immer heller.
 */
public class Task8 {
    public static void main(String[] args) {

        int size = 500;
        StdDraw.setCanvasSize(size, size);
        StdDraw.setScale(0, size);

        int color = 0;
        int widhtSqure = size / 10;
        int steps = 255 / 100;


        for (int y = widhtSqure / 2; y < size; y += widhtSqure) {
            for (int x = widhtSqure / 2; x < size; x += widhtSqure) {
                StdDraw.setPenColor(color, color, color);
                StdDraw.filledSquare(x, y, widhtSqure / 2);
                color += steps;
            }
        }


    }
}
