package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();
}
