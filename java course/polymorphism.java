class a1
{
    public void show()
    {
        System.out.println("A show ");
    }
}

class b1 extends a1
{
    public void show()
    {
        System.out.println("B show ");
    }
}

class c1 extends a1
{
    public void show()
    {
        System.out.println("C show ");
    }
}


public class polymorphism 
{
    public static void main(String[] args) 
    {
        a1 obj;
        obj = new a1();
        obj.show();
        
        obj = new b1();
        obj.show();

        obj = new c1();
        obj.show();
    }
    
}
