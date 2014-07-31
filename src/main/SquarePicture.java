package main;

/**
 * Created by riki on 15.07.2014.
 */
public class SquarePicture {
    private char[][] picture;

    public SquarePicture(char[][] picture) {
        this.picture = picture;
    }

    public String isSquareNew() {
        Square bild = new Square(0, 0, 0);
        for (int i = 0; i <= picture.length - 1; i++) {
            if (bild.getStartrow() != 0) {
                break;
            }
            for (int j = 0; j < picture.length; j++) {
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
        if (this.check(bild)) {
            return "YES";
        } else return "NO";
    }

    private boolean check(Square bild) {
        for (int i = 0; i <= picture.length - 1; i++) {
            // for (int i = (bild.getStartrow()); i <= picture.length - 1; i++) {
            for (int j = 0; j <= picture.length - 1; j++) {
                if (bild.isSquared(i + 1, j + 1, picture[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
