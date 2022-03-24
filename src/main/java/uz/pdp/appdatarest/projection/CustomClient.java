package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.Product;

import javax.persistence.Column;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();

}
