class Student
{
    int rollno;
    String name;
    int marks;
}
public class Demo3
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Meli";
        s1.marks = 69;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Cherono";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sang";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        //enhanced for loop
        for (Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
