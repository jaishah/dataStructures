package com.java.elevator;

public class Elevator {
private int current_flr;
private String name;
public enum Status{UP,DOWN,IDLE,MAINTAINANCE};
public Status status;
public int getCurrent_flr() {
	return current_flr;
}
public Status getStats() {
	return status;
}
public void setStats(Status stats) {
	this.status = stats;
}
public void setCurrent_flr(int current_flr) {
	this.current_flr = current_flr;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
};
}
