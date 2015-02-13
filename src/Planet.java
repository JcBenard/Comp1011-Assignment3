/**
 * 
 */

/**
 * @author Jc
 * program description: create an abstract class to be the template for all planet like classes
 */
public abstract class Planet {
	
	//instance variables////////////////////////////////////////////////
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	//properties get///////////////////////////////////////////////////////
	public double getDiameter() {
		return _diameter;
	}

	public double getMass() {
		return _mass;
	}

	public int getMoonCount() {
		return _moonCount;
	}
	
	public String getName() {
		return _name;
	}

	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}
	
	public int getRingCount() {
		return _ringCount;
	}
	
	public double getRotationPeriod() {
		return _rotationPeriod;
	}
	//properties set////////////////////////////////////////////////////////////////
	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	
	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	
	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	//constructor////////////////////////////////////////////////////////////////////
	public Planet(String name, double diameter, double mass){
		
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;	
	}
	
	//overridden methods////////////////////////////////////////////////////////////
	@Override
	public String toString(){
		return "Planet name: " + this._name + "\nPlanet diameter: " + this._diameter + "\nPlanet mass: " +this._mass;
	}
}
