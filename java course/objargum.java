
abstract class computer
{
    public abstract void code();
}


class desktop extends computer
{
    public void code()
    {
        System.out.println("desktop code...");
    }
}


class laptop extends computer
{
    public void code()
    {
        System.out.println("laptop code...");
    }
}

class coder
{
    public void develop(computer comp)
    {
        comp.code();
    }
}


public class objargum {
    public static void main(String[] args) {
        
        laptop lap = new laptop();
        lap.code();      

        desktop desk = new desktop();
        desk.code();

        System.out.println();

        computer com1 = new desktop();
        computer com2 = new laptop();

        coder cod = new coder();
        cod.develop(com1);
        cod.develop(com2);


    }
}
