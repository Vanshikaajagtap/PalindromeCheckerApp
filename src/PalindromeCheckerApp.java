import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "noon";
        System.out.println("Input text : " + str);
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        //iterate through original string
        for (char c : str.toCharArray()) {
            char reversedChar = stack.pop();
            if (c != reversedChar) {
                isPalindrome = false;
                break;
            }
        }

            System.out.println("Is it a Palindrome? : " + isPalindrome);


    }
}