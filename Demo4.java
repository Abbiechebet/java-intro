public class Demo4
{
    public static void main(String a[])
    {
        String name = "vanilla";
        name = name + " dalamere";
        System.out.println("holla " + name);

        //stored in dame address
        String s1 = "Vanilla";
        String s2 = "Vanilla";
        System.out.println(s1==s2);

        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");
        sb.deleteCharAt(2);
        //sb.insert(0,"Java ");  //add at the start
        sb.insert(5,"Java "); // add at the middle
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}