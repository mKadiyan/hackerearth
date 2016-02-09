package design.principles.isp;

class BadSuperWorker implements BadIWorker
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