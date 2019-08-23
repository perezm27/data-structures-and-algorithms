package utilities;

import stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<Character> validationStack = new Stack<>();
        char validation = ' ';

//  iterates through each character in my string
        for(char charChar : input.toCharArray()){
//  If we get a opening bracket push it into the stack
            if( charChar == '(' || charChar == '[' || charChar == '{'){
                validationStack.push(charChar);
            }
//  If we get a closing bracket pop
            if (charChar == ')') {
                validation = validationStack.pop();
//  Returns false if our popped element does not match
                if (validation != '(') {
                    return false;
                }
            }

            if (charChar == ']') {
                validation = validationStack.pop();
                if (validation != '[') {
                    return false;
                }
            }

            if (charChar == '}') {
                validation = validationStack.pop();
                if (validation != '{') {
                    return false;
                }
            }
        }
//  Lastly checks if the stack is empty or not
        return validationStack.isEmpty();
    }
}
