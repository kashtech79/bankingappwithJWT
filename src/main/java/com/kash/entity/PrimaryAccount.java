//package com.kash.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//public class PrimaryAccount {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private int accountNumber;
//    private BigDecimal accountBalance;
//    @OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonManagedReference
//    private List<PrimaryTransaction> primaryTransactionList;
//}