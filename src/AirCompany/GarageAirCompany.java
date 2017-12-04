package AirCompany;

import java.util.ArrayList;
import java.util.Collections;

public class GarageAirCompany implements CalculateParametrs {





    ArrayList <PlaneObject> listOfPlanes = new ArrayList<>();{

     listOfPlanes.add(new PlaneObject("Boing - 747","Plane",5000,10000,1));
     listOfPlanes.add(new PlaneObject("Boing - 747","Plane",5000,10000,2));
     listOfPlanes.add(new PlaneObject("Mi - 78","Helicopter",700,900,3));
     listOfPlanes.add(new PlaneObject("Mi - 78","Helicopter",700,900,4));
     listOfPlanes.add(new PlaneObject("Konkord","Plane",6000,12000,5));
     listOfPlanes.add(new PlaneObject("Konkord","Plane",6000,12000,6));



    }



    @Override
    public void calculateTonnage() {

    }

    @Override
    public void calculateCapacity() {






    }

    @Override
    public void calculateDistance() {

    }



}
