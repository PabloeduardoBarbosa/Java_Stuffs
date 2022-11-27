//java notes: 

public class Main {
	int x = 5;
}

//creating object example:

public class Main {
	int x = 5;
	
	public static void main(String[] args){
		Main myObj1 = new Main(); //object 1
		Main myObj2 = new Main(); //object 2
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}
}

//now the second file example: 

class Second {
	public static void main(String[] args){
		Main myObj = new Main; 
		System.out.println(myObj);
	}
}

//class attributes examples: 

public class Main(){
	//example of two attributes:
	int x = 5; 
	int y = 3;
}

//You can access attributes by creating an object of the class, and by using the dot syntax (.):

/*Example
Create an object called "myObj" and print the value of x:*/

public class main {
	int x = 5;
	
	public static void Main(String[] args){
		
		//it take the myObj to a a new main. And then, the only thing we need to do is to link it with its own attribute
		Main myObj = new Main();
		System.out.println(myObj.x);
		
		// -> 5 
	}
}

//Now it is the time to modify the Attributes: 

public class Main {
	int x;
	
	public class void main(String[] args){
		Main myObjs = new Main();
		myObj.x = 40;   
		System.out.println(myObj.x)
		//the result will be 40, since we've changed its value
	}
}



//changing the value of 'x' to another one: 

public class Main {
	int x = 10;
	
	public static void main(String[] args){
		Main myObj = new Main();
		myObj.x = 40; //now the value of 'x' will turn into 40
		System.out.println(myObj.x);
	}
}


//If you don't want the ability to override existing values, declare the attribute as final:

public class Main(){
	final int x = 10;
	
	public static void Main(String[] args){
		Main myObj = new Main();
		myObj.x = 12; //it will generate an erro, cuz we cannot assign a new value to the final attribute
		system.out.println(myObj);
	}
}


/*If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:*/

/*Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:*/

public class Main {
	int x = 5;
	
	
public static void main(String[] args){
	Main myObj1 = new main(); //object1
	Main myObj2 = new main(); //object2
	
	//it will only change the value of the myObj2 since we are on setting only its value. 
	myObj2 = 25;
	
	System.out.println(myObj1); //it outputs 5
	System.out.println(myObj2); //it outputs 25
	
	
	}
}


//Multiple attributes example:

//we can specify as many attributes as we want

public class Main {
	String fName = "Pablo";
	String lName = "Barbosa";
	
	int age = 18;
	
	public static void main(String[] args){
		Main myObj = new Main();
		
		//this will take the Fname and lName attrs and then parse it and at last print 
		System.out.println("My name "+ myObj.fName + "" + myObj.lName);
		//the same thing with the age:
		System.out.println("Age:" + myObj.age);
	}
}



//methods examples:

public class Main{
	static void myMethod(){
		System.out.println("Hello world!");
	}
}

//example of calling a method:

public class Main {
	static void myMethod(){
		System.out.println("Testing");
	}
	
	public static void main(String[] args){
		myMethod();
	}
}

//it outputs 'Testing';

//Static vs Publics methods

public class main {
	//Static method
	
	static void myStaticMethod(){
		System.out.println("Testing the program");
	}
	
	//now the public method:
	
	public void myPublicMethod(){
		System.out.println("Public methods must be called by creating objects");
	}
	
	//main method:
	
	public static void main(String[] args){
		myStaticMethod(); //calls the static method
		//in my publicMethod it would give us an error
		
		Main myObj = new Main(); //Create an object of Main
		myObj.myPublicMethod(); //it calls the public method on the object
	}
}

//accessing methods with an Object:

//creating the main class:

public class Main {
	
	//Create a fullThrottle() method
	public void fullThrottle(){
		System.out.println("The car is going fast as it can");
	}
	
	//Create a speed() method and add a parameter 
	public void speed(int maxSpeed){
		System.out.println("The max speed is "+ maxSpeed);
	}
	
	//inside main, call the methods on myCar object:
	
	public static void main(String[] args){
		Main myCar = new Main(); // it creates a myCar Object
		myCar.fullThrottle; //it calls the fullThrottle() method 
		myCar.speed; //it calls the speed() method
	}
	
}


