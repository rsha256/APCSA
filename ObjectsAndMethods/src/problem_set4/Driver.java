package problem_set4;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car(2007, "Subaru");

        System.out.println(car.getSpeed());

        int x = 0;
        while (x < 5) {
            car.accelerate();
            System.out.println(car.getSpeed());
            x++;
        }

        int y = 0;
        while (y < 5) {
            car.brake();
            System.out.println(car.getSpeed());
            y++;
        }

    }

}
