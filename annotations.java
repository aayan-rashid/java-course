
class one
{
    public void show()
    {
        System.out.println("in one show");
    }

    public void conf()
    {
        System.out.println("in A conf");
    }
}

class two extends one 
{
    @Override
    public void show()
    {
        System.out.println("in two show");
    }
}

@FunctionalInterface
interface A 
{
    void showA();
    
    // functionalinterface will have only one method
    // void showA2();
}


class three implements A 
{
    public void showA()
    {
        System.out.println("in A show");
    }
}
@FunctionalInterface 
interface B 
{
    void showB();
}



public class annotations {
    public static void main(String[] args) {

        one obj = new two();
        obj.show();
        obj.conf();

        three obj1 = new three();
        obj1.showA();

        B obj2 = new B() {
            public void showB()
            {
                System.out.println("in interface B");
            }
        };
        obj2.showB();



    }
}
