package AirCompany;

public class Helicopter extends PlaneObject {

    private int NumbersOfScrews;

    PlaneObject planeObject = new PlaneObject();

    public Helicopter(int numbersOfScrews, PlaneObject planeObject) {
        NumbersOfScrews = numbersOfScrews;
        this.planeObject = planeObject;
    }


}
