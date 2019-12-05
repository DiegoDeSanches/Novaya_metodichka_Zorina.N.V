public class Tester {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes-Benz", "S-klasse", "S500", 7000000,
                2015); // создание экземпляра с1класса Car и передача ему параметров
        c1.println(); //применение метода println() к c1
        Car c2 = new Car("BMW", "7 Series", "750 Li", 7050000, 2016);
        c2.println(); //применение метода println() к c2
        Car c3 = new Car("Audi", "A8", "Long", 7450000, 2016);
        c3.println(); //применение метода println() к c3
    }
}