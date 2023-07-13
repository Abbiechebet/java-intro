//final class
 final class D
{
    public void show()
    {
        System.out.println("in D show");
    }
}
class E
{
    //final method
    public final void show()
    {
        System.out.println("in E show");
    }
     public void add(int a, int b)
    {
        System.out.println(a + b );
    }
}

class F extends E
{
      public void add(int a, int b)
    {
        System.out.println(a + b + 10);
    }
}


public class Demo10D
{
    public static void main(String a[])
    {
        //final variable
      final int num = 90;
      System.out.println(num);

      E obj = new E();
      obj.show();
      obj.add(56,41);

      obj =new F();
      obj.add(56,41);


    }
}