package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.projection.CustomOutput;
import uz.pdp.appdatarest.projection.CustomWarehouse;

@RepositoryRestResource(path = "output", collectionResourceRel = "outputList", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Client, Integer> {
}
