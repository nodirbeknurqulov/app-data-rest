package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Client;
import uz.pdp.appdatarest.entity.User;
import uz.pdp.appdatarest.projection.CustomWarehouse;

@RepositoryRestResource(path = "user", collectionResourceRel = "userList", excerptProjection = CustomWarehouse.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
