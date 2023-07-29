package bcrypt.models;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String info;
    String infos;

    @ManyToOne
    SiteUser siteUser;

    protected Topic() {}

    public Topic(String info, String infos) {
        this.info = info;
        this.infos = infos;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    public SiteUser getSiteUser() {
        return siteUser;
    }

    public void setSiteUser(SiteUser siteUser) {
        this.siteUser = siteUser;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", infos='" + infos + '\'' +
                ", siteUser=" + siteUser +
                '}';
    }

}
