package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Measurement;
import uz.pdp.appdatarest.projection.CustomCategory;
import uz.pdp.appdatarest.projection.CustomMeasurement;

@RepositoryRestResource(path = "category", collectionResourceRel = "categoryList", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
