package com.refactor.mini_project;

public class Rental {
	// 影片
	private Movie _movie;
	// 租期
	private int _daysRented; 

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}
}

