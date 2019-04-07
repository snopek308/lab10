/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asnopek
 */
//inhertiance to implement the Reader
public class ListReader implements Reader {
    
    //creation of a new arraylist
    List<String> stringArr;
    
    @Override
    public String readln() {
        
        //adding items to the arraylist
        String strResult = "";
        stringArr = new ArrayList<String>();
        //banana for Sam
        stringArr.add("banana");        
        stringArr.add("orange");
        stringArr.add("car");        
        stringArr.add("bike");        
        stringArr.add("xylophone");

        //translates each index item to its' own property.
        //aka shorthand loop
        for (Object stringArr1 : stringArr) {
            strResult += stringArr1 + " ";
        }
        
        return strResult;
    }
    
}
