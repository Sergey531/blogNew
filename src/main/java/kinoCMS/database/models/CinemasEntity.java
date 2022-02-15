package kinoCMS.database.models;

import javax.persistence.*;

@Entity
@Table(name = "cinemas", schema = "kinocms", catalog = "")
public class CinemasEntity {
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
    @Column(name = "conditions")
    private String conditions;
    @Basic
    @Column(name = "cinemascol")
    private String cinemascol;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "topBannerPhoto")
    private String topBannerPhoto;
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getCinemascol() {
        return cinemascol;
    }

    public void setCinemascol(String cinemascol) {
        this.cinemascol = cinemascol;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTopBannerPhoto() {
        return topBannerPhoto;
    }

    public void setTopBannerPhoto(String topBannerPhoto) {
        this.topBannerPhoto = topBannerPhoto;
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

        CinemasEntity that = (CinemasEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null) return false;
        if (cinemascol != null ? !cinemascol.equals(that.cinemascol) : that.cinemascol != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (topBannerPhoto != null ? !topBannerPhoto.equals(that.topBannerPhoto) : that.topBannerPhoto != null)
            return false;
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
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (conditions != null ? conditions.hashCode() : 0);
        result = 31 * result + (cinemascol != null ? cinemascol.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (topBannerPhoto != null ? topBannerPhoto.hashCode() : 0);
        result = 31 * result + (galleryImageId != null ? galleryImageId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description2 != null ? description2.hashCode() : 0);
        return result;
    }
}
