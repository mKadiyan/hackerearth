package design.principles.isp;

class BadManager
{
    BadIWorker worker;
    
    public void setWorker(BadIWorker w)
    {
        worker = w;
    }
    
    public void manage()
    {
        worker.work();
    }
}