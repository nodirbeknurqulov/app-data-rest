package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Category;
import uz.pdp.appdatarest.entity.Currency;
import uz.pdp.appdatarest.projection.CustomCategory;
import uz.pdp.appdatarest.projection.CustomCurrency;

@RepositoryRestResource(path = "currency", collectionResourceRel = "currencyList", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
