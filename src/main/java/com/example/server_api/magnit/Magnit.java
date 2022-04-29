package com.example.server_api.magnit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "sells_magnit")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Magnit {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "clientsIdSeq", sequenceName = "clients_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq")
    private Integer id;

    @Column(name = "product")
    private String product;

    @Column(name = "type_product")
    private String type_product;

    @Column(name = "date_start")
    private String date_start;

    @Column(name = "date_end")
    private String date_end;

    @Column(name = "old_price")
    private Integer old_price;

    @Column(name = "new_price")
    private Integer new_price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //… getters and setters
}
