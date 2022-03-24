package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Attachment;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Measurement;
import uz.pdp.appdatarest.entity.Product;

import javax.persistence.*;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    boolean getActive();

    String getCode();

    Integer getCategoryId();

    Integer getMeasurementId();

    Integer getAttachmentId();

}
