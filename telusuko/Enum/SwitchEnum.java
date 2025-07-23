package telusuko.Enum;

public class SwitchEnum {
public static void main(String[] args) {
    Status s = Status.Success;
    switch(s){
        case Running:
            System.out.println("All Good");
            break;
        case Failed:
            System.out.println("Stop");
            break;
        case Pending:
            System.out.println("Pending");
            break;
        case Success:
            System.out.println("Completed");
            break;
        default:
            System.out.println("Unknown status");
    }
}
}
