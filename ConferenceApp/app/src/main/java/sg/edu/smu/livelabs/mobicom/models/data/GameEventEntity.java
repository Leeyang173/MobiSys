package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GAME_EVENT_ENTITY".
 */
public class GameEventEntity {

    private Long id;
    private Long gameId;
    private Long eventServerID;
    private String keyWork;
    private String image;

    public GameEventEntity() {
    }

    public GameEventEntity(Long id) {
        this.id = id;
    }

    public GameEventEntity(Long id, Long gameId, Long eventServerID, String keyWork, String image) {
        this.id = id;
        this.gameId = gameId;
        this.eventServerID = eventServerID;
        this.keyWork = keyWork;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getEventServerID() {
        return eventServerID;
    }

    public void setEventServerID(Long eventServerID) {
        this.eventServerID = eventServerID;
    }

    public String getKeyWork() {
        return keyWork;
    }

    public void setKeyWork(String keyWork) {
        this.keyWork = keyWork;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
