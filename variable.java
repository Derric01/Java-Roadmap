/*Java Variables
Variables are containers for storing data values.

In Java, there are different types of variables, for ex:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
type variableName = value;
The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and cannot contain whitespace
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names 
class variable{
public static void main(String[] args){
    String name = "John";
System.out.println(name);
final int myNum = 15;
//myNum = 20;  // will generate an error: cannot assign a value to a final variable
int myum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
String name = "John";
System.out.println("Hello " + name);
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
int x = 5;
int y = 6;
System.out.println(x + y); 
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
int x, y, z;q
x = y = z = 50;
System.out.println(x + y + z);
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
// Student data
String studentName = "John Doe";
int studentID = 15;
int studentAge = 23;
float studentFee = 75.25f;
char studentGrade = 'B';

// Print variables
System.out.println("Student name: " + studentName);
System.out.println("Student id: " + studentID);
System.out.println("Student age: " + studentAge);
System.out.println("Student fee: " + studentFee);
System.out.println("Student grade: " + studentGrade);

// Create integer variables
int length = 4;
int width = 6;
int area;

// Calculate the area of a rectangle
area = length * width;

// Print variables
System.out.println("Length is: " + length);
System.out.println("Width is: " + width);
System.out.println("Area of the rectangle is: " + area);


}
}*/


