class Main {
    public static void main(String[] args) {
       System.out.println("Hola mundo"); 
       Car car = new Car("AMQ123 ", new Account("Alfredo", "2356"));
       car.passegenger = 4;
       car.printDataCar();

       Car car2 = new Car("SDF235423 ", new Account("Ana", "AN34"));
       car2.passegenger = 3;
       car2.printDataCar();
    }
}