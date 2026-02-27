public class PalindromeCheckerApp {
public static void main (String[] args)
{
    System.out.println("Input text : madam");
    String str= "madam";
    StringBuilder rev= new StringBuilder();
    for (int i=str.length()-1;i>=0;i--) {
        rev.append(str.charAt(i));
    }
    if(str.contentEquals(rev)) {
        System.out.println("Is it a Palindrome? : true ");
    }
    else {
        System.out.println("Is it a Palindrome? : false ");
    }
}
}
