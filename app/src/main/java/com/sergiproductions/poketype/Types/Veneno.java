package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Veneno extends AbstractType {
    public Veneno() {
        super("Veneno", Color.rgb(128,0,128));
    }
    //def

    @Override
    public float dTierra() {
        return 2;
    }

    @Override
    public float dPsiquico() {
        return 2;
    }

    @Override
    public float dBicho() {
        return (float)0.5;
    }

    @Override
    public float dVeneno() {
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
    public float dHada() {
        return (float)0.5;
    }

    //Atac


    @Override
    public float aHada() {
        return 2;
    }

    @Override
    public float aPlanta() {
        return 2;
    }

    @Override
    public float aAcero() {
        return 0;
    }

    @Override
    public float aVeneno() {
        return (float)0.5;
    }

    @Override
    public float aTierra() {
        return (float)0.5;
    }

    @Override
    public float aRoca() {
        return (float)0.5;
    }

    @Override
    public float aFantasma() {
        return (float)0.5;
    }
}
