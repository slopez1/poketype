package com.sergiproductions.poketype;

/**
 * Created by Sergi on 15/08/2016.
 */
public class TableTypeRow {
    private final String type;
    private float ataque;
    private float defensa;

    @Override
    public String toString() {
        return "TableTypeRow{" +
                "type='" + type + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}'+'\n';
    }

    public TableTypeRow(String type, float ataque, float defensa) {
        this.type = type;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getType() {
        return type;
    }

    public float getAtaque() {
        return ataque;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }


}