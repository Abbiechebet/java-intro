class Calculator 
{
    int num = 23;
     //public int add()
     public int add(int n1, int n2, int n3)
     {
        return n1 + n2 + n3;
     }
      public int add(int n1, int n2)
     {
        return n1 + n2;
     }
      public double add(double n1, int n2)
     {
        return n1 + n2;
     }
}

public class Demo
{
    public static void main (String a[])
    {
        // int num10 = 9;
        // int num11 = 8;

        // Calculator calc = new Calculator();
        // int result = calc.add(num10, num11);
        // System.out.println(result);

        
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        //obj is a reference variable
        double r1 = obj.add(4.5, 6);
        System.out.println(r1);

        obj1.num = 8;
        System.out.println(obj.num); 
        System.out.println(obj1.num); 
    }
}