package CarManufacturer;

public class program {
    public static void main(String[] args) {

        //demand for sports car
        ICar sportsCar = new SportsCarDecorator(new BasicCar());
        sportsCar.manufactureCar();
        System.out.println();

        //demand for electric car
        ICar electricCar = new ElectricCarDecorator(new BasicCar());
        electricCar.manufactureCar();
        System.out.println();

        //demand for SPORTS-electric car
        ICar SportselectricCar =new SportsCarDecorator(new ElectricCarDecorator(new BasicCar()));
        SportselectricCar.manufactureCar();
        System.out.println();

    }
}
