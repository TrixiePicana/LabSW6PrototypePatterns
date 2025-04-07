public class Horse implements Animal
{
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(int legs, String sound, String food, String color)
    {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
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

    public String getColor()
    {
        return color;
    }

    public void setColor(String black)
    {
        this.color = color;
    }

    @Override
    public Horse clone()
    {
        try
        {
            return (Horse) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    @Override
    public void makeSound()
    {
        System.out.println("Neigh!");
    }

    @Override
    public String getType()
    {
        return "Horse";
    }
}
