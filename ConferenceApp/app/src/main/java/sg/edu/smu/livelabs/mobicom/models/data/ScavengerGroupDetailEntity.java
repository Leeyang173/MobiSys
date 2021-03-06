package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SCAVENGER_GROUP_DETAIL_ENTITY".
 */
public class ScavengerGroupDetailEntity {

    private Long id;
    private Long huntId;
    private Long groupId;
    private String name;
    private Long userId;
    private String avatarId;
    private Boolean isSubmitted;
    private java.util.Date insertTime;

    public ScavengerGroupDetailEntity() {
    }

    public ScavengerGroupDetailEntity(Long id) {
        this.id = id;
    }

    public ScavengerGroupDetailEntity(Long id, Long huntId, Long groupId, String name, Long userId, String avatarId, Boolean isSubmitted, java.util.Date insertTime) {
        this.id = id;
        this.huntId = huntId;
        this.groupId = groupId;
        this.name = name;
        this.userId = userId;
        this.avatarId = avatarId;
        this.isSubmitted = isSubmitted;
        this.insertTime = insertTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHuntId() {
        return huntId;
    }

    public void setHuntId(Long huntId) {
        this.huntId = huntId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(String avatarId) {
        this.avatarId = avatarId;
    }

    public Boolean getIsSubmitted() {
        return isSubmitted;
    }

    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    public java.util.Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(java.util.Date insertTime) {
        this.insertTime = insertTime;
    }

}
