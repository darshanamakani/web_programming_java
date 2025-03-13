public class method_class
 {
      // Static method
     static void s_method()
    {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
     public void p_method()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args)
    {
        s_method(); // Call the static method
                    // myPublicMethod(); This would compile an error

        method_class    myObj = new method_class(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
        myObj.p_method(); // Call the public method on the object
    }
 }