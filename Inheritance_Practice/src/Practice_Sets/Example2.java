package Practice_Sets;
class Basee {
    public void showw() {
       System.out.println("Base::show() called");
    }
}
  
class Drive extends Basee {
    public void showw() {
       System.out.println("Derived::show() called");
    }
}
  
class Example2 {
    public static void main(String[] args) {
        Basee b = new Drive();
        b.showw();
    }
}