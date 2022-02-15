package kinoCMS.database.models;

import javax.persistence.*;

@Entity
@Table(name = "pages", schema = "kinocms", catalog = "")
public class PagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "SEOtext")
    private String seOtext;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSeOtext() {
        return seOtext;
    }

    public void setSeOtext(String seOtext) {
        this.seOtext = seOtext;
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

        PagesEntity that = (PagesEntity) o;

        if (id != that.id) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (seOtext != null ? !seOtext.equals(that.seOtext) : that.seOtext != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (description2 != null ? !description2.equals(that.description2) : that.description2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (seOtext != null ? seOtext.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description2 != null ? description2.hashCode() : 0);
        return result;
    }
}
