package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    public void setUp(){
        manager.registerApp(".html", "App1");
        manager.registerApp(".jpg", "App2");
        manager.registerApp(".doc", "App3");
        manager.registerApp(".mp3", "App4");
        manager.registerApp(".rtf", "App3");
    }

    @Test
    void shouldGetNameApp(){
        assertEquals("App2", manager.getNameApp(".jpg"));
    }

    @Test
    void shouldDeleteApp(){
        manager.deleteApp(".mp3");
        assertArrayEquals(Arrays.asList( "App3", "App2", "App1").toArray(), manager.findAllApps().toArray());
    }

    @Test
    void shouldFindAllExtensions(){
        assertArrayEquals(Arrays.asList(".html", ".rtf", ".mp3", ".jpg", ".doc").toArray(), manager.findAllFileNameExtensions().toArray());
    }

    @Test
    void shouldFindAllApps() {
        assertArrayEquals(Arrays.asList("App4", "App3", "App2", "App1").toArray(), manager.findAllApps().toArray());
    }
}
