package algorithms.java;

public class ColoredCircle implements Cloneable
{
    
    private int centerX;
    private int centerY;
    private Color color;
    
    public ColoredCircle(int x, int y, Color c)
    {
        this.centerX = x;
        this.centerY = y;
        this.color = c;
    }
    
    public Object clone()
    {
        ColoredCircle cc;
        try
        {
            cc = (ColoredCircle) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            // This should never happen
            return null;
        }
        cc.color = (Color) color.clone();
        return cc;
    }
    
    @Override
    public String toString()
    {
        return "ColoredCircle [centerX=" + centerX + ", centerY=" + centerY + ", color=" + color + "]";
    }
    
    // getters and setters for the fields should go here........
}
