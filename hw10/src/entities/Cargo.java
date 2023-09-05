package entities;

import java.util.*;
import java.io.*;

public class Cargo {
    private final String destination;
    private final int quantity;
    private final String type;

    public Cargo(String destination, int quantity, String type) {
        this.destination = destination;
        this.quantity = quantity;
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}

