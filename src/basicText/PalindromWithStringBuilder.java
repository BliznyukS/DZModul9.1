package basicText;

public class PalindromWithStringBuilder {
    public static void main(String[] args){
        String palindrome = "moom";

        StringBuilder builder = new StringBuilder(palindrome);

        builder.reverse();

        if (palindrome.equals(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
