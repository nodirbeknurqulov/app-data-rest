package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Product;
import uz.pdp.appdatarest.entity.User;
import uz.pdp.appdatarest.entity.Warehouse;

import javax.persistence.*;
import java.util.Set;

@Projection(types = User.class,name = "CustomUser")
public interface CustomUser {

     Integer getId();

     Boolean getActive();

     String getCode();

     String getFirstName();

     String getLastName();

     String getPassword();

     String getPhoneNumber();

     String getRole();

     String getUsername();
}
