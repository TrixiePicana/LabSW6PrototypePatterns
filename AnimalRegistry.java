public class AnimalRegistry
{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry()
    {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Default Sheep");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Brown");
    }

    public Animal createSheep(String name)
    {
        Sheep newSheep = sheepPrototype.clone();
        newSheep.setName(name);
        return newSheep;
    }

    public Animal createCow()
    {
        return cowPrototype.clone();
    }

    public Animal createHorse()
    {
        return horsePrototype.clone();
    }
}
