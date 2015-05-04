/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author BONGANI
 */
@Embeddable
public class Demography implements Serializable{
    
    private String gender;
    private String race;

    // empty Contructor
    private Demography()
    {
      
    }
    
    public Demography(Builder builder)
    {
       gender=builder.gender;
       race=builder.race;
    
    }
    
    public static class Builder{
    
    private String gender;
    private String race;
    
    
    public Builder (String gender)
    {
       this.gender = gender;
     }
    
    public Builder race(String race)
    {
        
        this.race=race;
        return this;
        
    }
    
    public Builder copy( Demography value)
    {
       this.gender=value.gender;
       this.race=value.race;
       return this;
    }
    public Demography build()
    {
         return new Demography(this);
    }
    
   }
    
    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
