package cn.abcdsxg.app.appJump.Data.greenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "APP_INFO".
*/
public class AppInfoDao extends AbstractDao<AppInfo, Long> {

    public static final String TABLENAME = "APP_INFO";

    /**
     * Properties of entity AppInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Page = new Property(1, int.class, "page", false, "page");
        public final static Property PagePos = new Property(2, int.class, "pagePos", false, "pagePos");
        public final static Property PkgName = new Property(3, String.class, "pkgName", false, "pkgName");
        public final static Property ClsName = new Property(4, String.class, "clsName", false, "clsName");
        public final static Property AppName = new Property(5, String.class, "AppName", false, "AppName");
        public final static Property Extra = new Property(6, String.class, "extra", false, "extra");
    };


    public AppInfoDao(DaoConfig config) {
        super(config);
    }
    
    public AppInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"APP_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"page\" INTEGER NOT NULL ," + // 1: page
                "\"pagePos\" INTEGER NOT NULL ," + // 2: pagePos
                "\"pkgName\" TEXT," + // 3: pkgName
                "\"clsName\" TEXT," + // 4: clsName
                "\"AppName\" TEXT," + // 5: AppName
                "\"extra\" TEXT);"); // 6: extra
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"APP_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AppInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getPage());
        stmt.bindLong(3, entity.getPagePos());
 
        String pkgName = entity.getPkgName();
        if (pkgName != null) {
            stmt.bindString(4, pkgName);
        }
 
        String clsName = entity.getClsName();
        if (clsName != null) {
            stmt.bindString(5, clsName);
        }
 
        String AppName = entity.getAppName();
        if (AppName != null) {
            stmt.bindString(6, AppName);
        }
 
        String extra = entity.getExtra();
        if (extra != null) {
            stmt.bindString(7, extra);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AppInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getPage());
        stmt.bindLong(3, entity.getPagePos());
 
        String pkgName = entity.getPkgName();
        if (pkgName != null) {
            stmt.bindString(4, pkgName);
        }
 
        String clsName = entity.getClsName();
        if (clsName != null) {
            stmt.bindString(5, clsName);
        }
 
        String AppName = entity.getAppName();
        if (AppName != null) {
            stmt.bindString(6, AppName);
        }
 
        String extra = entity.getExtra();
        if (extra != null) {
            stmt.bindString(7, extra);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AppInfo readEntity(Cursor cursor, int offset) {
        AppInfo entity = new AppInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // page
            cursor.getInt(offset + 2), // pagePos
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // pkgName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // clsName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // AppName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // extra
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AppInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPage(cursor.getInt(offset + 1));
        entity.setPagePos(cursor.getInt(offset + 2));
        entity.setPkgName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setClsName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAppName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setExtra(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AppInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AppInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
