package bcrypt.models;
import jakarta.persistence.*;

import java.util.List;

public class SiteUser {
    Entity
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String userName;
        String password;
        @OneToMany(mappedBy = "siteUser")
        List<Topic> topics;

        protected SiteUser(){}

        public SiteUser(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "SiteUser{" +
                    "id=" + id +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
