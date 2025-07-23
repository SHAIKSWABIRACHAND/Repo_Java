package telusuko.Enum;
/// Enum is a special class in Java that represents a group of constants (unchangeable variables, like final variables).
/// Enum is a special Java type used to define collections of constants.


/* 
enum Status{ //status is also a class while Running Failed PEnding and Success are objects
    Running,Failed,Pending,Success;
}
*/


public class demoEnum {
    public static void printStatus(){
        Status s = Status.Running; // s is an object of Status class
        Status[] ss = Status.values(); // returns an array of all the values in the enum
        for(Status i :ss){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
    //    printStatus();  // if you want to print all the values in the enum
        Status s = Status.Running;
        System.out.println(s); // prints Running
        System.out.println(s.ordinal()); // prints 0
        System.out.println(s.name()); // prints Running
        System.out.println(s.compareTo(Status.Pending)); // prints -1
        System.out.println(s.equals(Status.Running)); // prints true
        System.out.println(s.getDeclaringClass()); // prints class telusuko.Enum.Status
        
    }
}
