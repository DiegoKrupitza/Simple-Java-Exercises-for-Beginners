import java.awt.*;

/**
    Task 6) Mit Hilfe von StdDraw soll dieses Muster erstellt werden.

                        ●
                            ●
                                ●
                                    ●
                                ●
                            ●
                        ●
 */
public class Task6 {
    public static void main(String[] args) {

        int width = 400;
        int height = 400;
        StdDraw.setCanvasSize(width,height);
        StdDraw.setScale(0,width);

        int countPoints = 3;


        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius(0.02);

        for (int xpos = 50,ypos = 50, numberofPoints = 0; numberofPoints <= countPoints * 2; numberofPoints++ ) {

            StdDraw.point(xpos,ypos);

            if(numberofPoints < countPoints) {
                xpos+= 30;
                ypos += 20;
            }else {
                xpos -= 30;
                ypos += 20;
            }


        }

        StdDraw.show();

    }
}
