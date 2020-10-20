public class CarFactory {
    public Car makeCar(String car){
       if(car.equals("F")){
           return new Ford();
       }
       else if(car.equals("H")){
           return new Honda();
       }
       else{
           return null;
       }
    }
}
