package main;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.IntSummaryStatistics;
import java.util.Scanner;

/**
 * Created by riki on 11.07.2014.
 */
public class SquareDetector {

    public static void main(String[] args) {
       /* Scanner feldscanner = new Scanner(System.in);
        Integer anzBilder = Integer.parseInt(feldscanner.nextLine());
        for (int h = 1; h <= anzBilder; h++) {
            double root = 0;
            Integer count = 0;
            Integer start = 0;
            Integer end = 0;
            Integer startrows = 0;
            Integer length = 0;
            Integer groesse = Integer.parseInt(feldscanner.nextLine());
            for (int i = 1; i <= groesse; i++) {
                Integer endOld = end;
                Integer startOld = start;
                end = 0;
                start = 0;
                String zeile = (feldscanner.nextLine());
                for (int j = 1, n = zeile.length(); j <= n; j++) {
                    if (zeile.charAt(j - 1) == '#') count++;
                    if (zeile.charAt(j - 1) == '#' && end == 0) {
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
                        if (!start.equals(startOld)) {
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
                            if (!end.equals(endOld)) {
                                 //System.out.println("Falscher Endpunkt in Zeile " + i + " Zeichen" + j);
                            }
                        }
                    }
                }
            }
            root = (Math.sqrt(count)) % 2;
            if (root == 0.0 | root == 1.0) {
                System.out.println("Case #" + h + ": YES");
            } else {
                System.out.println("Case #" + h + ": NO");
            }
       }
    */
        Scanner feldscanner = new Scanner(System.in);
        SquareInput input= new SquareInput(feldscanner);
        System.out.println(input.isSquare());

    }
}
