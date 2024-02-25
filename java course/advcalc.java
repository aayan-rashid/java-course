public class advcalc extends calc 
{
    public int multi(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }

}

class veryadvcalc extends advcalc
{
    public double exp(int a, int b)
    {
        return Math.pow(a, b);
    }
}
