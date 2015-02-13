/**
 * 
 */

/**
 * @author Jc
 * @version 6 : Finished Tester, program seems to work as intended
 * Program description test GiantPlanet and TerrestrialPlanet classes and there assocated methods
 */
public class Tester {

	public static void main(String[] args) {
		
		GiantPlanet giantPlanet = new GiantPlanet("Jupiter", 11.209, 317.8, "Gas");
		System.out.println(giantPlanet.toString());
		
		TerrestrialPlanet terrestrialPlanet = new TerrestrialPlanet("Mercury", 0.382, 0.06, false);
		System.out.println(terrestrialPlanet.toString());

	}

}
