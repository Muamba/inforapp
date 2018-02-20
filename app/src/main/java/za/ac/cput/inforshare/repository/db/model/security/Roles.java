package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Roles")
public class Roles {

        @Property(nameInDb = "id")
        private String id;

        @Property(nameInDb = "rolename  ")
        private String rolename;

        public Roles(String id, String rolename){

            this.id = id;
            this.rolename = rolename;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
