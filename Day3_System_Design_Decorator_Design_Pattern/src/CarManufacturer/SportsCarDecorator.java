package CarManufacturer;

public class SportsCarDecorator extends CarDecorator{
    public SportsCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        //first base car will be created
        super.manufactureCar();
        System.out.println("including the feature of sports car.");
    }
}
