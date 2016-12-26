package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Fantasma extends AbstractType {
    public Fantasma() {
        super("Fantasma", Color.rgb(128,128,255));
    }

    @Override
    public float dFantasma() {
        return 2;
    }

    @Override
    public float dSiniestro() {
        return 2;
    }

    @Override
    public float dVeneno() {
        return (float)0.5;
    }

    @Override
    public float dBicho() {
        return (float)0.5;
    }

    @Override
    public float dLucha() {
        return 0;
    }

    @Override
    public float dNormal() {
        return 0;
    }

    @Override
    public float aFantasma() {
        return 2;
    }

    @Override
    public float aPsiquico() {
        return 2;
    }

    @Override
    public float aNormal() {
        return 0;
    }

    @Override
    public float aSiniestro() {
        return (float)0.5;
    }
}
