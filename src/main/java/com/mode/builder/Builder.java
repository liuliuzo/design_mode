package com.mode.builder;

public interface Builder {// 施工方接口

    public void buildBasement();

    public void buildWall();

    public void buildRoof();

    public Building getBuilding();

}