//what is annotation
class A1
{
     public void showDataBelongingToClass()
     {
        System.out.println("In class A1 show");
     } 
}

class B1 extends A1
{
    @Override
        public void showDataBelongingToClass()
     {
        System.out.println("In class B1 show");
     } 
}

public class Demo11C 
{
   public static void main(String a[])
   {
        B1 obj = new B1();
        obj.showDataBelongingToClass();
   }
}
