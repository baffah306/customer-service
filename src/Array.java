public class Array {

    public static void main(String[] args) {
        String[] cars = {"BMW","Honda","Mazda","Toyota","Benz","Mercedes"};
        System.out.println("My favourite car is " + cars[0]);
        for (int index = 0; index < cars.length; index++){
            System.out.println("Our new car is "+ cars[index]);
        }

    }
}
