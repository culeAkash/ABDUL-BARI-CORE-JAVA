package AccessModifiers.Access1;

/*
 *Access Modifiers:
 1. public: Can be accessed everywhere
 2. private: Can be accessed inside the class only
 3. default: Can be accessed only inside the same package
 4. protected: Can be accessed everywhere inside the same package, but only in the sub-class in different package 
 */


 public class P1 {
    
    public int x=10;

     private void display(){
        System.out.println("Welcome to ");
    }//display method can be used in the same class only

    protected void show(){
        System.out.println("Welcome to show");
    }

    void disp(){
        System.out.println("Welcome to disp");
    }
}

 class P2{
    public static void main(String args[]){
        P1 p= new P1();
        p.show();
        p.disp();
    }
}

