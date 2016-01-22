package samples.maze;

import java.util.ArrayList;

/**
 * Created by Nikita Shkaruba on 20.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */
public class Room implements MapSite {
    private ArrayList<MapSite> sites;
    private int id;

    public Room(int id) {
        this.id = id;
    }

    public void setSide(Direction direction, MapSite mapSite) {

    }
    public MapSite getSide(Direction direction) {
        return null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void enter() {

    }
    public Room clone() {
        Room clone = new Room(id);

        for(MapSite site: sites)
            clone.sites.add(site);

        return clone;
    }
}
