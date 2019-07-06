package org.adidas.code.challange.rest.dto;

public class CityDistanceDTO {

	private String id;

	private String cityOriginId = null;
	private String cityOriginName = null;

	private String cityDestinationId = null;
	private String cityDestinationName = null;

	private int distanceKm;

	public CityDistanceDTO() {
	}

	public CityDistanceDTO(String id, String cityOriginId, String cityOriginName, String cityDestinationId,
			String cityDestinationName, int distanceKm) {
		this.id = id;
		this.cityOriginId = cityOriginId;
		this.cityOriginName = cityOriginName;
		this.cityDestinationId = cityDestinationId;
		this.cityDestinationName = cityDestinationName;
		this.distanceKm = distanceKm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityOriginId() {
		return cityOriginId;
	}

	public void setCityOriginId(String cityOriginId) {
		this.cityOriginId = cityOriginId;
	}

	public String getCityOriginName() {
		return cityOriginName;
	}

	public void setCityOriginName(String cityOriginName) {
		this.cityOriginName = cityOriginName;
	}

	public String getCityDestinationId() {
		return cityDestinationId;
	}

	public void setCityDestinationId(String cityDestinationId) {
		this.cityDestinationId = cityDestinationId;
	}

	public String getCityDestinationName() {
		return cityDestinationName;
	}

	public void setCityDestinationName(String cityDestinationName) {
		this.cityDestinationName = cityDestinationName;
	}

	public int getDistanceKm() {
		return distanceKm;
	}

	public void setDistanceKm(int distanceKm) {
		this.distanceKm = distanceKm;
	}

	@Override
	public String toString() {
		return "CityDistanceDTO [id=" + id + ", cityOriginId=" + cityOriginId + ", cityOriginName=" + cityOriginName
				+ ", cityDestinationId=" + cityDestinationId + ", cityDestinationName=" + cityDestinationName
				+ ", distanceKm=" + distanceKm + "]";
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
		CityDistanceDTO other = (CityDistanceDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
