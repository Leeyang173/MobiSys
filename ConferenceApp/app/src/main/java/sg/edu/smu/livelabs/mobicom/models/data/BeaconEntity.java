package sg.edu.smu.livelabs.mobicom.models.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BEACON_ENTITY".
 */
public class BeaconEntity {

    private Long id;
    private String uuid;
    private String major;
    private String minor;
    private String url;
    private String pdfUrl;
    private String paperName;
    private Integer rate;
    private Integer capChar;
    private Double avgRating;
    private Boolean hasViewed;
    private java.util.Date lastUpdated;

    public BeaconEntity() {
    }

    public BeaconEntity(Long id) {
        this.id = id;
    }

    public BeaconEntity(Long id, String uuid, String major, String minor, String url, String pdfUrl, String paperName, Integer rate, Integer capChar, Double avgRating, Boolean hasViewed, java.util.Date lastUpdated) {
        this.id = id;
        this.uuid = uuid;
        this.major = major;
        this.minor = minor;
        this.url = url;
        this.pdfUrl = pdfUrl;
        this.paperName = paperName;
        this.rate = rate;
        this.capChar = capChar;
        this.avgRating = avgRating;
        this.hasViewed = hasViewed;
        this.lastUpdated = lastUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getCapChar() {
        return capChar;
    }

    public void setCapChar(Integer capChar) {
        this.capChar = capChar;
    }

    public Double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Double avgRating) {
        this.avgRating = avgRating;
    }

    public Boolean getHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(Boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
