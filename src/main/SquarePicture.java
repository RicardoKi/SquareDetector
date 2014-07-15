package main;

/**
 * Created by riki on 15.07.2014.
 */
public class SquarePicture {
    Integer width;
    String picture;
    Character debug;
    public SquarePicture(String picture) {
        Integer digits = Integer.parseInt("" + picture.charAt(0));
         char[] platzhalter = new char[digits];

        picture.getChars(1,digits+1,platzhalter,0);
        width = Integer.parseInt(new String(platzhalter));
        this.picture = picture;
    }


    public String isSquare(){
        Integer count = 0;
        double root = 0;
        Integer end = 0;
        Integer start = 0;
        for (int i = 1; i <= width; i++) { //i=Zeilennummer
            Integer endOld = end;
            Integer startOld = start;
            start = 0;
            end = 0;
             Integer startrows = 0;
             Integer length = 0;

            for (int j = 1, n = width; j <= n; j++) { //j=Spaltennummer
                Integer digits = Integer.parseInt("" + picture.charAt(0));
                Integer curChar = digits+(i-1)*width +j;
                debug= picture.charAt(curChar);
                if (picture.charAt(curChar) == '#') count++;
                if (picture.charAt(curChar) == '#' && end == 0) {
                    if (j == n) {
                        end = j;
                    }
                    if (start == 0) {
                        start = j;
                        if (count == 1) {
                            startOld = start;
                            startrows = i;
                        }
                        if (length < (i - startrows) && length != 0) {
                            //System.out.println("Fläche entspricht keinem quadrat");
                            break;
                        }
                    }
                    if (!(start.equals(startOld))) {
                        //System.out.println("Falscher Startpunkt in zeile" + i + " Zeichen" + j);
                        break;
                    }

                } else {

                    if (start != 0 && end == 0) {
                        end = j - 1;

                        if (startrows == i) {
                            endOld = end;
                            length = end - start;
                        }
                        if (!(end.equals(endOld))) {
                            //System.out.println("Falscher Endpunkt in Zeile " + i + " Zeichen" + j);
                            break;
                        }
                    }
                }
            }
        }
        root = (Math.sqrt(count)) % 2;
        if (root == 0.0 | root == 1.0) {
            return("YES");
        } else {
            return("NO");
        }
    }
}
