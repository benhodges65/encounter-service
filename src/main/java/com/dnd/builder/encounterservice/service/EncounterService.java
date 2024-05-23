package com.dnd.builder.encounterservice.service;

import com.dnd.builder.encounterservice.Repository.CustomMonsterRepository;
import com.dnd.builder.encounterservice.model.response.CustomMonstersResponse;
import com.dnd.builder.encounterservice.model.sql.CustomMonster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterService {

    @Autowired
    private CustomMonsterRepository customMonsterRepository;

    public String getEncounter(String userId) {
        return "Encounter for user " + userId;
    }

    public CustomMonstersResponse getAllCustomMonsters() {
        return new CustomMonstersResponse(customMonsterRepository.findAll());
    }

    public void saveCustomMonster(CustomMonster customMonster){
        try {
            // Set action monster to custom monster
            customMonster.getActions().forEach(action -> action.setCustomMonster(customMonster));
            customMonsterRepository.save(customMonster);
        }
        catch (Exception e) {
            throw new RuntimeException("Error saving custom monster", e);
        }
    }

    public CustomMonstersResponse getCustomMonstersByType(String type) {
        return new CustomMonstersResponse(customMonsterRepository.getCustomMonsterByType(type));
    }

}
