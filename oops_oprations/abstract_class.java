/*
->abstract method of an abstract class can be defined in its 
subclass
->An instance of an abstract class can not be created.
->Constructors are allowed.
->We are not allowed to create objects for an abstract class.
->If a class contains at least one abstract method then compulsory should declare a class as abstract 
*/
public class abstract_class {

    public static void main(String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}

abstract class Base {
    Base() {
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Constructor Called");
    }

    void fun() {
        System.out.println("Derived fun() called");
    }
}
