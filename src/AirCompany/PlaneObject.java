package AirCompany;




public class PlaneObject {


    private  String model;
    private  String type;
    private  int capacity;
    private  int distanse;
    private  int id;

    public PlaneObject(String model, String type, int capacity, int distanse, int id) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.distanse = distanse;
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDistanse() {
        return distanse;
    }

    @Override
    public String toString() {
        return
                " Модель = " + model +
                ", тип = " + type +
                ", вместимость = " + capacity +
                ", дальность полета = " + distanse +
                ", id = " + id +
                '}' + "\n";
    }
}
