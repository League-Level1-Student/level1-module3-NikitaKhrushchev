package _01_intro_to_static;

import java.util.Iterator;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete[] aList = new Athlete[2]; 
    	for (int i = 0; i < 2; i++) {
			aList[i] = new Athlete("1",1);
			aList[i].bibNumber = i;
		}
    	for (int i = 0; i < aList.length; i++) {
    		System.out.println(aList[i].name);
    		System.out.println(aList[i].bibNumber);
    		System.out.println(aList[i].raceLocation);
		}
        //print their names, bibNumbers, and the location of their race. 
    }
}