class mobile
{
    String brand;
    int price;
    static String name = "smartphone";

    static
    {
        name = "android";
        System.out.println("android mobile");
    }

    public mobile()
    {
        brand = "defualt";
        price = 200;
        name = "phone";
    }

    public void details()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void report()
    {
        System.out.println(name);  
    }

    public static void report_new(mobile mob)
    {
        System.out.println(mob.brand + " : " + mob.price + " : " + name);
    }
}

public class sta_tic {
    public static void main(String[] args)
    {
        mobile m1 = new mobile();
        m1.brand = "samsung";
        m1.price = 1000;

        mobile m2 = new mobile();
        m2.brand = "apple";
        m2.price = 5000;

        m1.details();
        m2.details();

        mobile m3 = new mobile();
        m3.brand = "moto";
        m3.price = 500;
        mobile.name = "dial phone";

        m3.details();
        m2.details();
        m1.details();

        mobile.report();

        System.out.println();

        mobile.report_new(m1);

        mobile mo1 = new mobile();
        System.out.println(mo1.brand);
        System.out.println(mo1.price);

        mo1.brand = "redmi";
        mo1.price = 700;

        mo1.details();
        mobile.report_new(mo1);
        mobile.report();
    }
}
