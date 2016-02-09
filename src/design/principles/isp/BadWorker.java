package design.principles.isp;

class BadWorker implements BadIWorker
{
    public void work()
    {
        // ....working
    }
    
    public void eat()
    {
        // ...... eating in launch break
    }
}