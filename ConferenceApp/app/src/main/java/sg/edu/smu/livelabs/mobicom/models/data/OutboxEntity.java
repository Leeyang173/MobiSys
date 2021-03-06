package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "OUTBOX_ENTITY".
 */
public class OutboxEntity {

    private Long id;
    private Long eventId;
    private Long time;
    private java.util.Date DateTime;
    private String title;
    private String message;
    private Boolean read;

    public OutboxEntity() {
    }

    public OutboxEntity(Long id) {
        this.id = id;
    }

    public OutboxEntity(Long id, Long eventId, Long time, java.util.Date DateTime, String title, String message, Boolean read) {
        this.id = id;
        this.eventId = eventId;
        this.time = time;
        this.DateTime = DateTime;
        this.title = title;
        this.message = message;
        this.read = read;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public java.util.Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(java.util.Date DateTime) {
        this.DateTime = DateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

}
