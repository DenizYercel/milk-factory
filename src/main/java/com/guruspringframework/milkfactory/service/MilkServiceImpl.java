package com.guruspringframework.milkfactory.service;

import com.guruspringframework.milkfactory.web.model.MilkDto;
import com.guruspringframework.milkfactory.web.model.MilkStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class MilkServiceImpl implements MilkService {
    @Override
    public MilkDto getMilkById(UUID milkId) {
        return MilkDto.builder().id(UUID.randomUUID())
                .milkName("Sutas")
                .milStyle(MilkStyleEnum.GOAT)
                .build();
    }

    @Override
    public MilkDto saveNewMilk(MilkDto milkDto) {
        return MilkDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateMilk(UUID milkId, MilkDto milkDto) {

    }

    @Override
    public void deleteById(UUID milkId) {
        log.debug("Deleting milk with id {}", milkId);
    }


}
