import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car;
        CarFactory carFactory = new CarFactory();
        System.out.print("What car do you want? F/H");

        if (scanner.hasNextLine()){
            String carType = scanner.nextLine();
            car = carFactory.makeCar(carType);

            if(car != null){

                car.display();

            } else System.out.print("Enter F for Ford or H for Honda");

        }
    }
}
