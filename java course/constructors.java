
class human
{
    int age;
    String name;

    public human()
    {
        name = "ayaan";
        age = 20;
        System.out.println("constructor called");
    }

    public human(int a,  String str)
    {
        this.age = a;
        this.name = str;
    }

    public void show()
    {
        System.out.println("called show method");
    }
}


  public class constructors {
    public static void main(String[] args) {

        human h1 = new human();
        human h2 = new human();

        System.out.println(h1.age + h1.name);
        System.out.println(h2.age + h2.name);

        human h3 = new human(25,"john");
        System.out.println(h3.age + " " + h3.name);

        System.out.println();
        System.out.println();

        //anonymous object

        new human();

        new human().show();
    }
}
