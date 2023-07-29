package bcrypt.repos;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
    public SiteUser findSiteUserByUserName(String userName);
}