//The car is goig fast as it can!
//Max speed is: 200



//Java constructors examples:

//create a main class:

public class Main {
	int x; //create a class attribute
	
	public Main(){
		x = 5; //it sets the initial value for the class attribute x = 5;
	}
	
	public static void main(String[] args){
		Main myObj = new Main(); //it creates an object of class Main (This will call the contructor)
		//It calls the value of x:
		System.out.println(myObj.x);
	}
}

//outputs 5

/*The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:*/

public class Main {
	int x;
	
	public Main(int y){
		x = y;
	}
	
	public static void main(String[] args){
		Main myObj = new Main(5);
		System.out.println(x);
	}
}

//since the value of y was passed to x, the same of will be its value

// 5 

//You can have as many parameters as you want:

public class Main {
	int modelYear;
	String modelName;
	
	public Main(int year, String name){
		modelYear = year; 
		modelName = name;
		
	}
	
	public static void main(String[] args){
		Main myCar = new Main(1969, "Mustang");
		System.out.println(myCar.modelYear + " "+ myCar.modelName);
	}
}

//it is going to outputs: 1969 Mustang 


//java modifiesrs examples: 

//example: 

public class Main {
	
	final int x = 10;
	final double pi = 3.14; 
	
	public static void main(String[] args){
		Main myObj = new main();
		myObj.x = 50; //it will generate an error, since we cannot change the value of final variable
		myObj.pi = 25; //it will generate an error, since we cannot change the value of final variable 
		System.out.println(x);
	}
}


//Static examples: 

public class Main {
	//Static method: 
	
	static void myStaticMethod(){
		System.out.println("Static methods can be called without creating objects");
	}
	
	//Public methods: 
	
	public void myPublicMethod(){
		System.out.println("Public methods must be called by creating objects");
	}
	
	//Main method: 
	
	public static main(String[] args){
		myStaticMethod(); //it calls the static methods without creatiing a new object
		
		Main myObj = new Main(); //it creates an object of Main
		myObj.myPublicMethod(); //it calls the public method 
	}
}

//abstract: 

//An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

//Code from file name Main.java
//abstract class 

abstract class Main {
	public String fName = "Pablo";
	public int age = 18;
	public abstract study(); // This is an abstract method
}

//Subclass inherit from main: 

class Student extends Main {
	public int graduationYear = 2018;
	public void study(){ //the body of the abstract method:
		System.out.println("Studying all day long");
	}
}

//End of the Main.java file 

//code from file name Second.java: 

class Second {
	public static main(String[] args){
		//create an object of the Student class (which inherits  attributes and methods from Main)
		Student myObj = new Student();
		
		Sytem.out.println("Name: " + myObj.fName);
		Sytem.out.println("Age: " + myObj.age);
		Sytem.out.println("Graduation year: " + myObj.graduationYear);
		myObj.study(); //it calls the abstract method
	}
}

//example of get and set: 

public class Person {
	private String name; //private = restricted access 
	
	//getter:
	public String getName(){
		return name;
	}
	
	//setter example: 
	public void setName(String newName){
		//here we take the private class and then we modify its value
		this.name = newName;
	}
}


//However, as the name variable is declared as private, we cannot access it from outside this class:

public class Main {
	public static void main(String[] args){
		Person myObj = new Person();
		myObj.name = "Pablo"; //it gives an error since it is Private 
		//it would only work if the variable was public
		System.out.println(myObj.name); //error 
	} 
}


//Instead, we use the getName() and setName() methods to access and update the variable: 

public class Main {
	public static void main(String[] args){
		Person myObj = new Person();
		myObj.setName("Pablo"); //here we sets the name variable to "Pablo"
		System.out.println(myObj.getName());
	}
}

//It outputs "Pablo"

//Java packs API: 

//To use a class or a package from the library, you need to use the import keyword:

import.package.name.Class; //it imports a class 
import.package.name.*; //it imports the whole package 

/*If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:*/

import.java.util.Scanner;

