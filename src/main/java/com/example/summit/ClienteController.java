package com.example.summit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ClienteController {

    @GetMapping
    public String getCliente() throws UnknownHostException {
        return "Hello Cliente Summit From: " +  InetAddress.getLocalHost().getHostAddress();
    }
}
