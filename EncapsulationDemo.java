package oops_skill;

//Java program demonstrating Encapsulation
class Employee {
 private String name;

 // Getter method
 public String getName() {
     return name;
 }

 // Setter method
 public void setName(String name) {
     this.name = name;
 }
}

public class EncapsulationDemo {
 public static void main(String[] args) {
     Employee emp = new Employee();
     emp.setName("Nikhila");  // setting value
     System.out.println("Employee Name => " + emp.getName());
 }
}
