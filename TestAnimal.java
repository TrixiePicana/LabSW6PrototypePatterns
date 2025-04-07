public class TestAnimal
{
    public static void main(String[] args)
    {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Buddy");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();
        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Black"); // Modify cloned object

        System.out.println(sheep1.getType() + " - Name: " + ((Sheep) sheep1).getName());
        sheep1.makeSound();

        System.out.println(sheep2.getType() + " - Name: " + ((Sheep) sheep2).getName());
        sheep2.makeSound();

        System.out.println(cow1.getType());
        cow1.makeSound();

        System.out.println(horse1.getType() + " - Color: " + ((Horse) horse1).getColor());
        horse1.makeSound();

        System.out.println(horse2.getType() + " - Color: " + ((Horse) horse2).getColor());
        horse2.makeSound();

        System.out.println("Are sheep1 and sheepPrototype the same object? " + (sheep1 == registry.createSheep("Another")));
    }
}
