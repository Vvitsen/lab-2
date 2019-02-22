package ru.avalon.java.ocpjp.labs;

import java.io.File;
import ru.avalon.java.ocpjp.labs.console.ConsoleUI;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.actions.*;

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
    static public final File SOURCE = new File("C:\\temp\\source.txt");
    static public final File DEST = new File("C:\\temp\\dest.txt");
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
                try(FileCopyAction action = new FileCopyAction()){  // чтоб попасть в метод close()
                    action.start();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case move:
                /*
                 * TODO №7 Обработайте команду move
                 */
                try(FileMoveAction action = new FileMoveAction()){  // чтоб попасть в метод close()
                    action.start();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case exit:
                close();
                break;
                /*
                 * TODO №9 Обработайте необработанные команды
                 */
            case create:
                new FileCreateAction().start();
                break;
            case delete:
                new FileDeleteAction().start();
                break;
        }
    }
    
}
