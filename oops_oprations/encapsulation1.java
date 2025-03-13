public class encapsulation1 {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "John";
    System.out.println(p.name);
  }
}
class Person 
{
 String name;

   // Getter
String getName() {
     return name;
   }

   // Setter
void setName(String newName) {
     this.name = newName;
   }
}