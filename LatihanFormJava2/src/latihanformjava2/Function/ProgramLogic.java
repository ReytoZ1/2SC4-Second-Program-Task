/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Function;

import latihanformjava2.Model.ModelProgram;

/**
 *
 * @author denan
 */
public class ProgramLogic {
    ModelProgram modelProgram = new ModelProgram();
    public String label;
    
    public String result(String name, String born_date, String mental, String gender){
        
        String noun = modelProgram.returnGenderNoun(gender);
        String mental_status = modelProgram.returnMental (mental);
        
        return " The name is " + name + " \nwas bron at "+born_date + ".\n" + noun + " is currently "+mental_status;
    }
    public String result(String name){
        return " The name is " + name + ".";
    }
    public String result(String name, String mental){
        String mental_status = modelProgram.returnMental(mental);
        
        return " The name is " + name + " \nis currently " + mental_status + ".";
    }
}
