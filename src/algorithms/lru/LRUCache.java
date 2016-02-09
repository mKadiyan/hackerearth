package algorithms.lru;

import java.util.LinkedHashMap;

public class LRUCache extends LinkedHashMap<Integer, String>
{
    private int cacheSize;
    
    public LRUCache(int size)
    {
        super(size, 0.75f, true);
        this.cacheSize = size;
    }
    
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest)
    {
        System.out.println("removeEldestEntry called = " + (size() > cacheSize));
        return size() > cacheSize;
    }
    
    public static void main(String[] args)
    {
        LRUCache cache = new LRUCache(3);
        cache.put(1, "One");
        cache.put(2, "One");
        cache.put(3, "One");
        System.out.println(cache.size());
        cache.put(4, "One");
        System.out.println(cache.size());
    }
}