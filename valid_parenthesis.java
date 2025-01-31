//import java.util.Stack;

class Solution {
    class Stack {
        char[] data;
        int top;

        Stack(int capacity) {
            data = new char[capacity];
            top = -1;
        }

        boolean isEmpty() {
            return top == -1;
        }

        char peek() {
            return data[top];
        }

        void push(char c) {
            data[++top] = c;
        }

        char pop() {
            return data[top--];
        }
    }
    public boolean isValid(String s) {
        //Stack<Character> openBrackets = new Stack<>();
        Stack openBrackets = new Stack(s.length());
        for(int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '[' || bracket == '{') {
                openBrackets.push(bracket);
            }
            else {
                if(openBrackets.isEmpty()){
                    return false;
                }
                if((bracket == ')' && openBrackets.peek() == '(') || (bracket == '}' && openBrackets.peek() == '{') || (bracket == ']' && openBrackets.peek() == '[')) {
                    openBrackets.pop();
                  }
                  else {
                    return false;
                  }
                }
            }
            return openBrackets.isEmpty();
        }        
    }