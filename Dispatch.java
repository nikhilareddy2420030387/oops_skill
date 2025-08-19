package oops_skill;

class A {
    void m1() {
        System.out.println("Inside A's m1 method");
    }
}

class B extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside C's m1 method");
    }
}

// Driver class
class Dispatch {
    public static void main(String args[]) {
        // object of type A
        A a = new A();
        // object of type B
        B b = new B();
        // object of type C
        C c = new C();

        // obtain a reference of type A
        A ref;

        ref = a;  // ref refers to an A object
        ref.m1(); // A's version

        ref = b;  // ref refers to a B object
        ref.m1(); // B's version

        ref = c;  // ref refers to a C object
        ref.m1(); // C's version
    }
}
