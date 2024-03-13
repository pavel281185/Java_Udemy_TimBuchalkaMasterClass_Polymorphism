public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name){
        engine = true;
        wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }
    
    public String startEngine(){
        return this.getClass().getSimpleName() + " engine id starting";
    }
    
    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }
    
    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }
    
    public int getCylinders(){
        return cylinders;
    }
    
    public String getName(){
        return name;
    }
}
