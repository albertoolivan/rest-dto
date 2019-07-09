package org.adidas.code.challange.rest.dto;

import java.util.LinkedList;

public class IntineraryDTO {

	private LinkedList<CityDTO> path = new LinkedList<CityDTO>();
	private int sumPathWeight;
	private String message = null;

	public IntineraryDTO() {
	}

	public LinkedList<CityDTO> getPath() {
		return path;
	}

	public void setPath(LinkedList<CityDTO> path) {
		this.path = path;
	}

	public int getSumPathWeight() {
		return sumPathWeight;
	}

	public void setSumPathWeight(int sumPathWeight) {
		this.sumPathWeight = sumPathWeight;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + sumPathWeight;
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
		IntineraryDTO other = (IntineraryDTO) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (sumPathWeight != other.sumPathWeight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IntineraryDTO [path=" + path + ", sumPathWeight=" + sumPathWeight + ", message=" + message + "]";
	}

}
