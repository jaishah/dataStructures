package com.java.junits;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.java.elevator.Elevator;
import com.java.elevator.LiftLogic;
import com.java.elevator.LiftLogic.Status;

public class ElevatorTest {
public LiftLogic mains = new LiftLogic();
int flr_num;
ArrayList<Elevator> list = new ArrayList<Elevator>();
	@Before
	public void setUp() throws Exception {
		Elevator x1 = new Elevator();
		Elevator x2 = new Elevator();
		Elevator x3 = new Elevator();
		Elevator x4 = new Elevator();
		Elevator x5 = new Elevator();
		Elevator x6 = new Elevator();
		Elevator x7 = new Elevator();
		Elevator x8 = new Elevator();
		x1.setCurrent_flr(5);
		x1.setStats(Status.DOWN);
		x2.setCurrent_flr(4);
		x2.setStats(Status.IDLE);
		x3.setCurrent_flr(9);
		x3.setStats(Status.DOWN);
		x4.setStats(Status.MAINTAINANCE);
		x4.setCurrent_flr(10);
		x5.setCurrent_flr(1);
		x5.setStats(Status.UP);
		x6.setCurrent_flr(6);
		x6.setStats(Status.IDLE);
		x7.setCurrent_flr(9);
		x7.setStats(Status.UP);
		x8.setStats(Status.DOWN);
		x8.setCurrent_flr(12);
		
		list.add(x1);
		list.add(x2);
		list.add(x3);
		list.add(x4);
		list.add(x5);
		list.add(x6);
		list.add(x7);
		list.add(x8);
	}

	@Test
	public void testElevatorCallUp() {
		flr_num = 3;//(int) (Math.random() * range) + 1;
System.out.println("Elevator call on floor "+flr_num+ " to go up.");
Elevator bestFit = mains.LiftToGoUp(list, flr_num);		
assertEquals(list.get(1).getCurrent_flr(),bestFit.getCurrent_flr());	
//fail("Not yet implemented");
	}
	@Test
	public void testElevatorCallDown() {
		flr_num = 11;//(int) (Math.random() * range) + 1;
		System.out.println("Elevator call on floor "+flr_num+ " to go down.");
		Elevator bestFit = mains.LiftToGoDown(list, flr_num);
		assertEquals(list.get(7).getCurrent_flr(),bestFit.getCurrent_flr());
		//fail("Not yet implemented");
	}
}
