package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Psiquico extends AbstractType {
    public Psiquico() {
        super("Psiquico", Color.rgb(255,255,128));
    }

    @Override
    public float dBicho() {
        return 2;
    }

    @Override
    public float dSiniestro() {
        return 2;
    }

    @Override
    public float dFantasma() {
        return 2;
    }

    @Override
    public float dLucha() {
        return (float)0.5;
    }

    @Override
    public float dPsiquico() {
        return (float)0.5;
    }


    //atac


    @Override
    public float aLucha() {
        return 2;
    }

    @Override
    public float aVeneno() {
        return 2;
    }

    @Override
    public float aAcero() {
        return (float)0.5;
    }

    @Override
    public float aPsiquico() {
        return (float)0.5;
    }

    @Override
    public float aSiniestro() {
        return 0;
    }
}
