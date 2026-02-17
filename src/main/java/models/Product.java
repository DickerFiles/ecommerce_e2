
package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Set;

/**
 *
 * @author luisb
 */

@Entity
@Table (name = "Products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "name", nullable = false)
    private String name;
    
    @Column (name = "description", nullable = false)
    private String description;
    
    @Column (name = "price", nullable = false)
    private BigDecimal price;
    
    @Column (name = "stock", nullable = false)
    private int stock;
    
    @ManyToOne
    @JoinColumn (name = "category_id")
    private Category category; 
    
    @OneToMany (mappedBy = "product")
    private Set<Review> reviews;
    
    @OneToMany(mappedBy = "product")
    private Set<CartItem> cartItems;
    
    
}
