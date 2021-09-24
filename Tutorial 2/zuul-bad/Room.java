import java.util.HashMap;
import java.util.Map;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    public String description;

    private Map<Direction, Room> exits;

    public Room getExit(String stringDirection) {
        Direction enumDirection = Direction.getEnum(stringDirection);
        return exits.get(enumDirection);
    }

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    public void setExit(Direction direction, Room room) {
        exits.put(direction, room);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public void printLongDescription() {
        System.out.println("You are " + this.getDescription());
        System.out.print("Exits: ");
        for (Direction direction: exits.keySet()) {
            System.out.print(direction.getName() + " ");
        }
        System.out.println();
    }

}
