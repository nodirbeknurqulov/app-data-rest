package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Product;
import uz.pdp.appdatarest.projection.CustomCategory;
import uz.pdp.appdatarest.projection.CustomProduct;

@RepositoryRestResource(path = "product", collectionResourceRel = "productList", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
