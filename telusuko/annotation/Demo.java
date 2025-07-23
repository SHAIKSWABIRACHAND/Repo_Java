package telusuko.annotation;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        b.showTheExixtingDriverOfTheCompany();
        a.showTheExixtingDriverOfTheCompany();

    }
}
class A{
    public  void showTheExixtingDriverOfTheCompany(){
        System.out.println("Existing driver of the company A" );
    }
}
class B extends A{
    @Override
    public void showTheExixtingDriverOfTheCompany(){
        System.out.println("Existing driver of the company B");
    }
}

