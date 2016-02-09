package algorithms.java;

public class CloneMain
{
    
    public static void main(String[] args)
    {
        
        Color c = new Color("RED");
        ColoredCircle c1 = new ColoredCircle(200, 200, c);
        ColoredCircle c2 = (ColoredCircle) c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }
}