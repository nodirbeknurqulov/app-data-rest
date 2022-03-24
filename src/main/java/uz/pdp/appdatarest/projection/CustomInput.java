package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Currency;
import uz.pdp.appdatarest.entity.Input;
import uz.pdp.appdatarest.entity.Supplier;
import uz.pdp.appdatarest.entity.Warehouse;

import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Input.class,name = "CustomInput")
public interface CustomInput {
    Integer getId();

    String getCode();

    Timestamp getDate();

    String getFactureNumber();

    Currency getCurrency();

    Supplier getSupplier();

    Warehouse getWarehouse();
}
