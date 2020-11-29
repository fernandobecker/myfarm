package com.fcs.myfarm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;

    private String type;

    private Integer status;

    private String location;

    private String birth_date;

    private String squad_entry;

    private String purchase_weight;

    private String breed;

    private String tracking_code;

    @OneToOne
    @JoinColumn(name = "cd_fase")
    private Fase fase;

    @OneToOne
    @JoinColumn(name = "cd_type_farm")
    private TypeFarm typeFarm;
}
