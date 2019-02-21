package ru.avalon.java.ocpjp.labs;

import java.io.File;
import ru.avalon.java.ocpjp.labs.console.ConsoleUI;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.actions.FileCopyAction;
import ru.avalon.java.ocpjp.labs.actions.FileMoveAction;

/**
 * Лабораторная работа №2
 * <p>
 * Курс: "DEV-OCPJP. Подготовка к сдаче
 * сертификационных экзаменов серии Oracle Certified
 * Professional Java Programmer"
 * <p>
 * Тема: "Потоки исполнения (Threads) и многозадачность" 
 *
 * @author Daniel Alpatov <danial.alpatov@gmail.com>
 */
public class Main extends ConsoleUI<Commands> {
    /*
    Поскольку нет никаких условий о том, как задавать файлы, то пусть они будут статическими.
    */
    static public final File source = new File("C:\\temp\\source.txt");
    static public final File dest = new File("C:\\temp\\dest.txt");
    /**
     * Точка входа в приложение.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        new Main().run();
    }
    /**
     * Конструктор класса.
     * <p>
     * Инициализирует экземпляр базового типа с использоавнием
     * перечисления {@link Commands}.
     */
    Main() {
        super(Commands.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCommand(Commands command) throws IOException {
        switch (command) {
            case copy:
                /*
                 * TODO №6 Обработайте команду copy
                 */
                new FileCopyAction().start();
                break;
            case move:
                /*
                 * TODO №7 Обработайте команду move
                 */
                new FileMoveAction().start();
                break;
            case exit:
                close();
                break;
                /*
                 * TODO №9 Обработайте необработанные команды
                 */
        }
    }
    
}
