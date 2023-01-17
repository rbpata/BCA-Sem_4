//A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers, 3 to car
//lighting and 4 to air purifiers. All other items have code 5 or more. While selling goods, a
//sales tax of 2% to seat covers, 3% to steering wheel covers, 4% to car lighting, 2.5% to
//air purifiers and 1.2% to other items is charged. A list containing the product code and
//price is given for making a bill. Write a java program using switch statements to prepare
//a bill.
package Unit1_Practicals;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        double price, qty, tax;
        int ch;

        Scanner sc = new Scanner(System.in);

        System.out.print("\n================== CAR ACCESSORIES SHOP =================");
        System.out.print("\n1.Seat Cover \n2.Steering Wheel Covers \n3.Car Lighting \n4.Air Purifiers \n5.Other Items");
        System.out.print("\nEnter Your Choice :- ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("\nEnter Price of the Seat Cover :- ");
                price = sc.nextDouble();
                System.out.print("\nEnter the Quantity Of the Product :- ");
                qty = sc.nextDouble();
                tax = (price * 3) / 100;
                System.out.print("\n------------------- BILL -------------------");
                System.out.print("\nPrice :- " + price + "\nQuantity :- " + qty + "\nSales Tax (2%) :- " + (tax * qty));
                System.out.print("\n\nTotal Amount After Including TAXES :- '" + ((price * qty) + (tax * qty)) + "'");
                System.out.print("\n--------------------------------------------");
                break;
            case 2:
                System.out.print("\nEnter Price of the Steering Wheel Covers :- ");
                price = sc.nextDouble();
                System.out.print("\nEnter the Quantity Of the Product :- ");
                qty = sc.nextDouble();
                tax = (price * 2) / 100;
                System.out.print("\n------------------- BILL -------------------");
                System.out.print("\nPrice :- " + price + "\nQuantity :- " + qty + "\nSales Tax (2%) :- " + (tax * qty));
                System.out.print("\n\nTotal Amount After Including TAXES :- '" + ((price * qty) + (tax * qty)) + "'");
                System.out.print("\n--------------------------------------------");
                break;
            case 3:
                System.out.print("\nEnter Price of the Car Lighting Covers :- ");
                price = sc.nextDouble();
                System.out.print("\nEnter the Quantity Of the Product :- ");
                qty = sc.nextDouble();
                tax = (price * 4) / 100;
                System.out.print("\n------------------- BILL -------------------");
                System.out.print("\nPrice :- " + price + "\nQuantity :- " + qty + "\nSales Tax (2%) :- " + (tax * qty));
                System.out.print("\n\nTotal Amount After Including TAXES :- '" + ((price * qty) + (tax * qty)) + "'");
                System.out.print("\n--------------------------------------------");
                break;
            case 4:
                System.out.print("\nEnter Price of the Air Purifiers :- ");
                price = sc.nextDouble();
                System.out.print("\nEnter the Quantity Of the Product :- ");
                qty = sc.nextDouble();
                tax = (price * 2.5) / 100;
                System.out.print("\n------------------- BILL -------------------");
                System.out.print("\nPrice :- " + price + "\nQuantity :- " + qty + "\nSales Tax (2%) :- " + (tax * qty));
                System.out.print("\n\nTotal Amount After Including TAXES :- '" + ((price * qty) + (tax * qty)) + "'");
                System.out.print("\n--------------------------------------------");
                break;
            case 5:
                System.out.print("\nEnter Price of Other Items :- ");
                price = sc.nextDouble();
                System.out.print("\nEnter the Quantity Of the Product :- ");
                qty = sc.nextDouble();
                tax = (price * 1.2) / 100;
                System.out.print("\n------------------- BILL -------------------");
                System.out.print("\nPrice :- " + price + "\nQuantity :- " + qty + "\nSales Tax (2%) :- " + (tax * qty));
                System.out.print("\n\nTotal Amount After Including TAXES :- '" + ((price * qty) + (tax * qty)) + "'");
                System.out.print("\n--------------------------------------------");
                break;

            default:
                System.out.print("\nInvalid Choice...");
                break;
        }

    }
}
