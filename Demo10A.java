import calculations.AVeryAdvCalc10;
import calculations.AdvCalc10;

public class Demo10A 
{
        public static void main (String a[])
    {

         AdvCalc10 obj = new AdvCalc10();
        int r1 = obj.add(78, 45);
        int r2 = obj.sub(78, 45);
        int r3 = obj.mult(78, 45);
        int r4 = obj.div(78, 45);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);


        AVeryAdvCalc10 obj1 = new AVeryAdvCalc10();
        int k1 = obj1.add(78, 45);
        int k2 = obj1.sub(78, 45);
        int k3 = obj1.mult(78, 45);
        int k4 = obj1.div(78, 45);
        double k5 = obj1.power(4, 2);

        System.out.println(k1 + " " + k2 + " " + k3 + " " + k4 + " " + k5);
    }
}