package lviv.lgs.ua;

import java.io.Serializable;

public class Town extends Settlement implements Serializable {
	
	public String name;
	public int inhabitants;
	public double area;
	public String otherName = "La-La-Lend";
	
	public Town() {};
	
	public Town(String name, int inhabitants, double area, String otherName) {
		super();
		this.name = name;
		this.inhabitants = inhabitants;
		this.area = area;
		this.otherName = otherName;
	}

	public Town(String name, int inhabitants) {
		super();
		this.name = name;
		this.inhabitants = inhabitants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + inhabitants;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((otherName == null) ? 0 : otherName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (inhabitants != other.inhabitants)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (otherName == null) {
			if (other.otherName != null)
				return false;
		} else if (!otherName.equals(other.otherName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Town [name=" + name + ", inhabitants=" + inhabitants + ", area=" + area + " (square kilometers)" + ", otherName=" + otherName
				+ "]";
	}
	
	

}
