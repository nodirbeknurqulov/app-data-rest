package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Supplier;
import uz.pdp.appdatarest.entity.Warehouse;

@Projection(types = Supplier.class,name = "CustomSupplier")
public interface CustomSupplier {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();
}
