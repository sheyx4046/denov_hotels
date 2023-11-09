package uz.pdp.denov_hotels.Entity.room;
import jakarta.persistence.*;
import lombok.*;
import uz.pdp.denov_hotels.Entity.BaseEntity;
import uz.pdp.denov_hotels.Entity.hotel.HotelEntity;

@Entity(name = "rooms")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoomEntity extends BaseEntity {
    @Column(nullable = false)
    private String bed;
    private Boolean hasTV;
    private Double price;
    @Enumerated(EnumType.STRING)
    private RoomType type;
    @ManyToOne
    private HotelEntity hotel;
}
