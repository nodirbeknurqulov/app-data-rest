package uz.pdp.appdatarest.entity;
// Nurkulov Nodirbek 3/8/2022  10:15 AM

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active;

    @Column(unique = true,nullable = false)
    private String phoneNumber;
}
