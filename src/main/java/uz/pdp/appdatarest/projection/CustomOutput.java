package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.Currency;
import uz.pdp.appdatarest.entity.Output;
import uz.pdp.appdatarest.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Output.class,name = "CustomOutput")
public interface CustomOutput {
    Integer getId();

    Timestamp getDate();

    Integer getWarehouseId();

    Integer getClientId();

    Integer getCurrencyId();

    String getFactureNumber();

    String getCode();

}
