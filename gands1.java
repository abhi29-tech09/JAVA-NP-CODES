class Person {

//private field
private int age;

//setter method
public void setAge(int age) {
  this.age = age;
  }

// getter method
public int getAge() {
return age;
}

}

class Main{
public static void Main(String[] args) {

//create an object of Person
Person p1 = new Person();

//change age using setter 
p1.setAge(24);

// access age using getter
System.out.println("My age is" +p1.getAge());
  }
}