//Dynamic Method Dispatch in Polymorphism

class D
{
    public void show()
    {
        System.out.println("in D show");
    }
}
class E extends D
{
    public void show()
    {
        System.out.println("in E show");
    }
}

class F extends D
{
    public void show()
    {
        System.out.println("in F show");
    }
}


public class Demo10C
{
    public static void main(String a[])
    {
        D obj =new D();
        obj.show();

        // D obj =new E();
        // obj.show();

        obj =new E();
        obj.show();

        obj =new F();
        obj.show();

    }
}