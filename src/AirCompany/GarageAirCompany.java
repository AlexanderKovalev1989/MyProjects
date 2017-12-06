package AirCompany;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GarageAirCompany implements CalculateParametrs {


    List<PlaneObject> listOfPlanes = new ArrayList<PlaneObject>();

    {

        listOfPlanes.add(new PlaneObject("Boing - 747", "Plane", 5000, 10000, 1));
        listOfPlanes.add(new PlaneObject("Boing - 747", "Plane", 5000, 10000, 2));
        listOfPlanes.add(new PlaneObject("Mi - 78", "Helicopter", 700, 900, 3));
        listOfPlanes.add(new PlaneObject("Mi - 78", "Helicopter", 700, 900, 4));
        listOfPlanes.add(new PlaneObject("Konkord", "Plane", 6000, 12000, 5));
        listOfPlanes.add(new PlaneObject("Konkord", "Plane", 6000, 12000, 6));
        listOfPlanes.add(new PlaneObject("Boing - 747", "Plane", 5000, 10000, 7));
        listOfPlanes.add(new PlaneObject("IL", "Plane", 500, 1000, 8));

        calculateCapacity(listOfPlanes);




    }


    @Override // общая грузоподъемность рассчитывается анналогично общей вместимости
    public void calculateTonnage() {

    }


    @Override
    public void calculateCapacity(List<PlaneObject> listOfPlanes) {

        int allCapacity = 0;

        for (PlaneObject planeObjects : listOfPlanes) {

            allCapacity += planeObjects.getCapacity();

        }
        System.out.println("Вместимость всех самолетов компании : " + allCapacity + "\n");

    }

    public static class PlaneComparator implements Comparator<PlaneObject> {
        @Override
        public int compare(PlaneObject o1, PlaneObject o2) {

            return Integer.compare(o1.getDistanse(), o2.getDistanse());
        }
    }


}
