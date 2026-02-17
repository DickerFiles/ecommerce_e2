/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author luisb
 */
public class PaymentMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "name", nullable = false)
    private String number;
    
    @Column (name = "cvv", nullable = false)
    private String cvv;
    
    @Column (name = "date", nullable = false)
    private LocalDate date;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_category", nullable = false)
    private PaymentCategory paymentCatgory;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "user_id")
    private User user;
}

