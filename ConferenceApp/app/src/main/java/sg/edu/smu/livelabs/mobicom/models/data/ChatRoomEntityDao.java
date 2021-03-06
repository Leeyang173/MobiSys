package sg.edu.smu.livelabs.mobicom.models.data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import sg.edu.smu.livelabs.mobicom.models.data.ChatRoomEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHAT_ROOM_ENTITY".
*/
public class ChatRoomEntityDao extends AbstractDao<ChatRoomEntity, Long> {

    public static final String TABLENAME = "CHAT_ROOM_ENTITY";

    /**
     * Properties of entity ChatRoomEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Avatar = new Property(2, String.class, "avatar", false, "AVATAR");
        public final static Property UserIds = new Property(3, String.class, "userIds", false, "USER_IDS");
        public final static Property ServerId = new Property(4, Long.class, "serverId", false, "SERVER_ID");
        public final static Property Admin = new Property(5, Long.class, "admin", false, "ADMIN");
        public final static Property IsGroup = new Property(6, Boolean.class, "isGroup", false, "IS_GROUP");
        public final static Property LastUserId = new Property(7, Long.class, "lastUserId", false, "LAST_USER_ID");
        public final static Property UserNames = new Property(8, String.class, "userNames", false, "USER_NAMES");
        public final static Property PhoneNumbers = new Property(9, String.class, "phoneNumbers", false, "PHONE_NUMBERS");
        public final static Property Emails = new Property(10, String.class, "emails", false, "EMAILS");
        public final static Property AvatarIds = new Property(11, String.class, "avatarIds", false, "AVATAR_IDS");
        public final static Property LastMessage = new Property(12, String.class, "lastMessage", false, "LAST_MESSAGE");
        public final static Property LastMessageTime = new Property(13, java.util.Date.class, "lastMessageTime", false, "LAST_MESSAGE_TIME");
        public final static Property LastUpdated = new Property(14, java.util.Date.class, "lastUpdated", false, "LAST_UPDATED");
        public final static Property Owner = new Property(15, Long.class, "owner", false, "OWNER");
        public final static Property Unread = new Property(16, Integer.class, "unread", false, "UNREAD");
        public final static Property Status = new Property(17, String.class, "status", false, "STATUS");
        public final static Property MemberStatus = new Property(18, String.class, "memberStatus", false, "MEMBER_STATUS");
    };


    public ChatRoomEntityDao(DaoConfig config) {
        super(config);
    }
    
    public ChatRoomEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_ROOM_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"AVATAR\" TEXT," + // 2: avatar
                "\"USER_IDS\" TEXT," + // 3: userIds
                "\"SERVER_ID\" INTEGER," + // 4: serverId
                "\"ADMIN\" INTEGER," + // 5: admin
                "\"IS_GROUP\" INTEGER," + // 6: isGroup
                "\"LAST_USER_ID\" INTEGER," + // 7: lastUserId
                "\"USER_NAMES\" TEXT," + // 8: userNames
                "\"PHONE_NUMBERS\" TEXT," + // 9: phoneNumbers
                "\"EMAILS\" TEXT," + // 10: emails
                "\"AVATAR_IDS\" TEXT," + // 11: avatarIds
                "\"LAST_MESSAGE\" TEXT," + // 12: lastMessage
                "\"LAST_MESSAGE_TIME\" INTEGER," + // 13: lastMessageTime
                "\"LAST_UPDATED\" INTEGER," + // 14: lastUpdated
                "\"OWNER\" INTEGER," + // 15: owner
                "\"UNREAD\" INTEGER," + // 16: unread
                "\"STATUS\" TEXT," + // 17: status
                "\"MEMBER_STATUS\" TEXT);"); // 18: memberStatus
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_CHAT_ROOM_ENTITY_SERVER_ID ON CHAT_ROOM_ENTITY" +
                " (\"SERVER_ID\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_CHAT_ROOM_ENTITY_LAST_UPDATED ON CHAT_ROOM_ENTITY" +
                " (\"LAST_UPDATED\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_CHAT_ROOM_ENTITY_OWNER ON CHAT_ROOM_ENTITY" +
                " (\"OWNER\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_ROOM_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ChatRoomEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(3, avatar);
        }
 
        String userIds = entity.getUserIds();
        if (userIds != null) {
            stmt.bindString(4, userIds);
        }
 
        Long serverId = entity.getServerId();
        if (serverId != null) {
            stmt.bindLong(5, serverId);
        }
 
        Long admin = entity.getAdmin();
        if (admin != null) {
            stmt.bindLong(6, admin);
        }
 
        Boolean isGroup = entity.getIsGroup();
        if (isGroup != null) {
            stmt.bindLong(7, isGroup ? 1L: 0L);
        }
 
        Long lastUserId = entity.getLastUserId();
        if (lastUserId != null) {
            stmt.bindLong(8, lastUserId);
        }
 
        String userNames = entity.getUserNames();
        if (userNames != null) {
            stmt.bindString(9, userNames);
        }
 
        String phoneNumbers = entity.getPhoneNumbers();
        if (phoneNumbers != null) {
            stmt.bindString(10, phoneNumbers);
        }
 
        String emails = entity.getEmails();
        if (emails != null) {
            stmt.bindString(11, emails);
        }
 
        String avatarIds = entity.getAvatarIds();
        if (avatarIds != null) {
            stmt.bindString(12, avatarIds);
        }
 
        String lastMessage = entity.getLastMessage();
        if (lastMessage != null) {
            stmt.bindString(13, lastMessage);
        }
 
        java.util.Date lastMessageTime = entity.getLastMessageTime();
        if (lastMessageTime != null) {
            stmt.bindLong(14, lastMessageTime.getTime());
        }
 
        java.util.Date lastUpdated = entity.getLastUpdated();
        if (lastUpdated != null) {
            stmt.bindLong(15, lastUpdated.getTime());
        }
 
        Long owner = entity.getOwner();
        if (owner != null) {
            stmt.bindLong(16, owner);
        }
 
        Integer unread = entity.getUnread();
        if (unread != null) {
            stmt.bindLong(17, unread);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(18, status);
        }
 
        String memberStatus = entity.getMemberStatus();
        if (memberStatus != null) {
            stmt.bindString(19, memberStatus);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ChatRoomEntity readEntity(Cursor cursor, int offset) {
        ChatRoomEntity entity = new ChatRoomEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // avatar
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userIds
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // serverId
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // admin
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // isGroup
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // lastUserId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // userNames
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // phoneNumbers
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // emails
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // avatarIds
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // lastMessage
            cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)), // lastMessageTime
            cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)), // lastUpdated
            cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15), // owner
            cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16), // unread
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // status
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18) // memberStatus
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ChatRoomEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAvatar(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserIds(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setServerId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setAdmin(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setIsGroup(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setLastUserId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setUserNames(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPhoneNumbers(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setEmails(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAvatarIds(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLastMessage(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setLastMessageTime(cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)));
        entity.setLastUpdated(cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)));
        entity.setOwner(cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15));
        entity.setUnread(cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16));
        entity.setStatus(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setMemberStatus(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ChatRoomEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ChatRoomEntity entity) {
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
