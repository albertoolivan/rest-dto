package org.adidas.code.challange.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class CityDTO {

	private String id;

	private String name;

	private List<CityDistanceDTO> distanceList = new ArrayList<>();

	public CityDTO() {
	}
	
	public CityDTO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CityDTO(String id, String name, List<CityDistanceDTO> distanceList) {
		this.id = id;
		this.name = name;
		this.distanceList = distanceList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CityDistanceDTO> getDistanceList() {
		return distanceList;
	}

	public void setDistanceList(List<CityDistanceDTO> distanceList) {
		this.distanceList = distanceList;
	}

	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", name=" + name + ", distanceList=" + distanceList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CityDTO other = (CityDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
