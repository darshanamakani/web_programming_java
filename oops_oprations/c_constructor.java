public class c_constructor {
  String sname;

  public c_constructor() 
  {
    sname="rutvi"; 
  }

  public static void main(String[] args) {
    c_constructor myObj = new c_constructor();
    System.out.println(myObj.sname); // Print the value of x
  }
}