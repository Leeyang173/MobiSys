package sg.edu.smu.livelabs.mobicom.models.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MAIN_TOPIC_ENTITY".
*/
public class MainTopicEntityDao extends AbstractDao<MainTopicEntity, Long> {

    public static final String TABLENAME = "MAIN_TOPIC_ENTITY";

    /**
     * Properties of entity MainTopicEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TopicHandle = new Property(1, String.class, "topicHandle", false, "TOPIC_HANDLE");
        public final static Property UserHandle = new Property(2, String.class, "userHandle", false, "USER_HANDLE");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property Text = new Property(4, String.class, "text", false, "TEXT");
        public final static Property TotalLikes = new Property(5, Long.class, "totalLikes", false, "TOTAL_LIKES");
        public final static Property TotalComments = new Property(6, Long.class, "totalComments", false, "TOTAL_COMMENTS");
        public final static Property UserFullName = new Property(7, String.class, "userFullName", false, "USER_FULL_NAME");
        public final static Property UserPhotoUrl = new Property(8, String.class, "userPhotoUrl", false, "USER_PHOTO_URL");
        public final static Property CreatedTime = new Property(9, java.util.Date.class, "createdTime", false, "CREATED_TIME");
        public final static Property Liked = new Property(10, Boolean.class, "liked", false, "LIKED");
    };


    public MainTopicEntityDao(DaoConfig config) {
        super(config);
    }
    
    public MainTopicEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MAIN_TOPIC_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ASC ," + // 0: id
                "\"TOPIC_HANDLE\" TEXT," + // 1: topicHandle
                "\"USER_HANDLE\" TEXT," + // 2: userHandle
                "\"TITLE\" TEXT," + // 3: title
                "\"TEXT\" TEXT," + // 4: text
                "\"TOTAL_LIKES\" INTEGER," + // 5: totalLikes
                "\"TOTAL_COMMENTS\" INTEGER," + // 6: totalComments
                "\"USER_FULL_NAME\" TEXT," + // 7: userFullName
                "\"USER_PHOTO_URL\" TEXT," + // 8: userPhotoUrl
                "\"CREATED_TIME\" INTEGER," + // 9: createdTime
                "\"LIKED\" INTEGER);"); // 10: liked
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIN_TOPIC_ENTITY_TOPIC_HANDLE ON MAIN_TOPIC_ENTITY" +
                " (\"TOPIC_HANDLE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIN_TOPIC_ENTITY_TOTAL_LIKES ON MAIN_TOPIC_ENTITY" +
                " (\"TOTAL_LIKES\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIN_TOPIC_ENTITY_TOTAL_COMMENTS ON MAIN_TOPIC_ENTITY" +
                " (\"TOTAL_COMMENTS\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAIN_TOPIC_ENTITY_CREATED_TIME ON MAIN_TOPIC_ENTITY" +
                " (\"CREATED_TIME\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MAIN_TOPIC_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MainTopicEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String topicHandle = entity.getTopicHandle();
        if (topicHandle != null) {
            stmt.bindString(2, topicHandle);
        }
 
        String userHandle = entity.getUserHandle();
        if (userHandle != null) {
            stmt.bindString(3, userHandle);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(5, text);
        }
 
        Long totalLikes = entity.getTotalLikes();
        if (totalLikes != null) {
            stmt.bindLong(6, totalLikes);
        }
 
        Long totalComments = entity.getTotalComments();
        if (totalComments != null) {
            stmt.bindLong(7, totalComments);
        }
 
        String userFullName = entity.getUserFullName();
        if (userFullName != null) {
            stmt.bindString(8, userFullName);
        }
 
        String userPhotoUrl = entity.getUserPhotoUrl();
        if (userPhotoUrl != null) {
            stmt.bindString(9, userPhotoUrl);
        }
 
        java.util.Date createdTime = entity.getCreatedTime();
        if (createdTime != null) {
            stmt.bindLong(10, createdTime.getTime());
        }
 
        Boolean liked = entity.getLiked();
        if (liked != null) {
            stmt.bindLong(11, liked ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MainTopicEntity readEntity(Cursor cursor, int offset) {
        MainTopicEntity entity = new MainTopicEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // topicHandle
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userHandle
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // text
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // totalLikes
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // totalComments
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // userFullName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // userPhotoUrl
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // createdTime
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0 // liked
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MainTopicEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTopicHandle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserHandle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setText(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTotalLikes(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setTotalComments(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setUserFullName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUserPhotoUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCreatedTime(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setLiked(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MainTopicEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MainTopicEntity entity) {
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
