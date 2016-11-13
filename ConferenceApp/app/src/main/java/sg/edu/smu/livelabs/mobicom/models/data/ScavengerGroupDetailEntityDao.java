package sg.edu.smu.livelabs.mobicom.models.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import sg.edu.smu.livelabs.mobicom.models.data.ScavengerGroupDetailEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SCAVENGER_GROUP_DETAIL_ENTITY".
*/
public class ScavengerGroupDetailEntityDao extends AbstractDao<ScavengerGroupDetailEntity, Long> {

    public static final String TABLENAME = "SCAVENGER_GROUP_DETAIL_ENTITY";

    /**
     * Properties of entity ScavengerGroupDetailEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property HuntId = new Property(1, Long.class, "huntId", false, "HUNT_ID");
        public final static Property GroupId = new Property(2, Long.class, "groupId", false, "GROUP_ID");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property UserId = new Property(4, Long.class, "userId", false, "USER_ID");
        public final static Property AvatarId = new Property(5, String.class, "avatarId", false, "AVATAR_ID");
        public final static Property IsSubmitted = new Property(6, Boolean.class, "isSubmitted", false, "IS_SUBMITTED");
        public final static Property InsertTime = new Property(7, java.util.Date.class, "insertTime", false, "INSERT_TIME");
    };


    public ScavengerGroupDetailEntityDao(DaoConfig config) {
        super(config);
    }
    
    public ScavengerGroupDetailEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SCAVENGER_GROUP_DETAIL_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"HUNT_ID\" INTEGER," + // 1: huntId
                "\"GROUP_ID\" INTEGER," + // 2: groupId
                "\"NAME\" TEXT," + // 3: name
                "\"USER_ID\" INTEGER," + // 4: userId
                "\"AVATAR_ID\" TEXT," + // 5: avatarId
                "\"IS_SUBMITTED\" INTEGER," + // 6: isSubmitted
                "\"INSERT_TIME\" INTEGER);"); // 7: insertTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SCAVENGER_GROUP_DETAIL_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ScavengerGroupDetailEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long huntId = entity.getHuntId();
        if (huntId != null) {
            stmt.bindLong(2, huntId);
        }
 
        Long groupId = entity.getGroupId();
        if (groupId != null) {
            stmt.bindLong(3, groupId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(5, userId);
        }
 
        String avatarId = entity.getAvatarId();
        if (avatarId != null) {
            stmt.bindString(6, avatarId);
        }
 
        Boolean isSubmitted = entity.getIsSubmitted();
        if (isSubmitted != null) {
            stmt.bindLong(7, isSubmitted ? 1L: 0L);
        }
 
        java.util.Date insertTime = entity.getInsertTime();
        if (insertTime != null) {
            stmt.bindLong(8, insertTime.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ScavengerGroupDetailEntity readEntity(Cursor cursor, int offset) {
        ScavengerGroupDetailEntity entity = new ScavengerGroupDetailEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // huntId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // groupId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // userId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // avatarId
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // isSubmitted
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)) // insertTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ScavengerGroupDetailEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setHuntId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setGroupId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setAvatarId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsSubmitted(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setInsertTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ScavengerGroupDetailEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ScavengerGroupDetailEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}