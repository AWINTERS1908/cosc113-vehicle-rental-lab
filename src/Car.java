public class Car extends Vehicle{
    private int doors;
    String type = "Car";

    public Car(String brand, int year, int doors){
        super(brand, year);
        setDoors(doors);
    }
    public void describe(){
        super.describe();
        if (doors == 2 || doors == 4){
            System.out.println("Doors: " + doors);
        } else {
            System.out.println("Invalid door count.");
        }
    }

    public void showTypes(){
        System.out.println("Type: " + type + " | " + " Parent: " + super.Type);
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors){
        if (doors == 2 || doors == 4){
            this.doors = doors;
        } else{
            System.out.print("Invalid door count.");
        }
    }

    }