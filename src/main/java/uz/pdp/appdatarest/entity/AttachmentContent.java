package uz.pdp.appdatarest.entity;
// Nurkulov Nodirbek 3/8/2022  10:11 AM

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private byte[] mainContent;

    @OneToOne
    private Attachment attachment;
}
