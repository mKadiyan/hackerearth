/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

import java.math.BigDecimal;

public class Item
{
    private BigDecimal price;
    private ItemType type;
    private int count;
    private String name;
    
    public Item(String name, BigDecimal price, ItemType type, int count)
    {
        super();
        this.price = price;
        this.type = type;
        this.count = count;
        this.name = name;
    }
    
    public BigDecimal getPrice()
    {
        return price;
    }
    
    public ItemType getType()
    {
        return type;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public String getName()
    {
        return name;
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
