package com.java.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.elevator.Elevator.Status;

public class LiftLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*LiftLogic mains = new LiftLogic();
		int range = 13;
		int flr_num = (int) (Math.random() * range) + 1;
		Elevator x = mains.LiftToGoDown(list, flr_num);
		Elevator y = mains.LiftToGoUp(list, flr_num);*/
	}

	public Elevator LiftToGoDown(List<Elevator> list, int flr_num) {
		int idx = 0;
		list = list.stream()
				.filter(i -> (i.status == Status.DOWN && i.getCurrent_flr() >= flr_num || i.status == Status.IDLE))
				.collect(Collectors.toList());
		/*
		 * IntStream.range(0, list.size() - 1).map(i -> {int distance =
		 * Math.abs(list.get(i).getCurrent_flr() - flr_num); if (distance <
		 * Math.abs(list.get(idx).getCurrent_flr() - flr_num)) idx = i; return
		 * idx; });
		 */

		for (int i = 0; i <= list.size() - 1; i++) {
			int distance = Math.abs(list.get(i).getCurrent_flr() - flr_num);
			if (distance < Math.abs(list.get(idx).getCurrent_flr() - flr_num))
				idx = i;
		}
		Elevator x = list.get(idx);
		return x;
	}

	public Elevator LiftToGoUp(List<Elevator> list, int flr_num) {
		int idx = 0;
		list = list.stream()
				.filter(i -> (i.status == Status.UP && i.getCurrent_flr() <= flr_num || i.status == Status.IDLE))
				.collect(Collectors.toList());
		/*
		 * IntStream.range(0, list.size() - 1).map(i -> {int distance =
		 * Math.abs(list.get(i).getCurrent_flr() - flr_num); if (distance <
		 * Math.abs(list.get(idx).getCurrent_flr() - flr_num)) idx = i; return
		 * idx; });
		 */

		for (int i = 0; i <= list.size() - 1; i++) {
			int distance = Math.abs(list.get(i).getCurrent_flr() - flr_num);
			if (distance < Math.abs(list.get(idx).getCurrent_flr() - flr_num))
				idx = i;
		}
		Elevator x = list.get(idx);
		return x;
	}
}
