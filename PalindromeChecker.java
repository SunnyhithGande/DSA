import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker 
{
    public static boolean isPalindrome(String input) 
    {
        String sanitized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : sanitized.toCharArray()) 
        {
            queue.add(c);   
            stack.push(c);  
        }
        while (!queue.isEmpty()) 
        {
            if (queue.poll() != stack.pop()) 
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "Hello, World!";
        String str3 = "Racecar";

        System.out.println("\"" + str1 + "\" is a palindrome? " + isPalindrome(str1)); // true
        System.out.println("\"" + str2 + "\" is a palindrome? " + isPalindrome(str2)); // false
        System.out.println("\"" + str3 + "\" is a palindrome? " + isPalindrome(str3)); // true
    }
}
