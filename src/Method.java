public class Method {

    public static void printSomething() {
        System.out.println("This is just a method");
    }

    public static String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        printSomething();
        if (getName("john") != "Nathan") {
            System.out.println("You Don't Belong Here");
        } else {
            System.out.println("Welcome ");
            System.out.println("Thank You ");
            System.out.println("crypto");

        }
    }
}
