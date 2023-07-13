
class Human 
{
    private int age;
    private String name;
    //constructors
    

    // public Human() // default constructor
    // {
    //     System.out.println("In constructor");
    //     age = 31; 
    //     name = "Alice"; 
    // }

    //    public Human(int a, String n)  //parameterized constructor
    // {
    //     age = a; 
    //     name = n; 
    // }

    public int getAge() {
        return age;
    }

    public Human() { //default constructor
        this.age = 41; 
        this.name = "Alena";
    }

     public Human(String name) { //parameterized constructor taking only one param
        this.name = name;
    }
     

    public Human(int age, String name) { //parameterized constructor
        this.age = age;
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class Demo7
{
    public static void main(String a [])
    {
         Human obj = new Human();
         //Human obj1 = new Human(20, "Prudence");
         System.out.println(obj.getName() + " : " + obj.getAge());
         //System.out.println(obj1.getName() + " : " + obj1.getAge());

        //  obj.setAge(31);
        //  obj.setName("Alice"); 
         //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}