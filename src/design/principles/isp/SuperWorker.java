package design.principles.isp;

class SuperWorker implements IWorkable, IFeedable
{
    public void work()
    {
        // .... working much more
    }
    
    public void eat()
    {
        // .... eating in launch break
    }
}