package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Output;
import uz.pdp.appdatarest.entity.OutputProduct;

import java.sql.Timestamp;

@Projection(types = OutputProduct.class,name = "CustomOutputProduct")
public interface CustomOutputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Integer getOutputId();

    Integer getProductId();
}
