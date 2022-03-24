package uz.pdp.appdatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Nurkulov Nodirbek 3/24/2022  6:44 AM
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    /**
     * bittagina Address classini CRUD qilish uchun 4 ta klass ochib
     * shuncha vaqtda qilib boldik. Va buni har safar ochib qilib zerikarli boladi.
     * Shu sababdan Data REST orqali buni 2 yoki 3 daqiqada amalga oshirsak boladi!!!
     */

    /**
     * faqat Address degan entity va AddressRepository qoldi hech qanday
     * Controllerim ham Service im ham yoq
     */

    /**
     * qiladigan ishim faqat pomxml ha data-rest dependecy ni va application propertiesga
     * base path ni qoshdim
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String city;

    private String street;
}
