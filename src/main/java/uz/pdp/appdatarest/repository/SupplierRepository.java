package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.AttachmentContent;
import uz.pdp.appdatarest.entity.Supplier;
import uz.pdp.appdatarest.projection.CustomAttachmentContent;
import uz.pdp.appdatarest.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "supplierList", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
