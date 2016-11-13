package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "PAPER_EVENT".
 */
public class PaperEvent {

    private Long id;
    private Long ServerId;
    private String Title;
    private String pdfLink;
    private String epubLink;
    private String authors;
    private java.util.Date eventTime;

    public PaperEvent() {
    }

    public PaperEvent(Long id) {
        this.id = id;
    }

    public PaperEvent(Long id, Long ServerId, String Title, String pdfLink, String epubLink, String authors, java.util.Date eventTime) {
        this.id = id;
        this.ServerId = ServerId;
        this.Title = Title;
        this.pdfLink = pdfLink;
        this.epubLink = epubLink;
        this.authors = authors;
        this.eventTime = eventTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServerId() {
        return ServerId;
    }

    public void setServerId(Long ServerId) {
        this.ServerId = ServerId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }

    public String getEpubLink() {
        return epubLink;
    }

    public void setEpubLink(String epubLink) {
        this.epubLink = epubLink;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public java.util.Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

}
