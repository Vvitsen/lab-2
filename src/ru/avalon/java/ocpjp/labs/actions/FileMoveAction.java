package ru.avalon.java.ocpjp.labs.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import static ru.avalon.java.ocpjp.labs.Main.*;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
//        throw new UnsupportedOperationException("Not implemented yet!");
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            synchronized(SOURCE){
            Files.move(SOURCE.toPath(), DEST.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
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
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
//        throw new UnsupportedOperationException("Not implemented yet!");
        System.out.println("nothing to close");
    }

}
