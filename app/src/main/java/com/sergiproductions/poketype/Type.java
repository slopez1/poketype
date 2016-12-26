package com.sergiproductions.poketype;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public abstract class Type {
    protected final String name;
    protected final int color;
    protected final TableType table;

    protected Type(String name, int color){
        this.name = name;
        this.color = color;
        table = new TableType();
        createTable();
    }
    public abstract void createTable();
    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public TableType getTable() {
        return table;
    }
}
