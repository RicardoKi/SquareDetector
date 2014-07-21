package main;

import java.util.Scanner;

/**
 * Created by riki on 11.07.2014.
 */
public class SquareDetector {

    public static void main(String[] args) {
        Scanner feldscanner = new Scanner(System.in);
        SquareInput input = new SquareInput(feldscanner);
        System.out.println(input.isSquare());
    }
}
