package be.axo.javafx;

import be.axo.javafx.gui.Gui;
import javafx.application.Application;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;

@Manifest(name = "JavaFX Test", authors = {"Axo"}, description = "JavaFX Test", version = 1.0)
public class JavaFxTest extends PollingScript {
    @Override
    public void start() {
        log.info("starting");
        Application.launch(Gui.class, (String[]) null);
    }

    @Override
    public int poll() {
        log.info("blah");

        return 1000;
    }
}
