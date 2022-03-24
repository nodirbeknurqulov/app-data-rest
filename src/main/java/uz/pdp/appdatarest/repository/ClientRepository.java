package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.Currency;
import uz.pdp.appdatarest.projection.CustomClient;
import uz.pdp.appdatarest.projection.CustomCurrency;

@RepositoryRestResource(path = "client", collectionResourceRel = "clientList", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
