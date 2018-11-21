/*
    Zeichne eine Pyramide mit n stufen. Die Stufen sollen auf eine Seite rauf gehen und in der mitte wieder runter gehen

    BSP: n = 5
                    ``````````
                    dddddddddd
               `````MMMMMMMMMM`````
              `dddddMMMMMMMMMMddddd`
          `````MMMMMMMMMMMMMMMMMMMM`````
         `ddddmMMMMMMMMMMMMMMMMMMMMmdddd`
     ````.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.````
    `mmmmmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmmmm`
    `MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM`
NNNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNN
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM

 */
public class Task28 {
    public static void main(String[] args) {

        int canvasHeight = 200;
        int canvasWidth = 400;
        int numberOfSteps = 5;
        int stepHeight = canvasHeight / (numberOfSteps + 1);
        int stepWidth = canvasWidth;

        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setXscale(0, 400);
        StdDraw.setYscale(0, 200);

        for (int i = 0; i < numberOfSteps; i++) {
            StdDraw.filledRectangle(canvasWidth / 2.0, stepHeight / 2.0 + (stepHeight) * i, stepWidth / 2.0, stepHeight / 2.0);
            stepWidth -= (canvasWidth / numberOfSteps);
        }
        StdDraw.show();
    }
}
