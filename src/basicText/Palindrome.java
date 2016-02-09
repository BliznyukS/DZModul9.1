package basicText;

public class Palindrome {
    public static void main(String[] args){
        String palindrome = "moom";
        char charArray[] = palindrome.toCharArray();
        boolean isPalindrome = true;

        //Пооверка строки палиндрома
        for (int i =0; i < charArray.length / 2; i++){

            if (charArray[i] != charArray[charArray.length - i - 1]){
                isPalindrome = false;
                break;
            }

            // Один из методов проверки
            /*isPalindrome = isPalindrome && (charArray[i] == charArray[charArray.length - i - 1]);
            if (!isPalindrome){
                break;
            }*/
        }


        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
