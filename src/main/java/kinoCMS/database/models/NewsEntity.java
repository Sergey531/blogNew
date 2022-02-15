package kinoCMS.database.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "news", schema = "kinocms", catalog = "")
public class NewsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "datePublication")
    private Timestamp datePublication;
    @Basic
    @Column(name = "status")
    private byte status;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "mainImageId")
    private int mainImageId;
    @Basic
    @Column(name = "galleryImageId")
    private String galleryImageId;
    @Basic
    @Column(name = "videoRef")
    private String videoRef;
    @Basic
    @Column(name = "URL")
    private String url;
    @Basic
    @Column(name = "Title")
    private String title;
    @Basic
    @Column(name = "Keywords")
    private String keywords;
    @Basic
    @Column(name = "Description2")
    private String description2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Timestamp datePublication) {
        this.datePublication = datePublication;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMainImageId() {
        return mainImageId;
    }

    public void setMainImageId(int mainImageId) {
        this.mainImageId = mainImageId;
    }

    public String getGalleryImageId() {
        return galleryImageId;
    }

    public void setGalleryImageId(String galleryImageId) {
        this.galleryImageId = galleryImageId;
    }

    public String getVideoRef() {
        return videoRef;
    }

    public void setVideoRef(String videoRef) {
        this.videoRef = videoRef;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsEntity that = (NewsEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (mainImageId != that.mainImageId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (datePublication != null ? !datePublication.equals(that.datePublication) : that.datePublication != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (galleryImageId != null ? !galleryImageId.equals(that.galleryImageId) : that.galleryImageId != null)
            return false;
        if (videoRef != null ? !videoRef.equals(that.videoRef) : that.videoRef != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (description2 != null ? !description2.equals(that.description2) : that.description2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (datePublication != null ? datePublication.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + mainImageId;
        result = 31 * result + (galleryImageId != null ? galleryImageId.hashCode() : 0);
        result = 31 * result + (videoRef != null ? videoRef.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description2 != null ? description2.hashCode() : 0);
        return result;
    }
}
