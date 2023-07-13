JDK ---> JRE ---> JVM( and libraries)
Java code ---> Compiler(Javac) ---> Byte code ---> JVM

WORA --- write once run anywhere
Java is statically typed language (specifying)

Application is platform independent
JVM understands byte code and is platform dependent (cannot run on IOS)

.class file is the byte code

Primitive Datatypes
Integer
 int - 4 bytes 
 long - 8 bytes
 short - 2 bytes
 byte - 1  (....byte has max of 127)

Float
  4 - bytes
   e.g 5.6f

Double
  8 - bytes
 e.g 5.6

Bolean
  true or false

Character (char)
  2 - bytes
  single quotes


type conversion and casting
In type conversion, a compiler converts a lower data type into a higher data type. 
byte b = 127;
int a = 156;
a = b;

In typecasting, a higher data type is converted into a lower data type by the programmer.
byte b = 127;
int a = 12;
b = (byte)a;

float f = 1.2;
int b = (int)f;
// ans is 1....ignores every digit after the decimal point

byte b = 127;
int a = 257;
b = (byte)a;
// ans 257 % 256 = 1

operators
post increment and pre increment behave diferently while trying to assign or fetch the value
++ 
decrement --

Assignment operator =

Comparison operator 
<, >, ==, !=, <=, >=

equality operators
strict equality ===
loose equality ==

logical operators AND, OR, NOT
$$ (3 false)
|| (3 true)
! (when true returns false) 
  (ehen false returns true)

Ternary operator
? true : false

loops are good for repetition
for, while, do while

do while executes even once when the condition is false
for loop is used more often
while loop is preferred for reading the database


OBJECTS
have behaviours and properties
class is blue print of object
JVM creates object

stack memory..... FIFO
local variables and  reference variables are part of stack

heap memory ..... is an open space
instance variables and methods (declarations) are in heap
objects with new keyword are also stored here.
heap memory has addresses


ARRAYS

Type casting...
Enhanced array

Exceptions are run time errors

mutable string .... can change (StringBuffer (thread safe) and StringBuilder(not thread safe))
immutable string .... cannot change 

>>>> ENCAPSULATION
         instance variables should be made private

connections to the database are done in the constructors   

extends keywords for ineritance
every class in Java extends object class
multi-level inheritance not multiple inheritance

Naming convention

class - (MyData,Mobile, Human) 
constructor - Mobile(), Human()
interface - (Clickable, Runable)
variable - (marks,cars, phones) 
method - show(), getMyMarks()
constants - (PIE, BRAND)

combined words - camel casing (calculateMassOfObject, getName()) 0r snake casing (generate-Weight, )

Reference object  has a name 
        A obj = new A();
unonymous object----cannot be reused once created
        new A();  // object creation


child, sub, derived --- extends --- parent,super, base

Single level inheritance 
Calc ---- AdvCalc10 

Multilevel inheritance 
Calc ---- AdvCalc10 ---- AVeryAdvCalc10 

Java does not support multiple inheritance


parent class ----- child class
super class ------ sub class
base class ------- Derived class   

>>>> INHERITANCE
     is good in avoiding redundancy
     .class file is more important than .java file

Method Overloading 
---using the same method with different parameters --- ie the parameters might be of different length and even different types
---When two or more methods in the same class have the same name but different parameters,

Method Overriding In Java, method overriding occurs when a subclass (child class) has the same method as the parent class. 

Access Modifiers (for methods and variables)
   1.Public
Methods declared as public can be accessed outside a package
(same class, same package subclass, same package non-subclass,different package subclass and different package non-subclass)
   2.Private
is used from the same class only.
   3.Default
is used from the same class, same package subclass and same package non-subclass 
   4.Protected
is used from the same class, same package subclass, same package non-subclass and different package subclass    

>>>> POLYMORPHISM
poly - many
morphism - behaviour
types
   Compile time (late binding) eg overloading
   Runtime (late binding) eg overriding

Dynamic Method Dispatch

final keyword make a variable constant  
final keyword in a method stops overring
final keyword in a class stops inheritance

Object Class equals toString hashcode

Upcasting and Downcasting 

>>>> Abstraction
abstract keyword
...abstract method is used only with an abstract class
...to use an abstract method then we should have an abstract keyword
...Abstract is not restricted yo only abstract methods but can also have normal methods
...We cannot create object of an abstract class
..we can create a class to implement all the abstract methods and create its objects

inner class
class{
   variable
   method
   inner class
}
to create object of inner class you need object of outer class (to avoid that you declare inner class with static keyword)

Anonymous inner class is within the main method
can also be used for an abstract class

>>>>> INTERFACE is not a class
every method in interface is public abstract
we cannot create bjects of interfaces
variables in interface are final and static
interface is not instantiated
do not have memory in heap
multiple interfaces can be implemented in a class

enums---enumerations (are named constants)
enum is a class

Annotations
  @Override
  @Deprecated

funcional interface has only one method and used with anonymous inner class
Lambda Expression ->

Types of interfaces
1.Normal....has two or more methods
2.Functional/SAM(single abstract method)
3.Marker....has no methods(for updating sth to the compiler)

serialization
deserialization

Exceptions
errors   compile time error ..eg Synthax error
         Runtime error ...eg when execution of code just stops
         logical error ...eg adding 2+2 and getting output that is not 4

exception handling using try catch

Exception Hierarchy (Classes)
Object 
Throwable
     Error......ThreadDeath
                IoError
                Virtual machine error eg out of memory

     Exception....Runtime Exception (arithmethic,arrayoutofbounds,null)
                  SQL Exception
                  IO Exception

Runtime Exceptions are called unchecked Exceptions and the others are checked Exceptions.

throw keyword is for throwing exception

Custom exception class

Ducking exception using throws
class main handles exceptions
NOT A GOOD IDEA TO throw exception for MAIN because it is being called by JVM

 User Input using BufferedReader and Scanner