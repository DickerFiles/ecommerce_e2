
package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author luisb
 */

@Entity
@Table (name = "reviews")
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "rating", nullable = false)
    private int rating;
    
    @Column (name = "comment")
    private String comment;
    
    @Column (name = "date")
    private LocalDateTime date;
    
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
    
    @ManyToOne
    @JoinColumn (name = "product_id")
    private Product product;
}
