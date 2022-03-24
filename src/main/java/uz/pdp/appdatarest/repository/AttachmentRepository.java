package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Attachment;
import uz.pdp.appdatarest.entity.Measurement;
import uz.pdp.appdatarest.projection.CustomAttachment;
import uz.pdp.appdatarest.projection.CustomCategory;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "attachmentList", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
