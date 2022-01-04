package com.kylmcb.techtest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;

    @OneToMany(mappedBy = "account",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<GasReading> gasReadings;

    @OneToMany(mappedBy = "account",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ElecReading> elecReadings;

}
