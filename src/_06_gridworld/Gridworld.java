package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
static Random ra = new Random();
public static int w = ra.nextInt(10);
public static int s = ra.nextInt(10);
public static int w2 = ra.nextInt(10);
public static int s2 = ra.nextInt(10);
public static Flower[] flist = new Flower[100];
public static int[] la = new int[10];
public static int[] al = new int[10];
public static void main(String[] args) {
	World world = new World();
	Bug a = new Bug();
	Location lo = new Location(w,s);
	Bug a2 = new Bug();
	Location lo2 = new Location(w2,s2);
	world.show();
	//a2.setColor("blue");
	a2.setColor(Color.BLUE);
	world.add(lo, a);
	world.add(lo2, a2);
	a2.turn();
	a2.turn();
	for (int v = 0; v < 100; v++) {
		String sa = "flower"+v;
		flist[v] = new Flower();
	}
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			Location s = new Location(i,j);
			world.add(s, flist[i*10 + j]);
		}
		
	}
	a.canMove();
}
public World<?> world = new World<Object>();


public void show() {
}
public void add(Location loc,Actor occcupant) {
	
}
}