//example of using APIs on the code: 

import java.util.Scanner;

class MyClass {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter you username");
		
		//this is going the take the text of the code above, and then the user will type
		String userName = myObj.nextLine();
		System.out.println("The user name is " + userName);
	}
}

//Importing a package example: 

//example: 

import java.util.*;

//To create a package, use the package keyword:

package myPack;

class myPackageClass {
	public static void main(String[] args){
		System.out.println("This is my package");
	}
}

//Java inheritance example: 

//In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

class Vehicle {
	protected String brand = "Lamborghini"; //This is a vehicle attribute
	public void honk(){ //this is a vehicle method
		System.out.println("Honk, honk...")
	}
}

class Car extends Vehicle {
	private String modelName = "Aventador" //this is the car attribute
	public static void main(String[] args){
		
		//create a myCar object
		Car myCar = new Car();
		
		//calling the honk() method (form the vehicle class) on myCar object
		myCar.honk();
		
		//It displays the brand of the car and the model Name: 
		
		System.out.println(myCar.brand + " " + myCar.modelName);
		
	}
}

//if you try to access private classes it will give you an error. 


//Polymofirsm: 


//Polymorfism uses the same class to a lot of different thing, and that is an example of it:
class Animal {
	public void animalSound(){
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound(){
		System.out.println("The pig says: wee, wee");
	}
}

class Dog extends Animal {
	public void animalSound(){
		Sytem.out.println("The dog says: bow, bow");
	}
}

//Now we can create Pig and Dog objects and call the animalSound() method on both of them:

class Animal {
	public void animalSound(){
		System.out.println("The animal makes a sound");
	}
}

class pig extends Animal {
	public void animalSound(){
		System.out.println("The pig says: wee, wee");
	}
}

class Dog extends Animal {
	public void animalSound(){
		System.out.println("The dog says: bow, bow");
	}
}

class Main(){
	public static void main(String[] args){
		Animal myAnimal = new Animal(); // it creates an Animal Object
		Animal myPig = new Pig(); //it creates a pig object
		Animal myDog = new Dog(); //it creates a Dog object
		myAnimal.animalSound();
		myAnimal.myPig();
		myAnimal.myDog();
	}
}


//java inner classes example:

class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
}

public class Main {
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.innerClass myInner = myOuter.new InnerClass();
		System.out.println(myOuter + myInner);
	}
}

//Outputs 15 (5 + 15)

//Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

class OuterClass {
	int x = 10;
	
	private class InnerClass {
		int y = 5;
	}
}

public class main {
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.innerClass myInner = myOuter.new InnerClass();
		System.out.println(myOuter + myInner);
	}
}

//it gives us an error, since we cannot use private classes on this.


//Static inner classes: 
//for the example above to not give us an error, we need to do the following:

class outerClass {
	int x = 10;
	
	static class  InnerClass {
		int y = 5;
	}
}

public class Main {
	public static void(String[] args){
		outerClass.InnerClass myInner = new outerClass.InnerClass();
		System.out.println(myInner.y);
	}
}

//it is going to output 5;


//One advantage of inner classes, is that they can access attributes and methods of the outer class:

//Example:

class outerClass {
	int x = 10;
	
	class InnerClass {
		public int myMethod(){
			return x;
		}
	}
}

public class Main {
	public static void main(String[] args){
		outerClass myOuter = new outerClass();
		outerClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
	}
}

//it then outputs 10

//example of abstract class:

abstract class Animal {
	public abstract void animalSound();
	public void sleep(){
		System.out.println("zzz...");
	}
}


// Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

//Abstract class:

abstract class Animal {
	//abstract method does not have a body 
	public abstract void animalSound();
		//regular method:
		public void sleep(){
			System.out.println("zzz...");
		}
}

//Subclass inherit from animal:

class Pig extends Animal {
	public void animalSound(){
		//the body of animal sound is provided here:
		System.out.println("The pig says: wee, wee");
	}
}

class Main {
	public static void main(String[] args){
		Pig myPig = new Pig(); //create a pig object
		myPig.animalSound();
		myPig.sleep();
	}
}

