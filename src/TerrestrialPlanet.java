/**
 * @author Jc
 * program description: Creates a TerrestrialPlanet object when called extends from the Planet class and uses the IHasRings and IHabitable interfaces
 */
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	//instanced variables////////////////////////////////////////////////////////////////
	private Boolean _oxygen;	

	//properties///////////////////////////////////////////////////////////////////////
	public Boolean get_oxygen() {
		return this._oxygen;
	}
	
	//constructor///////////////////////////////////////////////////////////////////////
	public TerrestrialPlanet(String name, double diameter, double mass, Boolean oxygen) {
		
		super(name, diameter, mass);
		this._oxygen = oxygen;
	}

	//Overridden methods//////////////////////////////////////////////////////////////////
	@Override
	public Boolean Habitable() {
		return(this._oxygen) ? true : false;
	}

	@Override
	public Boolean HasMoons() {
		return (getMoonCount() > 0) ? true : false;
	}
}
