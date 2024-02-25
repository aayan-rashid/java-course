class operators
{
    public static void main(String args[])
    {
        //Arithmetic operators

        int n1 = 8;
        int n2 = 5;

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);

        n1 += 2;
        System.out.println(n1);

        n2 *=3;
        System.out.println(n2);

        n2++;
        System.out.println(n2);

        int n3 = 10;
        int rez = n3++;
        System.out.println(rez);
        System.out.println("n3=" + n3);

        int rez2 = ++n3;
        System.out.println(rez2);
        System.out.println(n3);


        //Relational operator
        
        int x = 5;
        int y = 7;

        boolean b1 = x > y;
        System.out.println(b1);

        boolean b2 = x < y;
        System.out.println(b2);

        boolean b3 = x >= y;
        System.out.println(b3);

        boolean b4 = x <= y;
        System.out.println(b4);

        boolean b5 = x != y;
        System.out.println(b5);

        boolean b6 = x == y;
        System.out.println(b6);


        //Logical operators

        int p = 7;
        int q = 9;
        int r = 8;
        int s = 6;

        boolean b7 = p<q & q>r;
        System.out.println(b7);

        boolean b8 = p>q || r>s;
        System.out.println(b8);

        boolean b9 = p!=q;
        System.out.println(!b9);


         
    }
}