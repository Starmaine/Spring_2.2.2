package web.model;


public class Car {
    private String model;
    private int series;
    private int yearOfModel;

    public Car(String model, int series, int yearOfModel) {
        this.model = model;
        this.series = series;
        this.yearOfModel = yearOfModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }
}
