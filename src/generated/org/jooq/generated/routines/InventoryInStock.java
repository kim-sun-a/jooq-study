/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.generated.Sakila;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryInStock extends AbstractRoutine<Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sakila.inventory_in_stock.RETURN_VALUE</code>.
     */
    public static final Parameter<Byte> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sakila.inventory_in_stock.p_inventory_id</code>.
     */
    public static final Parameter<Integer> P_INVENTORY_ID = Internal.createParameter("p_inventory_id", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public InventoryInStock() {
        super("inventory_in_stock", Sakila.SAKILA, SQLDataType.TINYINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_INVENTORY_ID);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter IN value to the routine
     */
    public void setPInventoryId(Integer value) {
        setValue(P_INVENTORY_ID, value);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public InventoryInStock setPInventoryId(Field<Integer> field) {
        setField(P_INVENTORY_ID, field);
        return this;
    }
}
