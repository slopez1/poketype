package com.sergiproductions.poketype;

import com.sergiproductions.poketype.Types.Nothing;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Created by Sergi on 16/08/2016.
 */
public class ServiceInfo {
    private BridgeTable bridge;
    public TableType table;
    public ServiceInfo() {
        this.bridge = new BridgeTable();
    }

    public void setTable(String s){
        try {
            table = bridge.getTable(s);
        }catch (NoSuchElementException e){
            table = new Nothing().table;
        }
    }
    public void setTable(String s1, String s2){
        try {
            table = bridge.getTable(s1,s2);
        }catch (NoSuchElementException e){
            table = new Nothing().getTable();
        }
    }

    public Set<String> getSSDef(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getDefensa()>2)result.add(t.getType());
        }
        return result;
    }

    public Set<String> getSDef(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getDefensa()>1 && t.getDefensa() <4)result.add(t.getType());
        }
        return result;
    }
    public Set<String> getLDef(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getDefensa()  < 1 && t.getDefensa() > 0)result.add(t.getType());
        }
        return result;
    }
    public Set<String> get0Def(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getDefensa() < 0.4)result.add(t.getType());
        }
        return result;
    }






    public Set<String> getSSAtt(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getAtaque()>2)result.add(t.getType());
        }
        return result;
    }

    public Set<String> getSAtt(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getAtaque()>1 && t.getAtaque() <4)result.add(t.getType());
        }
        return result;
    }
    public Set<String> getLAtt(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getAtaque()  < 1 && t.getAtaque() > 0)result.add(t.getType());
        }
        return result;
    }
    public Set<String> get0Att(){
        Set<String> result = new HashSet<>();
        for (TableTypeRow t:table) {
            if(t.getAtaque() == 0)result.add(t.getType());
        }
        return result;
    }








}
