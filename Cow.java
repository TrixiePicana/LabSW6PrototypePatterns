public class Cow implements Animal
{
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food)
    {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    public int getLegs()
    {
        return legs;
    }
    public String  getSound()
    {
        return sound;
    }

    public String getFood()
    {
        return food;
    }

    @Override
    public Cow clone()
    {
        try
        {
            return (Cow) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    @Override
    public void makeSound()
    {
        System.out.println("Moo!");
    }

    @Override
    public String getType()
    {
        return "Cow";
    }
}
