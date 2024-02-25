class calculator
{
    int num = 10;
    public int add(int n1, int n2)
    {
        return (n1+n2);
    }

    public int add(int n1, int n2, int n3)
    {
        return (n1 + n2 + n3);
    }
}

class work
{
    void working()
    {
        System.out.println("working");
    }
    void notworking(int n)
    {
        if(n >= 10)
        {
            System.out.println("not working");
        }
        else
        {
            System.out.println("conition not passed");
        }    
    }
}

class classandobj
{
    public static void main(String a[]) 
    {
        int num1 = 5;
        int num2 = 7;
        int num3 = 9;

        calculator calc = new calculator();
        int res = calc.add(num1,num2);
        int rez = calc.add(num1,num2,num3);
        System.out.println(res);  
        System.out.println(rez);

        work w = new work();
        w.working();
        w.notworking(8);
        
        System.out.println(calc.num);
        calc.num = 2;
        System.out.println(calc.num);

        calculator cal = new calculator();
        cal.num = 5;
        System.out.println(cal.num);

    }
}
