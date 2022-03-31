package DesignPatterns.CreationalPatterns.BuilderMethod;

import java.time.LocalDateTime;

class Vehicle {

    private String engine;
    private int wheel;
    private int airbags;

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getAirbags() {
        return this.airbags;
    }

    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;

        private int airbags;

        public VehicleBuilder(){

        }

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public VehicleBuilder setWheels(int wheel) {
            this.wheel = wheel;
            return this;
        }

        public VehicleBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}

class BuilderPatternExample {

    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        Vehicle car2 = new Vehicle.VehicleBuilder().setAirbags(4).setEngine("6000cc").build();
        Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

        System.out.println(car2.getEngine());
        System.out.println(car2.getWheel());
        System.out.println(car2.getAirbags());

        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.of(2022,2,2,2,2);
        System.out.println(date.plusDays(1));
        System.out.println(date.isAfter(date2));
    }
}
