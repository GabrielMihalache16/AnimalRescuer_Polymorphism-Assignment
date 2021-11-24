public class Adopter {
    private String name;
    private double availableMoney;

    public void adopterPrint(){
        System.out.println("Name: " +name + "\nMoney: " + availableMoney);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void adopterAdopts(){
        System.out.println("Am adoptat un animal.");
    }
}
