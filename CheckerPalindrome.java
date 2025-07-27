import java.util.Scanner;

public class CheckerPalindrome {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Characters:");
        String input = sc.next();
        if (isPalindrome(input)) {
            System.out.println(input + " Is A Palindrome");
        } else {
            System.out.println(input + " Is Not A Palindrome");
        }
        sc.close();
    }
}
