package ExceptionHandling;



class StackOverflowException extends Exception{

    public String toString(){
        return "Stack is full";
    }
}

class StackUnderflowExcaption extends Exception{

    public String toString(){
        return "Stack is empty";
    }
}


class Stack{

    private int[] stack= new int[5];
    private int top=-1;

    //method to push element to the stack
    public void push(int element) throws StackOverflowException{
        if(this.top>=this.stack.length-1){
            throw new StackOverflowException();
        }
        top++;
        this.stack[top]= element;
    }

    //method to pop
    public int pop() throws StackUnderflowExcaption{
        if(this.top==-1){
            throw new StackUnderflowExcaption();
        }
        int e= this.stack[top];
        top--;
        return e;
    }

}



public class StackUse {
    public static void main(String[] args) {
        Stack stack= new Stack();
        try{
        stack.push(3);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        // System.out.println(stack.pop());
        }
        catch(StackOverflowException e){
            System.out.println(e);
        }
        catch(StackUnderflowExcaption e){
            System.out.println(e);
        }


    }
}
