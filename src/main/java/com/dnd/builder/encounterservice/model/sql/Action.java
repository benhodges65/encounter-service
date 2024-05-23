package com.dnd.builder.encounterservice.model.sql;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "actions")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(length = 2000)
    private String description;

    private Integer attackBonus;

    private String damageDice;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "custom_monster_id")
    private CustomMonster customMonster;
}
