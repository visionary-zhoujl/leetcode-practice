package simple;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class CQueue {
    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public static void main(String[] args) {
        CQueue queue = new CQueue();
//        queue.appendTail(1);
//        queue.appendTail(2);
//        queue.appendTail(3);
//        queue.appendTail(4);
//        queue.appendTail(5);

        System.out.println(queue.deleteHead());
    }
    public CQueue(){

    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.size()!=0){
            outStack.clear();
        }
        if (inStack.size()==0){
            return -1;
        }
        for (int i = 0; i < inStack.size(); i++) {
            outStack.push(inStack.pop());
        }
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        int result =  outStack.pop();
        while (!outStack.isEmpty()){
            inStack.push(outStack.pop());
        }
        return result;
    }
}
