package main;

/**
 * Created by riki on 15.07.2014.
 */
public class SquarePicture {
    private char[][] picture;

    public SquarePicture(char [][] picture) {

        this.picture = picture;
    }


    public String isSquare() {
        Integer count = 0;
        double root = 0;
        Integer end = 0;
        Integer start = 0;
        Integer width=picture.length-1;
        for (int i = 0;i <= width; i++) { //i=Zeilennummer
            Integer endOld = end;
            Integer startOld = start;
            start = 0;
            end = 0;
            Integer startrows = 0;
            Integer length = 0;

            for (int j = 0; j <= width; j++) { //j=Spaltennummer
                if (picture[i][j] == '#') {
                    count++;
                }
                if (picture[i][j] == '#' && end == 0) {
                    if (j == width ){
                        end = j+1;
                    }
                    if (start == 0) {
                        start = j+1;
                        if (count == 1) {
                            startOld = start;
                            startrows = i;
                        }
                        if (length < (i - startrows) && length != 0) {
                            break;
                        }
                    }
                    if (!(start.equals(startOld))) {
                        break;
                    }

                } else {

                    if (start != 0 && end == 0) {
                        end = j;

                        if (startrows == i) {
                            endOld = end;
                            length = end - start;
                        }
                        if (!(end.equals(endOld))) {
                            break;
                        }
                    }
                }
            }
        }
        root = (Math.sqrt(count)) % 2;
        if (root == 0.0 | root == 1.0) {
            return ("YES");
        } else {
            return ("NO");
        }
    }
}
