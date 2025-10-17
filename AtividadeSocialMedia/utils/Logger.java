package utils;

import java.time.LocalDateTime;

public class Logger {
    public static synchronized void log(String msg) {
        System.out.println(LocalDateTime.now() + " - " + msg);
    }
}
