/**
 * This class is generated by jOOQ
 */
package com.bisaga.planitia.generated.tables;


import com.bisaga.planitia.generated.Keys;
import com.bisaga.planitia.generated.Public;
import com.bisaga.planitia.generated.tables.records.UserInfoRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class UserInfo extends TableImpl<UserInfoRecord> {

    private static final long serialVersionUID = -623622833;

    /**
     * The reference instance of <code>public.user_info</code>
     */
    public static final UserInfo USER_INFO = new UserInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserInfoRecord> getRecordType() {
        return UserInfoRecord.class;
    }

    /**
     * The column <code>public.user_info.id</code>.
     */
    public final TableField<UserInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_info_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_info.external_id</code>.
     */
    public final TableField<UserInfoRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.user_info.user_name</code>.
     */
    public final TableField<UserInfoRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.user_info.is_active</code>.
     */
    public final TableField<UserInfoRecord, Boolean> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.user_info.email</code>.
     */
    public final TableField<UserInfoRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.user_info.created_on</code>.
     */
    public final TableField<UserInfoRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.user_info.created_by</code>.
     */
    public final TableField<UserInfoRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.user_info.modified_on</code>.
     */
    public final TableField<UserInfoRecord, Timestamp> MODIFIED_ON = createField("modified_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.user_info.modified_by</code>.
     */
    public final TableField<UserInfoRecord, String> MODIFIED_BY = createField("modified_by", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.user_info</code> table reference
     */
    public UserInfo() {
        this("user_info", null);
    }

    /**
     * Create an aliased <code>public.user_info</code> table reference
     */
    public UserInfo(String alias) {
        this(alias, USER_INFO);
    }

    private UserInfo(String alias, Table<UserInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserInfo(String alias, Table<UserInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserInfoRecord> getPrimaryKey() {
        return Keys.USER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<UserInfoRecord>>asList(Keys.USER_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserInfo as(String alias) {
        return new UserInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public UserInfo rename(String name) {
        return new UserInfo(name, null);
    }
}
