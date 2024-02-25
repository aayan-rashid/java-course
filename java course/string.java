

public class string
{
    public static void main(String[] args) 
    {
        String str = new String("constructor based string");
        System.out.println(str);

        str = "Hello";
        
        System.out.println(str);
        System.out.println("hash code: " + str.hashCode());
        System.out.println(str + " ayaan");
        System.out.println("length of string: " + str.length());
        System.out.println(str.concat(" concat successfull!"));

        System.out.println();
        System.out.println();

        String name = "aayan";
        System.out.println(name);

        name = name + " rashid";
        System.out.println(name);

        name += " goat";
        System.out.println(name);

        System.out.println(name);


        //StringBuffer class

        StringBuffer sb = new StringBuffer("hello");

        System.out.println(sb);
        System.out.println(sb.capacity());

        //sb = "hello";

        sb.append(" world");
        System.out.println(sb);

        System.out.println(sb.charAt(3));

        String st = sb.toString();
        System.out.println(st);

        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.insert(0, "yeaah.... "));
        System.out.println(sb.substring(5));
    }    
}
