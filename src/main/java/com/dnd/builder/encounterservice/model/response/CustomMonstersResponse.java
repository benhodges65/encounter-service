package com.dnd.builder.encounterservice.model.response;

import com.dnd.builder.encounterservice.model.sql.CustomMonster;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomMonstersResponse {
    private List<CustomMonster> customMonsterList;
}
