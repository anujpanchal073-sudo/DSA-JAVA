//Plateform - LeetCode
//QuestionId - 20

import java.util.Stack;

public class Valid_parentheses {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp == '(' || temp == '{' || temp == '['){
                st.push(temp);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else if((temp == ')' && st.peek() == '(') || (temp == '}' && st.peek() == '{') || (temp == ']' && st.peek() == '[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }

}