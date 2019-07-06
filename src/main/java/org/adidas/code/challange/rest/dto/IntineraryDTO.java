package org.adidas.code.challange.rest.dto;

import java.util.LinkedList;

public class IntineraryDTO {

	private LinkedList<CityDTO> path = new LinkedList<CityDTO>();
	private int sumPathWeight;

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

	@Override
	public String toString() {
		return "IntineraryDTO [path=" + path + ", sumPathWeight=" + sumPathWeight + "]";
	}

}
