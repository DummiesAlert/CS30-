/*

1. The has-a function is used to minimize the amount of code that would be duplicated and be used to reference an instance in a class to another class 
or within its own class with different instances and has a composition that is a has a. Therefore a is-a is an inheritance and has a relation occuring 
when one class inherits another attributes. (In simple terms, a has-a relationship is a class that contains a class member variables within the class 
while a is-a is derived from an existing class. 

For example:

has-a relationship: a cat has a tail and lightbulb with the coils
is-a relationship: if a class lightbulb inherits another class light, then the lightbulb has a relationship with light. 

2. Both the base class with the public method go() and the derived class with the public method stop() is applicable to the object that is in a derived 
class and derived from the base class.

3. The abstract method does not have any implementation, but it only exists when itself is declared, the abstract method can override other abstract methods 
and methods of any kind, except for methods that are declared as final. (In simple words: An abstract method is a method that has been declared but not 
implemented and overriding a method is a subclass overriding a superclass.)

For example: 

public class example 
{
public static void main(String args[]) {
}
}

4. An abstract class containing one or more abstract methods is required to be declared abstract, otherwise it won’t work properly. An interface with abstract 
methods cannot be inherited in any sort or form but can be implemented by infinite amount of classes. 

For example:

Abstact Class:

public abstract class Example{
public abstract void draw();
}

Interface: 

public interface Example{
void draw();
}


6. 

a) The method type is abstract and public (assigns an “int”)

b) “Wo” is the interface

c) doThat() is within “Roo” because of the methods, the interface has to be defined in that exact method’s class. (It tells the method to return an “int” value)

d) doThis(), doNow(), and doThat() is available.

e) The doThis() implementation in “Roo” overrides the doThis() in “Bo”. Moreover it can confuse the code and mistaken for another method in the class. 

f) Super(1) in “Roo” implements the value 1 to the x variable in “Bo”, which calls a base class. 

g) Yes, the doThis() method in Bo is able to converse with an “Roo” object, if the Roo object refers to an Bo object. So, it does not call on the “Roo” object. 

h) Yes, the Roo method can use the doThis() method and call on them within Bo, by using super, which calls on “Bo”

*/