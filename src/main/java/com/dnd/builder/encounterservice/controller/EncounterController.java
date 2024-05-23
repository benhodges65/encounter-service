package com.dnd.builder.encounterservice.controller;

import com.dnd.builder.encounterservice.model.response.CustomMonstersResponse;
import com.dnd.builder.encounterservice.model.sql.CustomMonster;
import com.dnd.builder.encounterservice.service.EncounterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class EncounterController {

    @Autowired
    private EncounterService encounterService;

    @GetMapping("/encounters/{userId}")
    public String getEncounter(@PathVariable String userId) {
        return encounterService.getEncounter(userId);
    }

    @GetMapping("/custom-monsters")
    public ResponseEntity<CustomMonstersResponse> getAllCustomMonsters() {
        try {
            return ResponseEntity.ok(encounterService.getAllCustomMonsters());
        } catch (Exception e) {
            log.error("Error getting custom monsters", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/save-custom-monster")
    public ResponseEntity<String> saveCustomMonster(@RequestBody CustomMonster customMonster) {
        try {
            encounterService.saveCustomMonster(customMonster);
            return ResponseEntity.ok("Custom monster saved");
        } catch (Exception e) {
            log.error("Error saving custom monster", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get-custom-monsters-by-type/{type}")
    public ResponseEntity<CustomMonstersResponse> getCustomMonstersByType(@PathVariable String type) {
        try {
            return ResponseEntity.ok(encounterService.getCustomMonstersByType(type));
        } catch (Exception e) {
            log.error("Error getting custom monsters by type", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
