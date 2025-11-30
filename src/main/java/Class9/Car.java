package Class9;

public class Car {
    //1.	Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
    int id;
    String brand;
    int mileage;
    int yearOfProdussing;
    int maxSpeed;
    int price;

    public Car(int id, int price, String brand, int mileage, int yearOfProdussing, int maxSpeed) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProdussing = yearOfProdussing;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYearOfProdussing() {
        return yearOfProdussing;
    }

    public void setYearOfProdussing(int yearOfProdussing) {
        this.yearOfProdussing = yearOfProdussing;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", yearOfProdussing=" + yearOfProdussing +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
