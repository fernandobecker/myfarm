package com.fcs.myfarm.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Fase {

    @Id
    private Integer cd_fase;

    private String initial;

    private String description;
}
