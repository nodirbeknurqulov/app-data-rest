package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.OutputProduct;
import uz.pdp.appdatarest.projection.CustomOutputProduct;
import uz.pdp.appdatarest.projection.CustomWarehouse;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "outputProductList", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
