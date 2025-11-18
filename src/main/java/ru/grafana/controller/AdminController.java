package ru.grafana.controller;


import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

//@Slf4j
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping("/overload")
    public void overloadApp() {
        System.out.println("Attempting to allocate a large amount of memory...");
        List<byte[]> list = new ArrayList<>();
        try {
            while (true) {
                // Allocate 1 MB byte arrays repeatedly
                list.add(new byte[1024 * 1024]);
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Caught OutOfMemoryError: " + e.getMessage());
            System.err.println("The application ran out of heap space.");
        }
        System.out.println("Application finished."); // This line might not be reached
    }

}
