public class PlaneObject extends WorkObject {


    private String type;
    private int capacity;
    private int distance;


    public PlaneObject(String model, int id, String type, int capacity, int distance) {
        super(model, id);
        this.type = type;
        this.capacity = capacity;
        this.distance = distance;

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
                " Модель = " + super.getModel() +
                        ", тип = " + type +
                        ", вместимость = " + capacity +
                        ", дальность полета = " + distance +
                        ", id = " + super.getId();
    }


}
