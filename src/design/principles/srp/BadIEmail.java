package design.principles.srp;

// single responsibility principle - bad example

interface BadIEmail
{
    public void setSender(String sender);
    
    public void setReceiver(String receiver);
    
    public void setContent(String content);
}