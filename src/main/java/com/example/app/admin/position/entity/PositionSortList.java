package com.example.app.admin.position.entity;

import lombok.Data;

import java.util.List;

@Data
public class PositionSortList {

    private String workSort;

    private List<String> positionList;
}
