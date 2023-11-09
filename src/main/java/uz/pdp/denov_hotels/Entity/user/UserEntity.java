package uz.pdp.denov_hotels.Entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.denov_hotels.Entity.BaseEntity;

import java.util.Collection;
import java.util.List;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserEntity  extends BaseEntity implements UserDetails {
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleEntity role=RoleEntity.Owner;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String ROLE = "ROLE_";
        return List.of(new SimpleGrantedAuthority(ROLE+role.name()));
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
