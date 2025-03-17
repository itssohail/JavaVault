package part5AbstractClassesInterfaces.AbstractClasses.Engine;

public class Main
{
    public static void main(String[] args) {
//        Car car = new Car();
//        int price = Engine.price;
//        System.out.println(price);
//        car.start();
//        car.stop();
//        car.acc();
//
//        Car myCar = car;
//        System.out.println(myCar.carPrice);
//
//
//            Media carMedia = new Car();
//            carMedia.start();

        NiceCar car= new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();


    }
}
