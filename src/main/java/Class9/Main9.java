package Class9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main9 {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car(1, 70000, "BMW", 10000, 2022, 200),
                new Car(2, 50000, "Mini", 55000, 2020, 180),
                new Car(3, 100000, "Porshe", 100000, 2021, 220),
                new Car(4, 55000, "BYD", 10000, 2023, 150),
                new Car(5, 37000, "Belgee", 100, 2025, 140)
        );

//        1.2	Найти самую быструю машину.
        Optional<Car> faster1 = cars.stream().max(Comparator.comparingInt(value -> value.maxSpeed));
        System.out.println(faster1);
        //Car faster = cars.stream().max(Comparator.comparingInt(value -> value.maxSpeed)).get();
//        1.3	Найти самую медленную машину.
//        1.4	Найти самую старую
//        1.5	Найти самую новую
//        1.6	Найти машины, у которых пробег от 50000 до 100000.
        cars.stream().filter(car -> {
            if (car.getMileage() > 50000 && car.getMileage() <= 100000) {
                return true;
            } else return false;
        }).toList();

        List<Car> list1 = cars.stream().filter(car -> car.getMileage() > 50000 && car.getMileage() <= 100000).toList();

//        1.7	Найти самую дорогую машину.
//        1.8	Найти самую дешёвую машину.

        //1.12	Получить не повторяющиеся значения марок авто (distinct).
        List<String> distinctBrands = cars.stream().map(a -> a.brand).distinct().toList();

        //1.13	Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега,
        // в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.

        Car carOne = cars.stream().filter(car -> {
            if (car.getBrand().equals("BYD") && car.getMaxSpeed() > 100) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("такой машины нет"));
        System.out.println(carOne);


        Multiplication multiplication = ((a, b) -> a * b);
        Integer result = multiplication.multiplication(5, 10);
        System.out.println("Result: " + result);


        Multiplication divide = ((a, b) -> a / b);
        Integer d = divide.multiplication(50, 10);
        System.out.println("Result: " + d);

        Multiplication sum = ((a, b) -> a + b);
        Integer s = sum.multiplication(5, 5);
        System.out.println("Result: " + s);

        hello(multiplication, 5, 9);

    }

    private static void hello(Multiplication multiplication, int a, int b) {
        multiplication.multiplication(a, b);
    }
}
