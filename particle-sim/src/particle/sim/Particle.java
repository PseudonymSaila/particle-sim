
package particle.sim;

/**
 *
 * @author Pseudonym
 */
public class Particle {
    public double mass, radius;
    public String name;
    
    /**
     *  Instantiates a Particle with a name, mass, and radius.
     * @param n - the name of the particle type.
     * @param m - the nominal mass of the particle type.
     * @param r - the nominal radius of the particle type.
     */
    public Particle(String n, double m, double r) {
        name = n;
        mass = m;
        radius = r;
    }
    
}
