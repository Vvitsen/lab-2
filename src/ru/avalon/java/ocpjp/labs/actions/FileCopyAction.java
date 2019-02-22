package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import static ru.avalon.java.ocpjp.labs.Main.*;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            synchronized(SOURCE){
            Files.copy(SOURCE.toPath(), DEST.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (FileAlreadyExistsException ee){
            System.out.println("already exist " + ee.getMessage());
        } catch (IOException ex) {
            System.out.println("i/o error " + ex.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
//        throw new UnsupportedOperationException("Not implemented yet!");
        System.out.println("nothing to close");
        
    }
}
