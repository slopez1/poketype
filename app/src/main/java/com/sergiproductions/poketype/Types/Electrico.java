package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Electrico extends AbstractType {
    public Electrico() {
        super("Electrico", Color.rgb(255,255,0));
    }

    @Override
    public float dVolador() {
        return (float)0.5;
    }

    @Override
    public float dTierra() {
        return 2;
    }

    @Override
    public float dAcero() {
        return (float)0.5;
    }

    @Override
    public float dElectrico() {
        return (float)0.5;
    }


    @Override
    public float aVolador() {
        return 2;
    }

    @Override
    public float aAgua() {
        return 2;
    }

    @Override
    public float aTierra() {
        return 0;
    }

    @Override
    public float aPlanta() {
        return (float)0.5;
    }

    @Override
    public float aElectrico() {
        return (float)0.5;
    }

    @Override
    public float aDragon() {
        return (float)0.5;
    }
}
