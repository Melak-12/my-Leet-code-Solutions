class MinStack{
Stack<Integer> stack;
int min ;
public MinStack() {
    min = Integer.MAX_VALUE;
    stack = new Stack<>();
}

public void push(int x) {
    if(x <= min){
        stack.push(min);
        min =x;
    }
    stack.push(x);
}
public void pop() {
    int x = stack.pop();
    if(x == min){
        min = stack.pop();
    }
}

public int top() {
    return stack.peek();
}

public int getMin() {
    return min;
}
}
