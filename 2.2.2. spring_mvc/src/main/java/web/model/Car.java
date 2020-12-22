package web.model;

public class Car {

    private String model;
    private int mileage;
    private String color;

    public Car(String model, int mileage, String color) {
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
