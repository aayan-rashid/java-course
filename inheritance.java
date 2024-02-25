class calc
{
    protected int func = 10;

    public int add(int a, int b)
    {
        System.out.println(func);
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }  
}


public class inheritance 
{
    public static void main(String[] args) 
    {
        calc c =  new calc();
        //c.func; --private var.
        System.out.println(c.func);
        
        calc c1 = new calc();
        
        int a = c1.add(5,7);
        int b = c1.sub(10,6);

        System.out.println(a + " " + b);

        advcalc a1 = new advcalc();
        
        //nt c = a1.multi(3,4);
        int d = a1.div(15,4);

        System.out.println(c + " " + d);

        advcalc a2 = new advcalc();

        int e = a2.add(3, 8);
        int f = a2.sub(7, 4);

        System.out.println(e + " " + f);

        veryadvcalc v1 = new veryadvcalc();
        double g = v1.exp(2, 4);
        int h = v1.add(5, 6);
        int i = v1.sub(7 , 3);
        int j = v1.multi(3, 5);
        int k = v1.div(10, 5);

        System.out.println(g + " " + h + " " + " " + i + " " + j + " " + k);
    }
}
