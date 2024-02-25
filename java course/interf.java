
interface A 
{   
    
    // varirables in interface - final and static variables
    int age = 20;
    String name = "Ayaan";
    
    
    //methods in interface - public abstract type pre-defined
    void show();
    void conf();
}

interface X
{
    void run();
}

interface Y extends X
{
    void stop();
}

class B implements A,Y
{

    public void show() {
        System.out.println("show method");
    }

    public void conf() {
        System.out.println("conf method");
    }

    public void run() {
        System.out.println("run method");
    }

    public void stop() {
        System.out.println("stop method");
    }
    
}



public class interf {
    public static void main(String[] args) {
        A obj;

        System.out.println(A.name);
        System.out.println(A.age);

        // cant create object of interface A
        //obj = new A();

        obj = new B();
        obj.show();
        obj.conf();

        // cant call stop from A type obj
        //obj.stop();
        System.out.println();

        Y obj2 = new B();
        obj2.run();
        obj2.stop();
    }
}
