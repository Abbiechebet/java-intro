//  class Mobile1
//  {
//     //instance variables
//     String brand;
//     int price; 
//     String name;
//     //static String name;

//     public void show()
//     {
//         System .out.println(brand + " : " + price + " : " + name);
//     }
//  }
//  public class Demo5
//  {
//     public static void main(String a[])
//     {
//         Mobile1 obj1 = new Mobile1();
//         obj1.brand = "Apple";
//         obj1.price = 1500; 
//         obj1.name = "Smartphone";

//         Mobile1 obj2 = new Mobile1();
//         obj2.brand = "Samsung";
//         obj2.price = 1700; 
//         obj2.name = "Smartphone";

//         //Mobile.name = "Phone";

//         obj1.show();
//         obj2.show();
//     }
//  }




  class Mobile
 {
    //instance variables
    String brand;
    int price;

    //static variable
    static String name;

    //static block
    static
    {
        name = "Phone";
        System.out.println("In the static block");
    }

    //default values or the constructor
    public Mobile()
    {
        brand = " ";
        price = 500;
        System.out.println("In constrctor");
    }

    //instance method
    public void show()
    {
        System .out.println(brand + " : " + price + " : " + name);
    }
     
    //ststic method
     public static void show1(Mobile obj)
    {
        System .out.println("In static method " + obj.brand + " : " + obj.price + " : " + name);
    }

 }
 public class Demo5
 {
    public static void main(String a[]) //throws ClassNotFoundException
    {
        //Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500; 
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700; 
        Mobile.name = "Smartphone";
        
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
 }
