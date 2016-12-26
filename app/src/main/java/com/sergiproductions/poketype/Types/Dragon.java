package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Dragon extends AbstractType {
    public Dragon() {
        super("Dragon", Color.rgb(0,64,128));
    }

    @Override
    public float dHielo() {
        return 2;
    }

    @Override
    public float dDragon() {
        return 2;
    }

    @Override
    public float dHada() {
        return 2;
    }

    @Override
    public float dFuego() {
        return (float)0.5;
    }

    @Override
    public float dAgua() {
        return (float)0.5;
    }

    @Override
    public float dPlanta() {
        return (float)0.5;
    }

    @Override
    public float dElectrico() {
        return (float)0.5;
    }

    @Override
    public float aDragon() {
        return 2;
    }

    @Override
    public float aHada() {
        return 0;
    }

    @Override
    public float aAcero() {
        return (float)0.5;
    }
}
