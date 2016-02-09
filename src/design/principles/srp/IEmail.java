package design.principles.srp;

// single responsibility principle - good example
interface IEmail
{
    public void setSender(String sender);
    
    public void setReceiver(String receiver);
    
    public void setContent(IContent content);
}