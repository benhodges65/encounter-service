//package com.dnd.builder.encounterservice.service;
//
//import com.dnd.builder.encounterservice.Repository.CustomMonsterRepository;
//import com.dnd.builder.encounterservice.model.sql.Action;
//import com.dnd.builder.encounterservice.model.sql.CustomMonster;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class TestDataInitializer implements CommandLineRunner {
//
//    @Autowired
//    private CustomMonsterRepository customMonsterRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Insert test data for custom_monsters table
//        CustomMonster customMonster1 = new CustomMonster();
//        customMonster1.setName("Test Monster 1");
//        customMonster1.setChallengeRating("1");
//        customMonster1.setType("Test Type 1");
//        customMonster1.setSize("Test Size 1");
//        customMonster1.setAlignment("Test Alignment 1");
//        customMonster1.setArmorClass(10);
//        customMonster1.setHitPoints(10);
//        customMonster1.setSpeed("10 ft.");
//        customMonster1.setStrength(10);
//        customMonster1.setDexterity(10);
//        customMonster1.setConstitution(10);
//        customMonster1.setIntelligence(10);
//        customMonster1.setWisdom(10);
//        customMonster1.setCharisma(10);
//        customMonster1.setStrengthSave(2);
//        customMonster1.setDexteritySave(null);
//        customMonster1.setConstitutionSave(null);
//        customMonster1.setIntelligenceSave(null);
//        customMonster1.setWisdomSave(5);
//        customMonster1.setCharismaSave(null);
//        customMonster1.setPerception(10);
//        Action customAction = new Action();
//        customAction.setName("Test Action 1");
//        customAction.setDescription("Test Description 1");
//        customMonster1.setActions(new ArrayList<>(List.of(customAction)));
//        customMonsterRepository.save(customMonster1);
//    }
//}
