class Pen {
    String color;
    String type;
    public void write() {
        System.out.println("writing something");
    }
    
    public void printColor() {
        System.out.println(this.color); 
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
      //  System.out.println("constructor called");
      this.name = name;
      this.age = age;
    }
}

public class color {
    public static void main(String[] args) {
        Student s1 = new Student("Shivani", 22);
       // s1.name = "Shivani";
       // s1.age = 22;
      s1.printInfo();
         
    }
    
}
