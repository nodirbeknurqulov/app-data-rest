package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.entity.Measurement;
import uz.pdp.appdatarest.projection.CustomAddress;
import uz.pdp.appdatarest.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "measurementList", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
