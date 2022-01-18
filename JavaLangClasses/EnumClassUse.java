
enum Dept{
    //All these values are static and final
    CS("Akash","block A"),IT("Kuki","Block B"),ECE("Danish","Block C"),CIVIL("Amit","Block D");//Assign values corresponding to a enum value
    //When the enum is constructed in main main() constructors of all the enum values will get called to make the list one time initially

    //enum can have a constructor but only can be default or private

    //for each identifier these properties will be created
    String head;
    String location;
    private Dept(String head,String location){
        // System.out.println(this.name());
        this.head=head;
        this.location=location;
    }
    //Each enum identid=fier can be treated as an object

    public String getHeadName(){
        return this.head;
    }

    public String getLocation(){
        return this.location;
    }



    public void display(){
        System.out.println(this.name()+"=>"+this.ordinal());
    }
}
//It forms a user-defined variable which can have limited values


public class EnumClassUse {
    public static void main(String[] args) {
        Dept d= Dept.ECE;//can only use the value assigned inside the enum declaration
        System.out.println(d.ordinal());
        System.out.println(d.name());
        
        //to get array of values of the enum
        Dept list[]= Dept.values();
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }

        // enums are widely used in switch cases
        // switch(d){
        //     case CS: System.out.println("Head: Akash \nBlock: A");
        //     break;
        //     case IT: System.out.println("Head: Kuki \nBlock: B");
        //     break;
        //     case CIVIL: System.out.println("Head: Danish \nBlock: C");
        //     break;
        //     case ECE: System.out.println("Head: Amit \nBlock: D");
        //     break;
        // }

        d.display();

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
    
}
