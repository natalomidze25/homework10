public class Vehicle {
    private String model;
    private String brandName;
    private Integer releaseYear;

    public Vehicle(String model, String brandName, java.lang.Integer releaseYear) {
        this.model = model;
        this.brandName = brandName;
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public String getBrandName() {
        return brandName;
    }

    public java.lang.Integer getReleaseYear() {
        return releaseYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setReleaseYear(java.lang.Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

}
