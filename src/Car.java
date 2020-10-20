public abstract class Car {

    private int engineSize;
    private String colour;

    public void drive(){
        System.out.println("Driving ");
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void display(){
        System.out.println("Engine: "+ engineSize + ", Colour: "+ colour);
    }
}
