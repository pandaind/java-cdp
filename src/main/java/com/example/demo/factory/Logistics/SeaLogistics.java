package com.example.demo.factory.Logistics;


/**
 * SeaLogistics
 */
public class SeaLogistics extends Logistics{

        @Override
        public Transport createTransport() {
            return new Ship();
        }
}