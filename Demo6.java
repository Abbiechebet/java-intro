//Encapsulation
class Human 
{
    // // private int age = 31;
    // // private String name = "Alice";
    private int age;
    private String name;
    public int getAge() {
        return age;
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


    // //getters and setters
    // public int getAge()
    // {
    //     return age;
    // }
    //  public void setAge(int a)
    // {
    //     age = a;
    // }


    // public String getName()
    // {
    //     return name;
    // }
    //   public void setName(String n)
    // {
    //     name = n;
    // }

}


public class Demo6
{
    public static void main(String a [])
    {
         Human obj = new Human();
         obj.setAge(31);
         obj.setName("Alice"); 

         System.out.println(obj.getName() + " : " + obj.getAge());
    }
}