/*Polymorphism
The word polymorphism is derived from the Greek words poly(meaning many), and morph(meaning form). Thus, polymorphism is the ability of an object to take more than one form.

Polymorphism is of two types:
Compile time polymorphism
Run time polymorphism
 

i. Compile-time polymorphism:
Java doesn’t support operator overloading and hence compile-time polymorphism is not possible in java.

But we can overload multiple functions with same name and different parameters or different type of parameters.

Example:

class AddMethods {
    static int AddNums(int a, int b) {
        return (a+b);
    }
    
    static int AddNums(int a, int b, int c) {
        return (a+b+c);
    }
    
    static double AddNums(double a, double b) {
        return (a+b);
    }
}

public class Example1 {

    public static void main(String[] args) {
        System.out.println("Addition of two integers: "+ AddMethods.AddNums(6, 11));
        System.out.println("Addition of three integers: "+ AddMethods.AddNums(6, 11, 5));
        System.out.println("Addition of two decimal numbers: "+ AddMethods.AddNums(6.3, 2.8));
    }
} 
 

Output:

Addition of two integers: 17
Addition of three integers: 22
Addition of two decimal numbers: 9.1
 

Here we have defined three methods with same name, but the parameters passed inside each differ by either the data type or the number of arguments passed. And we get output from each of these methods based on the input provided.

 

ii. Run-time polymorphism:
Run-time polymorphism or dynamic method dispatch involves overriding a method at run-time instead of compile-time.

Example:

class Color {
    void paint() {
        System.out.println("I'm Painting.");
    }
}
    
class RedPaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Red color.");
    }
}
    
class BluePaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Blue color.");
    }
}


public class Example2 {

    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
}
 

Output:

I'm Painting with Red color.
I'm Painting with Blue color.

Child classes have overridden the method of attribute parent class. Hence, when we create object of child class, then the method inside the child class is executed because it has more priority.

 */