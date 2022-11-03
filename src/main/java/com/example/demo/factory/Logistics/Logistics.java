package com.example.demo.factory.Logistics;

/**
 * Logistics
 */
public abstract class Logistics {
    public void planLogistics() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}