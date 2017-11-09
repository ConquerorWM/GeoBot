/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geobot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
        
public class GeoBot {
    
    
    
    public ArrayList<GeoObject> objects = new ArrayList<>();
    public HashSet<GeoStatement> statements = new HashSet<>();
    
    public void addStatement(GeoStatement s){
        statements.add(s);
    }
    
    public void addObject(GeoObject o){
        objects.add(o);
    }
    
    public void applyProperties(){
        for(GeoStatement s : statements){
            s.process(this);
        }
    }

    
    public static void main(String[] args) {
        
        System.out.println("Input your problem");
	Scanner input = new Scanner(System.in);
	String in = input.nextLine();
	String[] procArray = new String[in.length()];
	procArray = in.split(" ");
	List<String> inputList = Arrays.asList(procArray);
	System.out.println(inputList);
            
        GeoStatement Given = new GeoStatement("Given", null);
        GeoStatement[] givenarray = new GeoStatement[]{Given};

        
        Point A = new Point("A");
        Point B = new Point("B");
        Point C = new Point("C");
        
        Line AC = new Line(A, C);
        
        Midpoint mid = new Midpoint(B, AC, givenarray);
        
        
        
        }
        
        }
        
    }
    

    
