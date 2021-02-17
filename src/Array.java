package gov.ng.gifmis;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"BMW","HONDA","MAZDA","TOYOTA","MERCEDES","VOLKSWAGEN","NISSAN"};
        String[] country = {"GERMANY","JAPAN","JAPAN","JAPAN","GERMANY","GERMANY","JAPAN"};
        for (int car_num = 0; car_num <= 6; car_num++) System.out.println((car_num+1)+"."+cars[car_num]);
        System.out.println("Enter the number for the brand of your car: ");
        Scanner car_type = new Scanner(System.in);
        int car = car_type.nextInt();
        switch (car) {
            case 1:
                System.out.println(cars[0]+" is from "+country[0]);
                break;
            case 2:
                System.out.println(cars[1]+" is from "+country[1]);
                break;
            case 3:
                System.out.println(cars[2]+" is from "+country[2]);
                break;
            case 4:
                System.out.println(cars[3]+" is from "+country[3]);
                break;
            case 5:
                System.out.println(cars[4]+" is from "+country[4]);
                break;
            case 6:
                System.out.println(cars[5]+" is from "+country[5]);
                break;
            default:
                System.out.println("Invalid Selection!");
            /*case 1 -> System.out.println(cars[0] + " is from " + country[0]);
            case 2 -> System.out.println(cars[1] + " is from " + country[1]);
            case 3 -> System.out.println(cars[2] + " is from " + country[2]);
            case 4 -> System.out.println(cars[3] + " is from " + country[3]);
            case 5 -> System.out.println(cars[4] + " is from " + country[4]);
            case 6 -> System.out.println(cars[5] + " is from " + country[5]);
            default -> System.out.println("Invalid Selection!");*/
        }
    }
}
