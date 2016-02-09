/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package design.principles.ocp;

public class BadGraphicsEditor
{
    public void drawShape(BadShape s)
    {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
    }
    
    private void drawCircle(BadShape r)
    {
        System.out.println("draw bad Circle");
    }
    
    private void drawRectangle(BadShape r)
    {
        System.out.println("draw bad Rectangle");
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
