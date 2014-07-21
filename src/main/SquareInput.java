package main;

import java.util.Scanner;

/**
 * Created by riki on 15.07.2014.
 */
public class SquareInput {
    private Integer amount;
    private Scanner input;

    public SquareInput(Scanner picScanner) {
        amount = Integer.parseInt(picScanner.nextLine());
        input = picScanner;
    }
    private char[][] nextPicture() {
        //returns picture that has the width of the square picture and the data about the white and Black areas eg "3.##.##..."
        Integer width = Integer.parseInt(input.nextLine());
        char[][] picture = new char[width][width];
        for (int i = 0; i < width; i++) {
            picture[i] = input.nextLine().toCharArray();
        }
        return picture;
    }
    public String isSquare() {
        String result = "";
        for (int i = 1; i <= amount; i++) {
            SquarePicture picture = new SquarePicture(this.nextPicture());
            result = result + "\n Case #" + i + ": " + picture.isSquare();
        }
        return result;
    }
}

