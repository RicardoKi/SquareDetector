package main;

/**
 * Created by riki on 15.07.2014.
 */
public class SquarePicture {
    private char[][] picture;

    public SquarePicture(char[][] picture) {
        this.picture = picture;
    }

    public String isSquare() {
        Integer count = 0;
        Integer end = 0;
        Integer start = 0;
        Integer width = picture.length - 1;
        Integer startrows = null;
        for (int i = 0; i <= width; i++) { //i=Zeilennummer
            Integer endOld = end;
            Integer startOld = start;
            start = 0;
            end = 0;
            Integer length = 0;
            for (int j = 0; j <= width; j++) { //j=Spaltennummer
                if (picture[i][j] == '#') {
                    count++;
                }
                if (picture[i][j] == '#' && end == 0) {
                    if (j == width) {
                        end = j + 1;
                    }
                    if (start == 0) {
                        start = j + 1;
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
        if (count == 0) {
            return ("NO");
        }
        double root = (Math.sqrt(count)) % 2;
        if (root == 0.0 | root == 1.0) {
            return ("YES");
        } else {
            return ("NO");
        }
    }

    public String isSquareNew() {
        Square bild = new Square(0, 0, 0);
        for (int i = 0; i <= picture.length - 1; i++) {
            if (bild.getStartrow()!=0) {
                break;
            }
            for (int j = 0; j <= picture.length - 1; j++) {
                if (picture[i][j] == '#') {
                    if (bild.getStart() != 0 && (bild.getStartrow() == i + 1)) {
                        bild.setEnd(j + 1);
                    }
                    if ((bild.getStart() == 0)) {
                        bild.setStart(j + 1);
                        bild.setEnd(j + 1);
                        bild.setStartrow(i + 1);
                    }
                }
            }
        }
        if (this.check(bild)){
            return "YES";
        }else return "NO";
    }
    private boolean check(Square bild) {
        for (int i = 0; i <= picture.length - 1; i++) {
           // for (int i = (bild.getStartrow()); i <= picture.length - 1; i++) {
            for (int j = 0; j <= picture.length - 1; j++) {
                if  (bild.isSquared(i+1,j+1, picture[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
