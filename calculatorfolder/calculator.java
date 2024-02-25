package calculatorfolder;

class simpcalculator
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }  
}

class advancecalc extends simpcalculator 
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

class veryadvancecalc extends advancecalc
{
    public double exp(int a, int b)
    {
        return Math.pow(a, b);
    }
}

public class calculator {
    public static void main(String[] args) 
    {

    }
    
}
