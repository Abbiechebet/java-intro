 class D1
{
    public void show1()
    {
         System.out.println("in D1 show");
    }
}

 class D2 extends D1
{
    public void show2()
    {
        System.out.println("in D2 show");
    }
}

public class Demo10F
{
    public static void main(String a[])
    {
        //typecasting
        double d = 4.5;
        int i = (int) d;
        System.out.println(i);

        // upcasting
        D1 ob = new D2();
        ob.show1();

        D1 obj = (D1)new D2();
        obj.show1();

        //Downcasting
        D2 obj1 = (D2) obj;
        obj1.show2();

    }
}
