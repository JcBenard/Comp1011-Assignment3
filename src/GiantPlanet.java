/**
 * 
 */

/**
 * @author Jc
 * program description: Creates a GiantPlanet object when called extends from the Planet class and uses the IHasRings and IHasMoons interfaces
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	//instanced variables///////////////////////////////////////////////////////////
	private String _type;
	
	//properties//////////////////////////////////////////////////////////////////
	public String getType() {
		return this._type;
	}

	//constructor////////////////////////////////////////////////////////////////////
	public GiantPlanet(String name, double diameter, double mass, String type) {
		
		super(name, diameter, mass);
		this._type = type;
	}

	//overridden methods////////////////////////////////////////////////////////////
	@Override
	public Boolean HasRings() {
		return (getRingCount() > 0) ? true : false;
	}

	@Override
	public Boolean HasMoons() {
		return (getMoonCount() > 0) ? true : false;
	}
}
