package backengineering;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        ArrayList<CarInfo> CarShop=new ArrayList<>();
        Input(CarShop);
        //System.out.println(CarShop.toString());



    }
    public static void Input(ArrayList<CarInfo> CarShop) {

        Scanner sc = new Scanner(System.in);
        for (int count = 0; count < 2; count++) {
            System.out.println("Input car information on your database_:-");
            System.out.println("\nEnter Car Brandname:");
            String BrandName = sc.nextLine();
            System.out.println("Enter model:");
            String model = sc.nextLine();
            System.out.println("Enter price:");
            int price = sc.nextInt();
            CarShop.add(new CarInfo(BrandName, model, price));
            sc.nextLine();
        }
        // search student by their name
        System.out.print("Enter student name to query:- ");
        String checkName= sc.nextLine();

        for (CarInfo CarDetails: CarShop) {
            if(CarDetails.getBrandName().contains(checkName)){
                System.out.println(CarDetails.toString());
            }
        }
    }

}
