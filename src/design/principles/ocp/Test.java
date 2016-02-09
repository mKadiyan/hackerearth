/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package design.principles.ocp;

public class Test
{
    public static void main(String[] args)
    {
        BadGraphicsEditor badGraphicsEditor = new BadGraphicsEditor();
        BadShape badR = new BadRectangle();
        badGraphicsEditor.drawShape(badR);
        // BAD Example: below we need to change editor code in case new type comes
        BadShape badC = new BadCircle();
        badGraphicsEditor.drawShape(badC);
        
        GraphicEditor editor = new GraphicEditor();
        Shape rect = new Rectangle();
        editor.drawShape(rect);
        // below when new shape is added , we need not to change the code of graphics editor
        Shape circle = new Circle();
        editor.drawShape(circle);
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
