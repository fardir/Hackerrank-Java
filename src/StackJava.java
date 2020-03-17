import java.util.Scanner;
import java.util.Stack;

public class StackJava {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String input=in.next();
            System.out.println(isBalanced(input));
        }
        in.close();

    }

    static boolean isBalanced(String simbol){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < simbol.length(); i++){
            char ch = simbol.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else if (stack.empty()){
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') ||
                    (top == '[' && ch != ']') ||
                    (top == '{' && ch != '}')){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
