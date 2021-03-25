package com.cg.hbm.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class RoomDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int room_id;
	@ManyToOne(optional = false)
	@JoinColumn(name="Hotel_ID")
	private Hotel hotel_id;
	private String room_no;
	private String room_type;
	private double rate_per_day;
	private boolean isAvailable;
	@JsonIgnore
	private Blob photo;
	public RoomDetails(Hotel hotel_id, String room_no, String room_type, double rate_per_day, boolean isAvailable,
			Blob photo) {
		super();
		this.hotel_id = hotel_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isAvailable;
		this.photo = photo;
	}
	public RoomDetails() {
		super();
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public Hotel getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Hotel hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double getRate_per_day() {
		return rate_per_day;
	}
	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	
	
}
