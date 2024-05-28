package stack;

import java.util.*;

public class Ü3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib einen UPN-Ausdruck ein (z.B. 12 34 + *): ");
        String input = scanner.nextLine();
        List<String> tokens = Arrays.asList(input.split("\\s+"));
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    System.out.println("Fehler: Nicht genügend Operanden für den Operator " + token);
                    return;
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = evaluate(token, operand1, operand2);
                stack.push(result);
            }
        }

        if (stack.size() == 1) {
            System.out.println("Ergebnis: " + stack.pop());
        } else {
            System.out.println("Fehler: Ungültiger Ausdruck");
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static double evaluate(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Fehler: Division durch Null");
                    System.exit(1);
                }
                return operand1 / operand2;
            default:
                System.out.println("Fehler: Ungültiger Operator " + operator);
                System.exit(1);
                return 0; // Unreachable
        }
    }
}
