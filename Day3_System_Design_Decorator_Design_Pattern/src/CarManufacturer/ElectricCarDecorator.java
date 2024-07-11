package CarManufacturer;

public class ElectricCarDecorator extends CarDecorator{
    public ElectricCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {

        //first base car will be created
        super.manufactureCar();
        System.out.println("including the feature of electric car.");
    }
}
