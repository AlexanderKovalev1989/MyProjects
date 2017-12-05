package AirCompany;

import java.util.ArrayList;
import java.util.Collections;

import static jdk.nashorn.internal.objects.Global.print;

public class Application {


    public static void main(String[] args) {

        GarageAirCompany garage = new GarageAirCompany();

        for (PlaneObject planeObjects :garage.listOfPlanes){

            System.out.println(planeObjects);


        }
        System.out.println("----------------------------------------------------");
        System.out.println("Отсортированный, по дальности полета, список летных средств компании");
        System.out.println("----------------------------------------------------");
        Collections.sort(garage.listOfPlanes, new GarageAirCompany.PlaneComparator());

        for (PlaneObject planeObjects :garage.listOfPlanes){

            System.out.println(planeObjects);

        }
        //System.out.println(garage.listOfPlanes);







    }
}
