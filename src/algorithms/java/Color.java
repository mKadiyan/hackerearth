package algorithms.java;

public class Color implements Cloneable
{
    
    private String color;
    
    public Color(String c)
    {
        this.color = c;
    }
    
    public Object clone()
    {
        try
        {
            return (Color) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
    
    @Override
    public String toString()
    {
        return "Color [color=" + color + "]";
    }
    
    // getters and setters for the fields should go here........
}
