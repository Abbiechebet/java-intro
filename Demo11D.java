//funcional interface with anonymous inner class

@FunctionalInterface
interface A2
{
    void show();
}

public class Demo11D
{
    public static void main(String a[])
    {
        A2 obj = new A2()
        {
            public void show()
            {
                System.out.println("Functional interface with anonymous inner class ");
            }
        };
        obj.show();
    }
}