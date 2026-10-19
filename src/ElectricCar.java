public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int year, int doors, int batteryLevel){
        super(brand, year, doors);

        if (batteryLevel >= 0 && batteryLevel <= 100){
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
        }
    }
    
    public void accelerate(int amount){
        super.accelerate(amount);
        if (amount > 0 && batteryLevel > 0){
            batteryLevel--;
        }
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
   
    public void describe(){
        super.describe();
        System.out.println("Battery Level: " + batteryLevel);
    }

}