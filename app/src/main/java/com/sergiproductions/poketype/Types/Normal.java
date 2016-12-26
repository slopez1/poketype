package com.sergiproductions.poketype.Types;

import android.graphics.Color;

import com.sergiproductions.poketype.Type;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Normal extends AbstractType{

    public Normal(){
        super("Normal",Color.LTGRAY);
    }
    //Defff
    @Override
    public float dLucha(){
        return 2;
    }
    @Override
    public float dFantasma(){
        return 0;
    }

    //Atac
    @Override
    public float aRoca(){
        return (float)0.5;
    }
    @Override
    public float aFantasma(){
        return 0;
    }
    @Override
    public float aAcero(){
        return (float)0.5;
    }

}
