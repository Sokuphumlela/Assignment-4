package nombila.s;
import BicycleBase;
public class MountainBike extends BicycleBase {
    @Override
    public void accelerate(){
        changeSpeed(speed += 5);
    }
    public void brake(){
        changeSpeed(speed -=3);
    }
    
}
