package AirCompany;

public class Plane extends PlaneObject {

    private String wingspan;

    PlaneObject planeObject = new PlaneObject();

    public Plane(String wingspan, PlaneObject planeObject) {
        this.wingspan = wingspan;
        this.planeObject = planeObject;
    }
}
