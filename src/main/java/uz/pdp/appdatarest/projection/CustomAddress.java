package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Address;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getCity();

    String getStreet();
}
