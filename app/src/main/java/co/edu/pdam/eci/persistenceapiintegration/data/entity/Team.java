package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author Santiago Carrillo
 */

//TODO add database annotations and proper model structure

@Entity
public class Team {

    @PrimaryKey private Long id;
    @ColumnInfo (name="name")
    private String name;
    @ColumnInfo (name="short_name")
    private String shortName;

    public Team(){

    }

    public String getName(){
        return this.name;
    }

    public String getShortName(){
        return this.shortName;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setShortName(String sn){
        this.shortName = sn;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }



}
