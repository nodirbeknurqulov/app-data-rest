package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();

    boolean getActive();
}
