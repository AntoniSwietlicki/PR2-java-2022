public class Main {
    public static void main(String[] args) {
        Car supercar = new Car("yellow", "McLaren");
        supercar.isON = true;
        supercar.mileage = 15000;

        System.out.println(supercar.Brand);
        System.out.println(supercar.isON);

        System.out.println(supercar.mileage);
        supercar.drive();
        System.out.println(supercar.mileage);

        Animal dog = new Animal("Canis");
        dog.name = "Szarik";
        dog.isAlive = true;


        System.out.println("Zwierze nazywa się " + dog.name);

        dog.feed();
        dog.takeForAWalk();
        System.out.println(dog.getweight);


        Human me = new Human(1888);
        System.out.println(me.yearOfBirth);
        Human sister = new Human(1990);
        System.out.println(sister.yearOfBirth);

        me.pet = new Animal("canis");
        System.out.print(me.pet.species);

        me.pet = new Animal("felis");
        System.out.print(me.pet.species);

        Car mclaren1 = new Car("Mclaren","Senna");
        Car mclaren2 = new Car("Mclaren","Senna");

        boolean isTheSame = (mclaren1 == mclaren2);
        System.out.println(isTheSame);

    }
}