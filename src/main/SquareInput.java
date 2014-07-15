package main;

import java.util.Scanner;

/**
 * Created by riki on 15.07.2014.
 */
public class SquareInput {
Integer amount;
Scanner input;

public  SquareInput(Scanner picScanner){
    amount = Integer.parseInt(picScanner.nextLine());
    input = picScanner;


}
    private Integer getAmount(){
        return amount;
    }
    private String nextPicture(){
        //returns picture that has the width of the square picture and the data about the white and Black areas eg "3.##.##..."
        Integer width = Integer.parseInt(input.nextLine());
        String picture;
        picture = ""+width;
        picture = ""+ picture.length() + width;

        for (int i = 0; i < width ; i++) {
            picture= picture + input.nextLine();
        }
        return picture;
    }
    public String isSquare(){
       String result="";
        for (int i = 1; i <= this.getAmount(); i++) {
            SquarePicture picture = new SquarePicture(this.nextPicture());
            result = result + "\n Case #" +i +": " + picture.isSquare();
        }
        return result;
    }
}

