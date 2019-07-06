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
	public String toString() {
		return "IntineraryDTO [path=" + path + ", sumPathWeight=" + sumPathWeight + ", message=" + message + "]";
	}

}