//interfaces examples:

interface Animal {
	public void animalSound(); // interface methods does not have body
	public void run(); //interface methods does not have body
}

/*To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

*/

//Interface: 

interface Animal {
	public void animalSound(); //interface method does not have a body
	public void sleep(); //interface method does not have a body
}

//Pig implements the Animal interface:

class Pig implements Animal {
	public void animalSound(){
		//the body of animal sound is provided here:
		System.out.println("The pig says: wee, wee");
	}
	public void sleep(){
		//the body of sleep is provided here:
		System.out.println("zzz...");
	}
}

class Main {
	public static void main(String[] args){
		Pig myPig = new Pig(); //it creates a pig object
		myPig.animalSound();
		myPig.sleep();
	}
}

//To implement multiple interfaces, separate them with a comma:

interface FirstInterface {
	public void myMethod(); //interface method
}

interface SecondInterface {
	public void myOtherMethod(); //interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod(){
		System.out.println("Some text here");
	}
	
	public void myOtherMethod(){
		System.out.println("Some other  methods");
	}
}

class Main {
	public static void main(String[] args){
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}

/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:*/

//Example: 

enum Level {
	LOW, 
	MEDIUM,
	HIGH
}

//here we take the enum LOW:
Level myVar = Level.LOW;


//Enum inside classes:

public class Main {
	enum Level {
		LOW, 
		MEDIUM, 
		HIGH
	}
	
	public static void main(String[] args){
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}

//the output will be MEDIUM 

//Enum in a switch statement:

enum Level {
	LOW,
	MEDIUM, 
	HIGH 
}

public class Main {
	public static void  main(String[] args){
		Level myVar = level.MEDIUM;
		
		switch(myVar){
			case LOW:
			System.out.println("Low level");
			break;
			
			case MEDIUM: 
			System.out.println("Medium level");
			break;
			
			case HIGH:
			System.out.println("High level");
		}
	}
}

//The output will be: Medium level

//Loop through Enum:
//The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:

//Example:

for(Level myVar : Level.values()){
	System.out.println(myVar);
}

//the output will be LOW, MEDIUM, HIGH


//Java user Input:

//To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

import java.util.Scanner; //import scanner class

class Main {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in); //it creates a new scanner object
		System.out.println("Enter the username: "); 
		
		String userName = myObj.nextLine(); //it reads the user input 
		System.out.println("The user name is: " + userName); //It outputs the input
	}
}


//In the example below, we use different methods to read data of various types:

//Example:

import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please type you salary: ");
		
		//String input:
		String name = myObj.nextLine();
		
		//numerical input:
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		//ouput input by user:
		System.out.println("Name "+ name);
		System.out.println("Age"+ age);
		System.out.println("Salary "+ salary);
	}
}


//date and time examples in Java:

import java.time.LocalDate; //it imports the localDate class 

public class Main {
	public static void main(String[] args){
		LocalDate myObj = new LocalDate.now() //it creates a date object
		System.out.println(myObj); //it displays the current date
	}
}

//Display current time: 

//example: 

import java.time.localTime; //it imports the localTime class

public class Main {
	public static void main(String[] args){
		localTime myObj = localTime.now();
		System.out.println(myObj);
	}
}

//it will display the current time 

//Display current Date and Time
//To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:

import java.time.LocalDateTime; //it imports the localDateTime class 
import java.time.format.DateTimeFormatter //it imports the DateTimeFormatter class

public class Main {
	public static void main(String[] args){
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before fomatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formatDate);
	}
}

//Java array list example: 

import java.util.ArrayList; //it imports the Array List

ArrayList<String> car = new ArrayList(); Create an ArrayList Object

//Adding elements on the array:

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		ArrayList<String>  cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ferrari");
		cars.add("Ford");
		System.out.println(cars);
	}
}

//loop through an array list:

public class Main {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ferrari");
		cars.add("Lambo");
		cars.add("Honda");
		
		for(int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i));
		}
	}
}

//You can also loop through an ArrayList with the for-each loop:

//Example:

