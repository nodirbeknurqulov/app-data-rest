package uz.pdp.appdatarest.entity;
// Nurkulov Nodirbek 3/8/2022  10:30 AM

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active = true;

//    (optional = false)//bu not null degani
    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    @ManyToOne(optional = false)
    private Measurement measurement;
}
