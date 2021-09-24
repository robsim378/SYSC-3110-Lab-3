public enum Direction {
    NORTH("north"), SOUTH("south"), EAST("east"), WEST("west"), UP("up"), DOWN("down");

    String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Direction getEnum(String value) {
        return Direction.valueOf(value.toUpperCase());
    }
}
