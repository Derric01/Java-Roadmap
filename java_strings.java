//string
/*java Strings
Java Strings
Strings are used for storing text.

A String variable contains a collection of characters surrounded by double quotes:

ExampleGet your own Java Server
Create a variable of type String and assign it a value:

String greeting = "Hello";

String Length
A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

Example
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

More String Methods
There are many string methods available, for example toUpperCase() and toLowerCase():

Example
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

Example
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

//concatenation
Java String Concatenation
String Concatenation
The + operator can be used between strings to combine them. This is called concatenation:

ExampleGet your own Java Server
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
//numbers and strings
Java Numbers and Strings
Adding Numbers and Strings
WARNING!

Java uses the + operator for both addition and concatenation.

Numbers are added. Strings are concatenated.

If you add two numbers, the result will be a number:

ExampleGet your own Java Server
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)

If you add two strings, the result will be a string concatenation:

Example
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)

If you add a number and a string, the result will be a string concatenation:

Example
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)

//special characters 
ava Special Characters
Strings - Special Characters
Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

String txt = "We are the so-called "Vikings" from the north.";
The solution to avoid this problem, is to use the backslash escape character.

The backslash (\) escape character turns special characters into string characters:

Escape character	Result	Description
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
The sequence \"  inserts a double quote in a string:


ExampleGet your own Java Server
String txt = "We are the so-called \"Vikings\" from the north.";

The sequence \'  inserts a single quote in a string:


Example
String txt = "It\'s alright.";

The sequence \\  inserts a single backslash in a string:


Example
String txt = "The character \\ is called backslash.";

Other common escape sequences that are valid in Java are:

Code	Result	Try it
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
*/