package uz.pdp.denov_hotels.Entity.hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import uz.pdp.denov_hotels.Entity.BaseEntity;
import uz.pdp.denov_hotels.Entity.user.UserEntity;

@Entity(name = "hotels")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class HotelEntity extends BaseEntity {
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false,unique = true)
    private String address;
    @Column(nullable = false,unique = true)
    private String description;
    @ManyToOne
    private UserEntity owner;
}
