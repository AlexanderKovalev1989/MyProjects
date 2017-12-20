import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GarageAirCompany implements CalculateParametrs {


    List<PlaneObject> listOfPlanes = new ArrayList<PlaneObject>();

    {

        listOfPlanes.add(new PlaneObject("Boing - 747", 1, "Plane", 5000, 10000));
        listOfPlanes.add(new PlaneObject("Boing - 747", 2, "Plane", 5000, 10000));
        listOfPlanes.add(new PlaneObject("Boing - 747", 3, "Plane", 5000, 10000));
        listOfPlanes.add(new PlaneObject("Mi - 78", 4, "Helicopter", 700, 900));
        listOfPlanes.add(new PlaneObject("Konkord", 5, "Plane", 6000, 12000));
        listOfPlanes.add(new PlaneObject("Konkord", 6, "Plane", 6000, 12000));
        listOfPlanes.add(new PlaneObject("Boing - 747", 7, "Plane", 5000, 10000));
        listOfPlanes.add(new PlaneObject("IL", 8, "Plane", 500, 1000));


        //calculateCapacity(listOfPlanes);


    }


    public List<PlaneObject> getListOfPlanes() {
        return listOfPlanes;
    }

    @Override
    public int calculateDistance(List<PlaneObject> listOfPlanes) {

        int allDistance = 0;

        for (PlaneObject planeObjects : listOfPlanes) {

            allDistance += planeObjects.getDistanse();

        }

        return allDistance;


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
