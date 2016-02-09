/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.string;

import java.math.BigDecimal;

public class TestMath
{
    public static void main(String[] args)
    {
        BigDecimal ROUND_FACTOR = new BigDecimal("0.05");
        BigDecimal value = new BigDecimal("0.01");
        value = value.divide(ROUND_FACTOR);
        value = new BigDecimal(Math.ceil(value.doubleValue()));
        value = value.multiply(ROUND_FACTOR);
        System.out.println(value);
        System.out.println(Math.ceil(new BigDecimal("2.05").doubleValue()));
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
