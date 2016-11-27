/**
 * This class is generated by jOOQ
 */
package com.bisaga.planitia.generated.tables.records;


import com.bisaga.planitia.generated.tables.Epic;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpicRecord extends UpdatableRecordImpl<EpicRecord> implements Record8<Integer, String, String, String, Timestamp, String, Timestamp, String> {

    private static final long serialVersionUID = -955367919;

    /**
     * Setter for <code>public.epic.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.epic.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.epic.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.epic.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.epic.summary</code>.
     */
    public void setSummary(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.epic.summary</code>.
     */
    public String getSummary() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.epic.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.epic.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.epic.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.epic.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.epic.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.epic.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.epic.modified_on</code>.
     */
    public void setModifiedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.epic.modified_on</code>.
     */
    public Timestamp getModifiedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.epic.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.epic.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Timestamp, String, Timestamp, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, Timestamp, String, Timestamp, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Epic.EPIC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Epic.EPIC.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Epic.EPIC.SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Epic.EPIC.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Epic.EPIC.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Epic.EPIC.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Epic.EPIC.MODIFIED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Epic.EPIC.MODIFIED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getModifiedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getModifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value3(String value) {
        setSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value7(Timestamp value) {
        setModifiedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord value8(String value) {
        setModifiedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpicRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, String value6, Timestamp value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpicRecord
     */
    public EpicRecord() {
        super(Epic.EPIC);
    }

    /**
     * Create a detached, initialised EpicRecord
     */
    public EpicRecord(Integer id, String code, String summary, String description, Timestamp createdOn, String createdBy, Timestamp modifiedOn, String modifiedBy) {
        super(Epic.EPIC);

        set(0, id);
        set(1, code);
        set(2, summary);
        set(3, description);
        set(4, createdOn);
        set(5, createdBy);
        set(6, modifiedOn);
        set(7, modifiedBy);
    }
}
