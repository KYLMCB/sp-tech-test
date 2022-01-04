package com.kylmcb.techtest.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "gas_reading")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GasReading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int meterId;
    private int reading;
    private LocalDate date;

    @JsonBackReference
    @ToString.Exclude
    @ManyToOne()
    @JoinColumn(name="account_id")
    private Account account;

}
