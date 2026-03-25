//Plateform - LeetCode
//QuestionId - 155

import java.util.Stack;

public class Min_Stack {

    class MinStack {

    private Stack<Pair<Integer, Integer>> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.empty()){
            st.push(new Pair(val,val));
        }
        else{
            int min = Math.min(val,st.peek().getValue());
            st.push(new Pair(val, min));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}

}
