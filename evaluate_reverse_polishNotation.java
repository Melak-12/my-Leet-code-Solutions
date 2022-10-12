public class Solution {
    public int evalRPN(String[] tokens) {
        int op1,op2;
    Stack<Integer> stack = new Stack<Integer>();
    for (String value : tokens) {
      if(value.equals("+")) {
        stack.add(stack.pop()+stack.pop());
      }
      else if(value.equals("/")) {
        op2 = stack.pop();
        op1 = stack.pop();
        stack.add(op1 / op2);
      }
      else if(value.equals("*")) {
        stack.add(stack.pop() * stack.pop());
      }
      else if(value.equals("-")) {
        op2 = stack.pop();
        op1 = stack.pop();
        stack.add(op1 - op2);
      }
      else {
        stack.add(Integer.parseInt(value));
      }
    }  
    return stack.pop();
  }
}
