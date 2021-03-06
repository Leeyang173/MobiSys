package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SCAVENGER_ENTITY".
 */
public class ScavengerEntity {

    private Long id;
    private Long huntId;
    private String title;
    private String iconId;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private String description;
    private Boolean isStarted;
    private Boolean isCompleted;
    private Boolean isSubmitted;
    private String photo;
    private Integer userReequiredCount;
    private String qrCode;
    private String type;
    private java.util.Date insertTime;
    private java.util.Date lastUpdate;

    public ScavengerEntity() {
    }

    public ScavengerEntity(Long id) {
        this.id = id;
    }

    public ScavengerEntity(Long id, Long huntId, String title, String iconId, java.util.Date startTime, java.util.Date endTime, String description, Boolean isStarted, Boolean isCompleted, Boolean isSubmitted, String photo, Integer userReequiredCount, String qrCode, String type, java.util.Date insertTime, java.util.Date lastUpdate) {
        this.id = id;
        this.huntId = huntId;
        this.title = title;
        this.iconId = iconId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.isStarted = isStarted;
        this.isCompleted = isCompleted;
        this.isSubmitted = isSubmitted;
        this.photo = photo;
        this.userReequiredCount = userReequiredCount;
        this.qrCode = qrCode;
        this.type = type;
        this.insertTime = insertTime;
        this.lastUpdate = lastUpdate;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsStarted() {
        return isStarted;
    }

    public void setIsStarted(Boolean isStarted) {
        this.isStarted = isStarted;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Boolean getIsSubmitted() {
        return isSubmitted;
    }

    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getUserReequiredCount() {
        return userReequiredCount;
    }

    public void setUserReequiredCount(Integer userReequiredCount) {
        this.userReequiredCount = userReequiredCount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public java.util.Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(java.util.Date insertTime) {
        this.insertTime = insertTime;
    }

    public java.util.Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
