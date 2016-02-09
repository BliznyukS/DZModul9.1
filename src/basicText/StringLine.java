package basicText;

import java.util.Arrays;

public class StringLine {
    public static void main(String[] args){

        final char[] charArrayToString = {'a', 'b', 'c', 'd', 'e'};

        final String stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",","") // remove the comma
                .replace("[","") // remove the right bracket
                .replace("]","") // remove the left bracket
                .replace(" ","") // remove the white spaces
                .trim(); // trim empty cells at end

        System.out.println(stringToDisplay);



    }
}
