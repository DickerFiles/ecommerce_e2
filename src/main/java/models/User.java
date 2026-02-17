
package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author luisb
 */
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "name", nullable = false)
    private String name;
    
    @Column (name = "password", nullable = false)
    private String hashedPswd;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column (name = "is_active", nullable = false)
    private boolean isActive;
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @OneToMany (mappedBy = "user")
    private List<Order> orders;
    
    @OneToMany (mappedBy = "user")
    private List<Review> reviews;
    
    @OneToMany (mappedBy = "user")
    private List<Address> addresses;
    
    @OneToOne(mappedBy = "user")
    private Cart cart;
    
    
    
}