public class Main {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ferrari");
		cars.add("Lamborgini");
		cars.add("Honda");
		cars.add("Rolls Royce");
		
		for(String i : cars){
			System.out.println(i);
		}
	}
}


//Create an ArrayList to store numbers (add elements of type Integer):

//example

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		ArrayList<Intenger> myNumbers = new ArrayList<Intenger>();
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(30);
		myNumbers.add(40);
		
		for(int i : myNumbers){
			System.out.println(i);
		}
	}
}

//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

//Sort an ArrayList of Strings: 

import java.util.ArrayList; 
import java.util.Collections; //it imports the collection class 

public class Main {
	public static void main(String[] args){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ferrari");
		cars.add("Mazda");
		
		Collections.sort(cars) //it sorts the car
		for(String i : cars){
				System.out.println(i);
		}
	}
}


//now is time to do the same thing, but now for the integers:

import java.util.ArrayList;
import java.util.Collections; //it imports the collections class

public class Main {
public static void main(String[] args){
	ArrayList<Integer> myNumbers = new ArrayList<Intenger>();
	myNumbers.add(33);
	myNumbers.add(12);
	myNumbers.add(23);
	myNumbers.add(45);
	
	Collections.sort(myNumbers); //it sorts the number 
	
	for(int i : myNumbers){
		System.out.println(i);
		}
	}
}

//Java linked list example:

//importing the LinkedList class 

import java.util.LinkedList;

public class Main {
	public static void main(String[] args){
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Ferrari");
		cars.add("Lamborghini");
		
		System.out.println(cars);
	}
}

//Java Hash map examples: 

//Create a HashMap object called capitalCities that will store String keys and String values:

import java.util.HashMa; //it imports the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();

//Now it is time to add items on it: 

//The HashMap class has many useful methods. For example, to add items to it, use the put() method:

//Import the HashMap class: 

import java.util.HashMap;
import java.util.HashMap;

public class Main {
public static void main(String[] args){
		//create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new hashMap<String, String>();
		
		//adding keys and values onto that: 
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
	}
}

//Accessing an item: 
//To access a value in the HashMap, use the get() method and refer to its key:

//example:

capitalCities.get("England");

//removing an item example: 
//To remove all items, use the clear() method:

capitalCities.clear();

//HashMap size: 

//To find out how many items there are, use the size() method:

//Example:

capitalCities.size();

//Loop through the items of a HashMap with a for-each loop.

//Printing the keys:

for(String i : capitalCities.keySet()){
	System.out.println(i);
}

//now printing values like USA = Washington DC. It will only print the capital that is its value: 

for(String i : capitalCities.values()){
	System.out.println(i);
}


//Another example: 

//Print keys and values: 

for(String i : capitalCities.keySet()){
	System.out.println("Key: " + i + "value: " + capitalCities.get(i));
}

//Import the hashMap class:
import java.util.HashMap;

public class main {
	public static void main(String[] args){
		
		//create a HashMap object called people: 
		
		HashMap<String, integer> people = new HashMap<String, integer>();
		
		//adding keys and values (name and year);
		people.put("Pablo", 18);
		people.put("Eduardo", 29);
		people.put("Lucas", 32);
		people.put("Rogerio", 43);
		
		for(String i : people.keySet()){
			System.out.println("Key: " + i + "Value: " + people.get(i));
		}
	}
}



//Getting an iterator example:

//example: 

//Import the ArrayList class and the Iterator Class 

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main (String[] args){
		
		//Making a collection:
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ferrari");
		
		//getting the iterator:
		Iterator<String> it = cars.iterator();
		
		//printing the first item:
		System.out.println(it.next());
	}
}

//Looping through collection example:

//Example:

while(it.hasNext()){
	System.out.println(it.next());
}

//Now this is  an example of removing itens of a collection:

//Use an iterator to remove numbers less than 10 from a collection:

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args){
		ArrayList<String> numbers = ArrayList<String>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		
		Iterator<Intenger> it = numbers.iterator();
		while(it.hasNext()){
			Intenger i = it.next();
			if(i < 10){
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}