package uz.pdp.appdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdatarest.entity.Attachment;
import uz.pdp.appdatarest.entity.AttachmentContent;
import uz.pdp.appdatarest.projection.CustomAttachment;
import uz.pdp.appdatarest.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "attachmentContentList", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
