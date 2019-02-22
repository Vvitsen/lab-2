/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.actions;

import java.io.IOException;
import java.nio.file.Files;
import static ru.avalon.java.ocpjp.labs.Main.*;

/**
 *
 * @author Victor.Malmygin
 */
public class FileDeleteAction implements Action{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            synchronized(SOURCE){
            Files.delete(SOURCE.toPath());
            }
        } catch (IOException ex) {
            System.out.println("i/o error " + ex.getMessage());
        }
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
