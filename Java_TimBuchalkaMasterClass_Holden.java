public class Holden extends Car  {
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    
    public String startEngine(){
        return super.startEngine();
    }
    
    public String accelerate(){
        return super.accelerate();
    }
    
    public String brake(){
        return super.brake();
    }
}
