
public class wrapperclass{
    public static void main(String[] args) {
         
        int num = 7;

        // boxing: assigning primitive type value to object of class Integer
       // Integer num1 = new Integer(num); 
        //System.out.println(num1);

        // auto-boxing: assigning primitive type value directly to object type
        Integer num2 = num;
        System.out.println(num2);

        // auto-unboxing: assigning object value to primitive type
        int num3 = num2;
        System.out.println(num3);

        // converting string type to integer using wrapper Integer class and vice-versa

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*3);

        int num5 = Integer.sum(num3, num4);
        System.out.println(num5);

        String str1 = Integer.toString(num5);
        System.out.println(str1);

    }
}