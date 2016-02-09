package design.principles.isp;

class Manager
{
    IWorkable worker;
    
    public void setWorker(IWorkable w)
    {
        worker = w;
    }
    
    public void manage()
    {
        worker.work();
    }
}