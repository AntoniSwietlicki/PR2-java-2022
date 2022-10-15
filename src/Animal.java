public class Animal {
    private static final double DEFAULT_DOG_WEIGHT = 10.5;
    private static final double DEFAULT_CAT_WEIGHT = 4.0;
    private static final double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String species;
    public boolean getweight;
    String name;
    boolean isAlive;
    private double weight;

    public Animal(String species){
        this.isAlive = true;
        this.species = species;

        switch (species){
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed(){
        this.weight +=1.0;
    }
    public void takeForAWalk(){
        this.weight -=1.0;
    }
    public double getweight(){
        return weight;
    }
}
