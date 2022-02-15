package kinoCMS.database.models;

import javax.persistence.*;

@Entity
@Table(name = "halls", schema = "kinocms", catalog = "")
public class HallsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "hallNumber")
    private int hallNumber;
    @Basic
    @Column(name = "Desscription")
    private String desscription;
    @Basic
    @Column(name = "hallSchemeId")
    private int hallSchemeId;
    @Basic
    @Column(name = "topBanner")
    private String topBanner;
    @Basic
    @Column(name = "galleryImageId")
    private String galleryImageId;
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

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public String getDesscription() {
        return desscription;
    }

    public void setDesscription(String desscription) {
        this.desscription = desscription;
    }

    public int getHallSchemeId() {
        return hallSchemeId;
    }

    public void setHallSchemeId(int hallSchemeId) {
        this.hallSchemeId = hallSchemeId;
    }

    public String getTopBanner() {
        return topBanner;
    }

    public void setTopBanner(String topBanner) {
        this.topBanner = topBanner;
    }

    public String getGalleryImageId() {
        return galleryImageId;
    }

    public void setGalleryImageId(String galleryImageId) {
        this.galleryImageId = galleryImageId;
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

        HallsEntity that = (HallsEntity) o;

        if (id != that.id) return false;
        if (hallNumber != that.hallNumber) return false;
        if (hallSchemeId != that.hallSchemeId) return false;
        if (desscription != null ? !desscription.equals(that.desscription) : that.desscription != null) return false;
        if (topBanner != null ? !topBanner.equals(that.topBanner) : that.topBanner != null) return false;
        if (galleryImageId != null ? !galleryImageId.equals(that.galleryImageId) : that.galleryImageId != null)
            return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (description2 != null ? !description2.equals(that.description2) : that.description2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + hallNumber;
        result = 31 * result + (desscription != null ? desscription.hashCode() : 0);
        result = 31 * result + hallSchemeId;
        result = 31 * result + (topBanner != null ? topBanner.hashCode() : 0);
        result = 31 * result + (galleryImageId != null ? galleryImageId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description2 != null ? description2.hashCode() : 0);
        return result;
    }
}
