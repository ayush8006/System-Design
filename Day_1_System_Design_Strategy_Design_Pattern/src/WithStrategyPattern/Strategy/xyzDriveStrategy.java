package WithStrategyPattern.Strategy;

public class xyzDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("xyz drive strategy");
    }
}
