package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FIRST_ENTITY".
 */
public class FirstEntity {

    private Long id;
    private Boolean clear;

    public FirstEntity() {
    }

    public FirstEntity(Long id) {
        this.id = id;
    }

    public FirstEntity(Long id, Boolean clear) {
        this.id = id;
        this.clear = clear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getClear() {
        return clear;
    }

    public void setClear(Boolean clear) {
        this.clear = clear;
    }

}
