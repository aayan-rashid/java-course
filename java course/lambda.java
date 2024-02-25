
interface A 
{
    void show(int i);
}

interface B
{
    void showB(int i);

    // cant declare more than 1 method as using lambda we will have to define both methods which is not possible.
    // thus interface must be functional interface
    //void showB_intval(int i);
}


interface C 
{
    int add(int a, int b);
}



public class lambda {
    public static void main(String[] args) {

        A obj = new A() {
            public void show(int i)
            {
                System.out.println("in A show " + i);
            }
        };
        obj.show(3);

        // using lambda "->" to reduce object syntax
        B obj2 = (i) -> System.out.println("in B show " + i);
        obj2.showB(8);

        B obj3 = j -> System.out.println("in B show using reduced lambda without int and () " + j);
        obj3.showB(9);


        // int return type method using anonymous class interface 
        C obj4 = new C() 
        {
            public int add(int a, int b)    
            {
                return a+b;
            }
        };
        int res = obj4.add(10,20);
        System.out.println(res);

        // using lambda for reduced return type method
        C obj5 = (i,j) -> i+j;
        int res2 = obj5.add(30, 40);
        System.out.println(res2);
    }
     
}