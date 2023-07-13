class InnerDemo
{
    int age;

    public void show()
    {
        System.out.println("in show method");
    }

    class Inner
    {
        public void config()
    {
        System.out.println("in config method");
    }
    }

    static class Inner2
    {
        public void program()
    {
        System.out.println("in program method");
    }
    }
}

abstract class D
{
    public abstract void drink();
    public abstract void caffeine();
}

public class Demo10H 
{
    public static void main(String a [])
    {
        InnerDemo obj = new InnerDemo();
        obj.show();

        InnerDemo.Inner obj1 = obj.new Inner();
        obj1.config();

        InnerDemo.Inner2 obj3 = new InnerDemo.Inner2();
        obj3.program();

        //Anonymous inner class
        InnerDemo obj2 = new InnerDemo()
        {
             public void show()
             {
                 System.out.println("in new show method");
             }

        };
        obj2.show();

        //abstract and anonymous inner class
        D obj4 = new D()
        {
             public void drink()
             {
                 System.out.println("in drink method");
             }

            public void caffeine()
            {
                 System.out.println("in caffeine method");
             }


        };
        obj4.drink();
        obj4.caffeine();
    }
}