package com.dnd.builder.encounterservice.model.sql;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "custom_monsters")
public class CustomMonster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String createdBy;

    private String name;

    private String size;

    private String type;

    private String alignment;

    private Integer armorClass;

    private String armorDesc;

    private Integer hitPoints;

    private String hitDice;

    private String speed;

    private Integer strength;

    private Integer dexterity;

    private Integer constitution;

    private Integer intelligence;

    private Integer wisdom;

    private Integer charisma;

    private Integer strengthSave;

    private Integer dexteritySave;

    private Integer constitutionSave;

    private Integer intelligenceSave;

    private Integer wisdomSave;

    private Integer charismaSave;

    private Integer perception;

    private String damageVulnerabilities;

    private String damageResistances;

    private String damageImmunities;

    private String conditionImmunities;

    private String senses;

    private String languages;

    private String challengeRating;

    private Double cr;

    @JsonManagedReference
    @OneToMany(mappedBy = "customMonster", cascade = CascadeType.ALL)
    private List<Action> actions;

    @JsonManagedReference
    @OneToMany(mappedBy = "customMonster", cascade = CascadeType.ALL)
    private List<BonusAction> bonusActions;

    @JsonManagedReference
    @OneToMany(mappedBy = "customMonster", cascade = CascadeType.ALL)
    private List<Reaction> reactions;

    private String legendaryDesc;

    @JsonManagedReference
    @OneToMany(mappedBy = "customMonster", cascade = CascadeType.ALL)
    private List<LegendaryAction> legendaryActions;

    @JsonManagedReference
    @OneToMany(mappedBy = "customMonster", cascade = CascadeType.ALL)
    private List<Trait> traits;

    private String source;

    private String documentLicenseUrl;

    private String documentUrl;

}
