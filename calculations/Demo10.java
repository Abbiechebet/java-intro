package calculations;

class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

public class Demo10
{
    public static void main (String a[])
    {
        Calc obj = new Calc();
        int r1 = obj.add(78, 45);
        int r2 = obj.sub(78, 45);

        System.out.println(r1 + " " + r2);

        AdvCalc10 obj1 = new AdvCalc10();
        int r3 = obj1.mult(78, 45);
        int r4 = obj1.div(78, 45);
        System.out.println(r3 + " " + r4);
    }
}