package org.adidas.code.challange.rest.dto;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class IntineraryDTO {

	private LinkedList<CityDTO> path = new LinkedList<CityDTO>();
	private int sumPathWeight;
	private String message = null;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private String durationTime;

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

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDurationTime() {
		return durationTime;
	}

	public void setDurationTime(String durationTime) {
		this.durationTime = durationTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((durationTime == null) ? 0 : durationTime.hashCode());
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
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (durationTime == null) {
			if (other.durationTime != null)
				return false;
		} else if (!durationTime.equals(other.durationTime))
			return false;
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
		return "IntineraryDTO [path=" + path + ", sumPathWeight=" + sumPathWeight + ", message=" + message
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", durationTime=" + durationTime
				+ "]";
	}

}
