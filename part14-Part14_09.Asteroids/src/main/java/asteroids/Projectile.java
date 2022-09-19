package asteroids;

import java.util.stream.Stream;
import javafx.scene.shape.Polygon;

/**
 *
 * @author dsa21
 */
public class Projectile extends Character {    
    
    private boolean alive;
    
    public Projectile(int x, int y) {
        super(new Polygon(1, -1, 1, 1, -1, 1, -1, -1), x, y);
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }
    
    public void setAlive(boolean value) {
        this.alive = value;
    }
    
}
