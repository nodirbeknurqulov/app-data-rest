package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Currency;
import uz.pdp.appdatarest.entity.Input;
import uz.pdp.appdatarest.entity.InputProduct;
import uz.pdp.appdatarest.entity.Product;

import java.sql.Date;
import java.sql.Timestamp;

@Projection(types = InputProduct.class, name = "CustomInputProduct")
public interface CustomInputProduct {

    Integer getId();

    String getAmount();

    Date getExpireDate();

    Double getPrice();

    Input getInput();

    Product getProduct();
}
