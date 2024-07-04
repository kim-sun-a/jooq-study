/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Indexes;
import org.jooq.generated.JSakila;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.JCustomer.CustomerPath;
import org.jooq.generated.tables.JRental.RentalPath;
import org.jooq.generated.tables.JStaff.StaffPath;
import org.jooq.generated.tables.records.PaymentRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JPayment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.payment</code>
     */
    public static final JPayment PAYMENT = new JPayment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>sakila.payment.payment_id</code>.
     */
    public final TableField<PaymentRecord, Integer> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.payment.customer_id</code>.
     */
    public final TableField<PaymentRecord, Integer> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sakila.payment.staff_id</code>.
     */
    public final TableField<PaymentRecord, Integer> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sakila.payment.rental_id</code>.
     */
    public final TableField<PaymentRecord, Integer> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sakila.payment.amount</code>.
     */
    public final TableField<PaymentRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.DECIMAL(5, 2).nullable(false), this, "");

    /**
     * The column <code>sakila.payment.payment_date</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>sakila.payment.last_update</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private JPayment(Name alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JPayment(Name alias, Table<PaymentRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>sakila.payment</code> table reference
     */
    public JPayment(String alias) {
        this(DSL.name(alias), PAYMENT);
    }

    /**
     * Create an aliased <code>sakila.payment</code> table reference
     */
    public JPayment(Name alias) {
        this(alias, PAYMENT);
    }

    /**
     * Create a <code>sakila.payment</code> table reference
     */
    public JPayment() {
        this(DSL.name("payment"), null);
    }

    public <O extends Record> JPayment(Table<O> path, ForeignKey<O, PaymentRecord> childPath, InverseForeignKey<O, PaymentRecord> parentPath) {
        super(path, childPath, parentPath, PAYMENT);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PaymentPath extends JPayment implements Path<PaymentRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> PaymentPath(Table<O> path, ForeignKey<O, PaymentRecord> childPath, InverseForeignKey<O, PaymentRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private PaymentPath(Name alias, Table<PaymentRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public PaymentPath as(String alias) {
            return new PaymentPath(DSL.name(alias), this);
        }

        @Override
        public PaymentPath as(Name alias) {
            return new PaymentPath(alias, this);
        }

        @Override
        public PaymentPath as(Table<?> alias) {
            return new PaymentPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PAYMENT_IDX_FK_CUSTOMER_ID, Indexes.PAYMENT_IDX_FK_STAFF_ID);
    }

    @Override
    public Identity<PaymentRecord, Integer> getIdentity() {
        return (Identity<PaymentRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENT_PRIMARY;
    }

    @Override
    public List<ForeignKey<PaymentRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PAYMENT_CUSTOMER, Keys.FK_PAYMENT_STAFF, Keys.FK_PAYMENT_RENTAL);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>sakila.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.FK_PAYMENT_CUSTOMER, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>sakila.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.FK_PAYMENT_STAFF, null);

        return _staff;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit join path to the <code>sakila.rental</code> table.
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, Keys.FK_PAYMENT_RENTAL, null);

        return _rental;
    }

    @Override
    public JPayment as(String alias) {
        return new JPayment(DSL.name(alias), this);
    }

    @Override
    public JPayment as(Name alias) {
        return new JPayment(alias, this);
    }

    @Override
    public JPayment as(Table<?> alias) {
        return new JPayment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JPayment rename(String name) {
        return new JPayment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JPayment rename(Name name) {
        return new JPayment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JPayment rename(Table<?> name) {
        return new JPayment(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment where(Condition condition) {
        return new JPayment(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JPayment where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JPayment where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JPayment where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JPayment where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JPayment whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}