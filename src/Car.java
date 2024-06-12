public class Car extends Vehicle{
    private Integer wheelCount;

    public Car(String model, String brandName, java.lang.Integer releaseYear, java.lang.Integer wheelCount) {
        super(model, brandName, releaseYear);
        this.wheelCount = wheelCount;
    }

    public java.lang.Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(java.lang.Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString(){
        return "Person{model='" + model + "', brandName=" + BrandName() + "}";


    }
}
