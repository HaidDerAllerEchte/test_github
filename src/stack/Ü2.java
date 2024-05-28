package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ü2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib deinen Satz ein: ");
        String input = scanner.nextLine();
        if (checkBrackets(input)) {
            System.out.println("Korrekte Klammerung!");
        } else {
            System.out.println("Fehlerhafte Klammerung!");
        }
    }

    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
