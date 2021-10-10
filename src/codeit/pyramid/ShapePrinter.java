package codeit.pyramid;

public class ShapePrinter {
    public void printPyramid(int height) {

        for(int i=0; i < height; i++) {
            int space = height - (i + 1);
            int width = i * 2 + 1;

            for(int y=0; y < space; y++) {
                System.out.print(" ");
            }
            for(int y=0; y < width; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}