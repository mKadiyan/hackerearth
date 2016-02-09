/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package design.principles.dip;

class BadManager
{
    BadWorker worker;
    
    public void setWorker(BadWorker w)
    {
        worker = w;
    }
    
    public void manage()
    {
        worker.work();
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
