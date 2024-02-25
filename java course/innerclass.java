class A
{
    
    int age = 10;
     
    public void showA()
    {
        System.out.println("show of A");
    }

    class B
    {
        public void showB()
        {
            System.out.println("show of B");
        }
    }

    static class C 
    {
        public void showC()
        {
            System.out.println("show of C");
        }
    }
}

abstract class D 
{
    public abstract void showD();
    public abstract void confD();
}


public class innerclass {
    public static void main(String[] args) {
        
        // anonymous inner class - creating A class object and providing specific methods to override
        A obj = new A()
        {
            public void showA()
            {
                System.out.println("show A in main method");
            }
        };

        System.out.println(obj.age);
        obj.showA();

        System.out.println();

        // directly calling class B obj error
        // B obj1 = new B();
        // obj1.showB();

        System.out.println();

        // creating B object using A.B reference 
        A.B obj2 = obj.new B();
        obj2.showB();

        // creating C object directly without A class object because static class c
        A.C obj3 = new A.C();
        obj3.showC();

        System.out.println();

        // abstract anonymous inner class - works because obj4 is obj of inner class and not of abstract class D
        D obj4 = new D() 
        {
            public void showD()    
            {
                System.out.println("show of D");
            }

            public void confD()
            {
                System.out.println("conf of D");
            }
        };
        obj4.showD();
        obj4.confD();
    }
}
