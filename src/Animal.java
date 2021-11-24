public class Animal {
    private String name;
    private byte age;
    private byte healthLevel;
    private byte hungerLevel;
    private byte spiritLevel;
    private String favouriteFood;
    private String favouriteRecreationActivity;

    public void animalPrint(){
        System.out.println("Name: " +name + "\nAge: " + age + "\nHealth status: " +healthLevel + "\nHunger level: " + hungerLevel + "\nSpirit level:" +spiritLevel + "\nFavourite food: " +favouriteFood + "\nFavourite Activity: " + favouriteRecreationActivity);

    }
    public void animalTalk(){
        System.out.println("Buna!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setHealthLevel(byte healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungerLevel(byte hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setSpiritLevel(byte spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setFavouriteRecreationActivity(String favouriteRecreationActivity) {
        this.favouriteRecreationActivity = favouriteRecreationActivity;
    }
}
