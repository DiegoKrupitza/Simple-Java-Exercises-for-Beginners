/**
 * Task 8) Draw on a 500x500 canvas square with the color changing from one corner to the other. At the bottom left the square is black and towards the top right the squares become lighter and lighter.
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
