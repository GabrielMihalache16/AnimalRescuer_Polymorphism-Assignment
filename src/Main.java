public class Main {
    public static void main(String[] args) {
        //TEMA INHERITANCE
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.setName("Azorel");
        dog1.setAge((byte)15);
        dog1.setHealthLevel((byte)5);
        dog1.setHungerLevel((byte)6);
        dog1.setSpiritLevel((byte)10);
        dog1.setFavouriteFood("pate");
        dog1.setFavouriteRecreationActivity("plimbare");
        dog1.animalPrint();
        dog1.dogHidesBone();

        cat1.setName("Bobita");
        cat1.catScratchStapan();

        WhiteAdopter wadp1 = new WhiteAdopter();
        wadp1.setName("Veronica");
        wadp1.setAvailableMoney((double)100);
        wadp1.adopterPrint();

        BlackAdopter badp1 = new BlackAdopter();
        badp1.setName("JoeWho");
        badp1.nBeWildin();

        Boabe boabe = new Boabe();
        boabe.setName("Pate");
        boabe.setPrice((double)150);
        boabe.setQuantity(10);
        boabe.setAvailable(true);
        boabe.foodPrint();

        PapaConserva conserva = new PapaConserva();
        conserva.eatConserva();


        Walking walk1 = new Walking();
        walk1.setName("Plimbare");
        walk1.printRecreationActivity();
        walk1.walk();

        AsistentVet asvet1 = new AsistentVet();
        VetNecalificat nevet = new VetNecalificat();
        asvet1.setName("Gigel");
        asvet1.setSpecialization("Caini");
        asvet1.vetPrint();

        nevet.setName("Slorin Falam");
        nevet.namDiploma();

        //Tema Polimorfism
        dog1.animalTalk();
        cat1.animalTalk();
        wadp1.adopterAdopts();
        badp1.adopterAdopts();
        walk1.animalRun();
        boabe.animalEats();
        conserva.animalEats();
        asvet1.vetWorks();
        nevet.vetWorks();











    }
}
