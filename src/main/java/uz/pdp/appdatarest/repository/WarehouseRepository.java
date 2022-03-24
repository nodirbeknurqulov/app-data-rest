package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.Warehouse;
import uz.pdp.appdatarest.projection.CustomClient;
import uz.pdp.appdatarest.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "warehouseList", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
