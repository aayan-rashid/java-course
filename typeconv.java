class typeconv
{
    public static void main(String args[])
    {
        int a = 5;
        byte b = (byte)a;
        System.out.println(b);

        byte c = 100;
        int d = c;
        System.out.println(d);

        int e = 10000;
        long l = e;
        System.out.println(l);

        long ll = 18913981;
        short s = (short)ll;
        System.out.println(s);

        float f = 34.56f;
        double dd = (float)f;
        System.out.println(dd);

        double ddd = 224556.455657;
        float ff = (float)ddd;
        System.out.println(ff);

        float f1 = 4.26f;
        int n = (int)f1;
        System.out.println(n);

        int  m = 257;
        byte bb = (byte)m;
        System.out.println(bb);

        byte k = 10;
        byte j= 30;
        int res = k*j;
        System.out.println(res); 
    }
}