package uz.pdp.appdatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.Attachment;
import uz.pdp.appdatarest.entity.AttachmentContent;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class,name = "CustomAttachmentContent")
public interface CustomAttachmentContent {
    Integer getId();

    Byte[] getMainContent();

    Attachment getAttachment();
}
