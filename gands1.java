class Person {

//private field
private int age;

// getter method
public int getter() {
return age;

//setter method
public void setter(int age) {
  this.age = age;
  }
}

class Main {
public static void Main(String[] args) {

//create an object of Person
Person p1 = new Person();

//change age using setter 
p1.setAge(24);

// access age using getter
System.out.println("My age is" +p1.getAge());
  }
}