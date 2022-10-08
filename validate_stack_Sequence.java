class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
            int size=pushed.length;
            Deque<Integer> stack=new LinkedList<>();
            int j=0;
            for(int i=0;i<size;i++){
                    stack.push(pushed[i]);
                    while (!stack.isEmpty() &&  stack.peek() ==popped[j])
                   {
                            j++;
                            stack.pop();
                    }
            }
       return stack.isEmpty(); 
    }
}
