package org.adidas.code.challange.rest.dto;

import java.time.LocalDateTime;

public class ArrivalTimeDTO {

	private LocalDateTime arrivalTime = null;
	// string HH:mm
	private String durationTime = null;

	public ArrivalTimeDTO() {
	}
	public ArrivalTimeDTO(LocalDateTime arrivalTime, String durationTime) {
		this.arrivalTime = arrivalTime;
		this.durationTime = durationTime;
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
	public String toString() {
		return "ArrivalTimeDTO [arrivalTime=" + arrivalTime + ", durationTime=" + durationTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((durationTime == null) ? 0 : durationTime.hashCode());
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
		ArrivalTimeDTO other = (ArrivalTimeDTO) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (durationTime == null) {
			if (other.durationTime != null)
				return false;
		} else if (!durationTime.equals(other.durationTime))
			return false;
		return true;
	}

}
