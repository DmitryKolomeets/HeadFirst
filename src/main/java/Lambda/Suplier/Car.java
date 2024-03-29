package Lambda.Suplier;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;


class Test4 {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }


    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


    public static void main(String[] args) {

        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver Mettalic", 1.6));

        System.out.println("Our cars " + ourCars);


        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("apgreided car " + car);
        });

        System.out.println("-------------------------------------");
        System.out.println(ourCars);

    }


}


public class Car {

    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
