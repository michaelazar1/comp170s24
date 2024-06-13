public class Blocks {
    public static void main(String[] args) {

        final int HEIGHT = 6;
        final int SLOPE = 2;
        final String SPACE = " ";
        final String PLOT = "*";
        // Print a "equilateral" triangle that is 6 lines tall
        // Each line starts with 6-X spaces, followed by 2X-1 stars
        // X = 1, 2, ..., 6

        for (int line = 1; line <= HEIGHT; line=line+1) {
            int numberOfSpaces = HEIGHT-line;
            int numberOfStars = SLOPE*line-1;
            System.out.println(SPACE.repeat(numberOfSpaces) + PLOT.repeat(numberOfStars));
        }

    }
}