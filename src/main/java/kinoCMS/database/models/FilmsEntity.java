package kinoCMS.database.models;

import javax.persistence.*;

@Entity
@Table(name = "films", schema = "kinocms", catalog = "")
public class FilmsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "mainImageId")
    private String mainImageId;
    @Basic
    @Column(name = "galleryImageId")
    private String galleryImageId;
    @Basic
    @Column(name = "trailerRef")
    private String trailerRef;
    @Basic
    @Column(name = "type2D")
    private byte type2D;
    @Basic
    @Column(name = "type3D")
    private byte type3D;
    @Basic
    @Column(name = "IMAX")
    private byte imax;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainImageId() {
        return mainImageId;
    }

    public void setMainImageId(String mainImageId) {
        this.mainImageId = mainImageId;
    }

    public String getGalleryImageId() {
        return galleryImageId;
    }

    public void setGalleryImageId(String galleryImageId) {
        this.galleryImageId = galleryImageId;
    }

    public String getTrailerRef() {
        return trailerRef;
    }

    public void setTrailerRef(String trailerRef) {
        this.trailerRef = trailerRef;
    }

    public byte getType2D() {
        return type2D;
    }

    public void setType2D(byte type2D) {
        this.type2D = type2D;
    }

    public byte getType3D() {
        return type3D;
    }

    public void setType3D(byte type3D) {
        this.type3D = type3D;
    }

    public byte getImax() {
        return imax;
    }

    public void setImax(byte imax) {
        this.imax = imax;
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

        FilmsEntity that = (FilmsEntity) o;

        if (id != that.id) return false;
        if (type2D != that.type2D) return false;
        if (type3D != that.type3D) return false;
        if (imax != that.imax) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (mainImageId != null ? !mainImageId.equals(that.mainImageId) : that.mainImageId != null) return false;
        if (galleryImageId != null ? !galleryImageId.equals(that.galleryImageId) : that.galleryImageId != null)
            return false;
        if (trailerRef != null ? !trailerRef.equals(that.trailerRef) : that.trailerRef != null) return false;
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
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (mainImageId != null ? mainImageId.hashCode() : 0);
        result = 31 * result + (galleryImageId != null ? galleryImageId.hashCode() : 0);
        result = 31 * result + (trailerRef != null ? trailerRef.hashCode() : 0);
        result = 31 * result + (int) type2D;
        result = 31 * result + (int) type3D;
        result = 31 * result + (int) imax;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description2 != null ? description2.hashCode() : 0);
        return result;
    }
}
