public class Main { 
     public static void main (String[] args){
         Car c1 = new Car("Toyota", 2021, 4);
         c1.describe();
         c1.accelerate(20);
         c1.showTypes();
 
         ElectricCar e1 = new ElectricCar("Tesla", 2022, 4, 80);
         e1.describe();
         e1.accelerate(30);
         e1.showTypes();
         System.out.println("Battery Level: " + e1.getBatteryLevel());

         Car c2 = new Car("Honda", 2020, 3);
         c2.describe();
         c2.accelerate(-10);
         c2.showTypes();
     }  

}


/*The Fields cannot be accessed directly because they are private.
To access them, we use public getter and setter methods.*/