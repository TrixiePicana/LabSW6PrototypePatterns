class Sheep implements Animal
{
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name)
    {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    public int getLegs()
    {
        return legs;
    }

    public String getSound()
    {
        return sound;
    }

    public String getFood()
    {
        return food;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public Sheep clone()
    {
        try
        {
            return (Sheep) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError(); // Should not happen as we implement Cloneable
        }
    }

    @Override
    public void makeSound()
    {
        System.out.println("Baa!");
    }

    @Override
    public String getType()
    {
        return "Sheep";
    }
}
