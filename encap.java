class human
{
    private String name = "ayaan";
    private int age = 21;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() { 
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


public class encap {
    public static void main(String[] args) {

        human h1 = new human();

        System.out.println(h1.getAge());        
        System.out.println(h1.getName());

        human h2 = new human();
        h2.setAge(20);;
        h2.setName("rashid");

        System.out.println(h2.getAge() + " : " + h2.getName()); 
    }
}
