package uz.pdp.appdatarest.entity;
// Nurkulov Nodirbek 3/8/2022  11:56 AM

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active;

    @Column(unique = true,nullable = true)
    private String phoneNumber;
}
