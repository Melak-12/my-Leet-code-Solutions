class Solution {
    public int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack= new Stack();
        int size=temperatures.length;
        int ans[]=new int[size];
        for(int i=0;i<size;i++)
        {
            while(stack.size()>0 && temperatures[i]>temperatures[stack.peek()])
                ans[stack.peek()]=i-stack.pop();
            stack.push(i);
        }
        return ans;
      }
}
