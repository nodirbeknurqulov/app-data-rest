package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Measurement;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Projection(types = Category.class,name = "CustomCategory")
public interface CustomCategory {
    Integer getId();

    String getName();

    Category getCategory();

    Boolean getActive();
}
