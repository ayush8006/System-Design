package CarManufacturer;

public class LuxuaryCarDecorator extends CarDecorator {
    public LuxuaryCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        //first base car will be created
        super.manufactureCar();
        System.out.println("including the feature of luxury car.");
    }
}
