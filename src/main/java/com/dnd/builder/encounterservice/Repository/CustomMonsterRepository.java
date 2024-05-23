package com.dnd.builder.encounterservice.Repository;

import com.dnd.builder.encounterservice.model.sql.CustomMonster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomMonsterRepository extends JpaRepository<CustomMonster, Long> {

    List<CustomMonster> getCustomMonsterByType(String type);
}
