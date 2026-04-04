import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print("Stack is : " + st);
        System.out.print("\nLast pushed element: " + st.peek());
        //pop() removes last element
        st.pop();
        System.out.print("\nNew Stack: " + st);
    }
}
