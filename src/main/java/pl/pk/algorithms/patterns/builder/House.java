package pl.pk.algorithms.patterns.builder;

import java.util.Objects;

public class House {

    private int windows;
    private int doors;
    private int capacity;
    private int rooms;

    private House(int windows, int doors, int capacity, int rooms) {
        this.windows = windows;
        this.doors = doors;
        this.capacity = capacity;
        this.rooms = rooms;
    }

    public static class HouseBuilder {

        private int windows;
        private int doors;
        private int capacity;
        private int rooms;

        public HouseBuilder setWindows(int number) {
            this.windows = number;
            return this;
        }

        public HouseBuilder setDoors(int number) {
            this.doors = number;
            return this;
        }

        public HouseBuilder setCapacity(int number) {
            this.capacity = number;
            return this;
        }

        public HouseBuilder setRooms(int number) {
            this.rooms = rooms;
            return this;
        }

        public House build() {
            return new House(windows, doors, capacity, rooms);
        }
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return getWindows() == house.getWindows() &&
                getDoors() == house.getDoors() &&
                getCapacity() == house.getCapacity() &&
                getRooms() == house.getRooms();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWindows(), getDoors(), getCapacity(), getRooms());
    }
}
