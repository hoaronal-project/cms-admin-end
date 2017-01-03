/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables;


import diamond.cms.server.model.jooq.Cms;
import diamond.cms.server.model.jooq.Keys;
import diamond.cms.server.model.jooq.tables.records.CSettingRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CSetting extends TableImpl<CSettingRecord> {

	private static final long serialVersionUID = -711697142;

	/**
	 * The reference instance of <code>cms.c_setting</code>
	 */
	public static final CSetting C_SETTING = new CSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CSettingRecord> getRecordType() {
		return CSettingRecord.class;
	}

	/**
	 * The column <code>cms.c_setting.id</code>.
	 */
	public final TableField<CSettingRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(120).nullable(false), this, "");

	/**
	 * The column <code>cms.c_setting.name</code>. 参数key
	 */
	public final TableField<CSettingRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "参数key");

	/**
	 * The column <code>cms.c_setting.value</code>.
	 */
	public final TableField<CSettingRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>cms.c_setting.type</code>. 1: 普通文本
	 */
	public final TableField<CSettingRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "1: 普通文本");

	/**
	 * The column <code>cms.c_setting.description</code>. 备注
	 */
	public final TableField<CSettingRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(140), this, "备注");

	/**
	 * Create a <code>cms.c_setting</code> table reference
	 */
	public CSetting() {
		this("c_setting", null);
	}

	/**
	 * Create an aliased <code>cms.c_setting</code> table reference
	 */
	public CSetting(String alias) {
		this(alias, C_SETTING);
	}

	private CSetting(String alias, Table<CSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private CSetting(String alias, Table<CSettingRecord> aliased, Field<?>[] parameters) {
		super(alias, Cms.CMS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CSettingRecord> getPrimaryKey() {
		return Keys.KEY_C_SETTING_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CSettingRecord>> getKeys() {
		return Arrays.<UniqueKey<CSettingRecord>>asList(Keys.KEY_C_SETTING_PRIMARY, Keys.KEY_C_SETTING_NAME_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CSetting as(String alias) {
		return new CSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CSetting rename(String name) {
		return new CSetting(name, null);
	}
}
