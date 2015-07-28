package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EulerProblem011 {
	static File file = new File("./datafiles/problem11.txt");
	static int output = 0;
	static int xAxis = 1;
	static int yAxis = 1;
	static HashMap<String, Integer> dataSet = new HashMap<String, Integer>();
	static String[] coordArray = new String[4];
					
	public static int answer(){
		mapBuild();
		xAxis = 1;
		yAxis = 1;
		
		while ( xAxis <= 20 && yAxis <= 20 ){
			for(int i = 1; i<=4; i++){
				if (dirCriteria(direction(i),xAxis,yAxis)){
					if ((multiplyValues(coordinates((direction(i)), xAxis, yAxis)))> output){
						output = (multiplyValues(coordinates((direction(i)), xAxis, yAxis)));
					}
				}
			}
			if(xAxis==20){
				yAxis++;
				xAxis=1;
			}else{
				xAxis++;
			}
		}
		
		return output;
	}
	
	private static boolean dirCriteria(String dir, int x, int y){
		if (dir=="N" && y<=17){
			return true;
		}else if(dir=="NE" && x<=17 && y<=17){
			return true;
		}else if(dir == "E" && x<=17){
			return true;
		}else if(dir == "SE" && x<=17 && y>=4){
			return true;
		}
		return false;
	}
	
	private static String direction(int compass){
		String dirString = null;
		switch (compass){
		case 1:	dirString = "N";	break;
		case 2:	dirString = "NE";	break;
		case 3:	dirString = "E";	break;
		case 4:	dirString = "SE";	break;
		}
		return dirString;
	}
	
	
	private static String[] coordinates(String dir, int x, int y){
		int changeX = 0;
		int changeY = 0;
		if (dir == "N"){
			changeY = 1;
		}else if(dir == "NE"){
			changeX = 1;
			changeY = 1;
		}else if(dir == "E"){
			changeX = 1;
		}else if(dir == "SE"){
			changeX = 1;
			changeY = -1;
		}
		for(int i=0; i<coordArray.length; i++){
			coordArray[i] = ((x+((i)*changeX))+","+(y+((i)*changeY)));
		}	
		return coordArray;
	}

	private static int multiplyValues(String[] coord){
		return ((dataSet.get((coord[0])))*(dataSet.get((coord[1])))*(dataSet.get((coord[2])))*(dataSet.get((coord[3]))));
	}
	
	private static void mapBuild(){
		yAxis = 20;
		xAxis = 1;
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {}
		
		while (scan.hasNextInt()){
			dataSet.put(new String(xAxis+","+yAxis),new Integer(scan.nextInt()));
			if(xAxis==20){
				yAxis--;
				xAxis=1;
			}else{
				xAxis++;
			}
		}
	}
		
}