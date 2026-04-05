public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println("Cainele "+ this.name + " latra");
    }

    public void getAgeInHumanYears(){
        System.out.println("Varsta cainelui in ani umani este " + this.age*7);
    }

    public static void main(){
        Dog azorel = new Dog("Azorel", 2);
        Dog daisy = new Dog("Daisy", 4);
        azorel.bark();
        azorel.getAgeInHumanYears();
        daisy.bark();
        daisy.getAgeInHumanYears();
    }
}
