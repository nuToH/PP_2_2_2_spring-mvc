package web.model;

public class Car {
    private String modelCar;
    private int seriesCar;
    private int yearCar;

    public Car() {
    }

    public Car(String modelCar, int seriesCar, int yearCar) {
        this.modelCar = modelCar;
        this.seriesCar = seriesCar;
        this.yearCar = yearCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getSeriesCar() {
        return seriesCar;
    }

    public void setSeriesCar(int seriesCar) {
        this.seriesCar = seriesCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", seriesCar=" + seriesCar +
                ", yearCar=" + yearCar +
                '}';
    }
}
