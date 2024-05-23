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
@Table(name = "reactions")
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(length = 2000)
    private String description;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "custom_monster_id")
    private CustomMonster customMonster;
}
