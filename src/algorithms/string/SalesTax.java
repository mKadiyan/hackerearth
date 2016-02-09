/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

import static algorithms.string.ItemType.HEADACHE_PILLS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class SalesTax
{
    private EnumSet<ItemType> exempted;
    private EnumSet<ItemType> imported;
    private EnumMap<ItemType, BigDecimal> itemPrice;
    private static final int BASIC = 10;
    private static final int IMPORT = 5;
    
    public SalesTax(EnumSet<ItemType> exempted, EnumSet<ItemType> imported, EnumMap<ItemType, BigDecimal> itemPrice)
    {
        this.exempted = exempted;
        this.imported = imported;
        this.itemPrice = itemPrice;
    }
    
    public static void main(String[] args)
    {
        EnumSet<ItemType> exempted = EnumSet.of(HEADACHE_PILLS);
        EnumSet<ItemType> imported = EnumSet.of(ItemType.IMPORTED_BOX_CHOCOLATE, ItemType.IMPORTED_BOTTLE_PERFUME);
        EnumMap<ItemType, BigDecimal> itemPrice = new EnumMap<>(ItemType.class);
        itemPrice.put(ItemType.BOOK, new BigDecimal("12.49"));
        itemPrice.put(ItemType.MUSIC_CD, new BigDecimal("14.99"));
        itemPrice.put(ItemType.CHOCOLATE_BAR, new BigDecimal("0.85"));
        
        SalesTax salesTax = new SalesTax(exempted, imported, itemPrice);
        List<Item> items = new ArrayList<>();
        salesTax.compute(items);
        
    }
    
    private void compute(List<Item> items)
    {
        BigDecimal totTax = new BigDecimal("0.0");
        for (Item item : items)
        {
            BigDecimal tax = getTaxApplicable(item.getType());
            System.out.println(item.getCount() + " " + item.getName() + " :" + itemPrice.get(item.getType()));
        }
    }
    
    private BigDecimal getTaxApplicable(ItemType tye)
    {
        BigDecimal tax = new BigDecimal("0.0");
        if (exempted.contains(tye) && imported.contains(tye))
        {
            tax = new BigDecimal("5");
        }
        else if (!exempted.contains(tye) && imported.contains(tye))
        {
            tax = new BigDecimal("15");
        }
        else if (!exempted.contains(tye))
        {
            tax = new BigDecimal("10");
        }
        return tax;
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
