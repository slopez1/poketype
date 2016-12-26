package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Volador extends AbstractType {
    public Volador() {
        super("Volador", Color.rgb(128,255,255));
    }

    protected Volador(String name, int color) {
        super(name, color);
    }

    @Override
    public float dRoca() {
        return 2;
    }

    @Override
    public float dElectrico() {
        return 2;
    }

    @Override
    public float dHielo() {
        return 2;
    }

    @Override
    public float dBicho() {
        return (float)0.5;
    }

    @Override
    public float dLucha() {
        return (float)0.5;
    }

    @Override
    public float dPlanta() {
        return (float)0.5;
    }

    @Override
    public float dTierra() {
        return 0;
    }
//Atac


    @Override
    public float aLucha() {
        return 2;
    }

    @Override
    public float aBicho() {
        return 2;
    }

    @Override
    public float aPlanta() {
        return 2;
    }

    @Override
    public float aRoca() {
        return (float)0.5;
    }

    @Override
    public float aAcero() {
        return (float)0.5;
    }

    @Override
    public float aElectrico() {
        return (float)0.5;
    }
}
