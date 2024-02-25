class simpcalc
{
    public int add(int a, int b)
    {
        return a+b;
    }
}

class advcal extends simpcalc
{
    public int add(int a, int b)
    {
        return a+b+1;
    }
}


public class methodoverride {
    public static void main(String[] args)
    {
        advcal a = new advcal();
        int res = a.add(3, 4);
        System.out.println(res);

        simpcalc s = new advcal();
        int res1 = s.add(1, 8);
        System.out.println(res1);
    }
}
