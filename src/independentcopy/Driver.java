package independentcopy;

import independentcopy.reader.*;
import independentcopy.writer.*;

/**
 * @author Jim Lombardo, WCTC Lead Java Instructor
 * @version 1.02
 * @see Driver for run instructions and info about design rules
 * @see DependentCopy project for a poor design
 */
public class Driver {

    public static void main(String[] args) {
        /*
         Comment/uncomment various combinations of Reader
         and Writer classes to see how switching objects
         causes no problems with Copier class because it's
         polymorphic!!!
         */

//        Reader reader = new KeyboardReader();
//        Reader reader = new FileReader();
//
//        Writer writer = new ConsoleWriter();
//        //Writer writer = new GuiWriter();
//        //Writer writer = new FileWriter();
//
//        /*
//        Copy from reader to writer
//        Notice that Copier is NOT dependent on implementation of reader/writer
//        (it is not rigid, fragile or immobile)
//         */
//        Copier copier = new Copier(reader, writer);
        //copier.copy();
       
        //Here we're creating a new ListReader
        ListReader listR = new ListReader();
        
        //telling the system to print out the List Reader and the end of the program message
        System.out.println(listR.readln());       // Send end of program message
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
}
