package uz.pdp.appdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.projection.CustomAddress;

@RepositoryRestResource(path = "address", collectionResourceRel = "list", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
    //bu qidirish uchun edi
//    @RestResource(path = "byName")
//    public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);
}
