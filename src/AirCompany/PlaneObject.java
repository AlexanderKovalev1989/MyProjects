package AirCompany;


public class PlaneObject {


    private String model;
    private String type;
    private int capacity;
    private int distance;
    private int id;

    public PlaneObject(String model, String type, int capacity, int distance, int id) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.distance = distance;
        this.id = id;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getDistanse() {
        return distance;
    }


    @Override
    public String toString() {
        return
                " Модель = " + model +
                        ", тип = " + type +
                        ", вместимость = " + capacity +
                        ", дальность полета = " + distance +
                        ", id = " + id;
    }


}
