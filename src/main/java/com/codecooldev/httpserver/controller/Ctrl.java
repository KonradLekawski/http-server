package com.codecooldev.httpserver.controller;

import com.codecooldev.httpserver.baseclasses.ApplicationException;
import com.codecooldev.httpserver.services.Greeter;
import org.springframework.stereotype.Controller;

@Controller
public class Ctrl {
    private Greeter greeter;

    public Ctrl(Greeter greeter) {
        this.greeter = greeter;
    }

    public void start(String[] args) throws ApplicationException {
        this.greeter.greet();
    }
}
