package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MASTER_POINT_ENTITY".
 */
public class MasterPointEntity {

    private Long id;
    private Integer counter;

    public MasterPointEntity() {
    }

    public MasterPointEntity(Long id) {
        this.id = id;
    }

    public MasterPointEntity(Long id, Integer counter) {
        this.id = id;
        this.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

}
