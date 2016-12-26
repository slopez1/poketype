package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Siniestro extends AbstractType {
    public Siniestro() {
        super("Siniestro", Color.rgb(0,0,0));
    }

    @Override
    public float dLucha() {
        return 2;
    }

    @Override
    public float dBicho() {
        return 2;
    }

    @Override
    public float dHada() {
        return 2;
    }

    @Override
    public float dFantasma() {
        return (float)0.5;
    }

    @Override
    public float dSiniestro() {
        return (float)0.5;
    }

    @Override
    public float dPsiquico() {
        return 0;
    }


    //atac

    @Override
    public float aFantasma() {
        return 2;
    }

    @Override
    public float aPsiquico() {
        return 2;
    }

    @Override
    public float aLucha() {
        return (float)0.5;
    }

    @Override
    public float aSiniestro() {
        return (float)0.5;
    }

    @Override
    public float aHada() {
        return (float)0.5;
    }
}
