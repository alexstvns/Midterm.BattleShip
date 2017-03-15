/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



/**
 *
 * @author gstev
 */
public class Ship
{
	private String shipName;
	private int[] shipPieces; 
        
	char Direction;
        private int Index=0;
        
        private Image[] vShip;
        private Image[] hShip;
       
        
	Ship(String name, int[] pieces,char Direction)
	{
		this.Direction = Direction;
		this.shipName = name;
              
		shipPieces = new int[pieces.length];
		for(int i = 0; i < pieces.length; i++)
                {
			shipPieces[i] = pieces[i];
                }
               
                
	}
	public String getName()
	{
		return this.shipName;
	}
	public int[] getShipPieces()
	{
		return shipPieces;
	}
	public int getDirection()
	{
		return this.Direction;
	}
	public int length()
	{
		return shipPieces.length;
	}
        
  

}
class Frigate extends Ship{
    
    public Frigate(String name, int[] pieces, char Direction) {
        super(name, pieces, Direction);
    }
    
    
    
}

class BattShip extends Ship{
    
    public BattShip(String name, int[] pieces, char Direction) {
        super(name, pieces, Direction);
    }
    
    
}
class MineSweep extends Ship{
    
    public MineSweep(String name, int[] pieces, char Direction) {
        super(name, pieces, Direction);
    }
    
    
}

class Cruiser extends Ship{
    
    public Cruiser(String name, int[] pieces, char Direction) {
        super(name, pieces, Direction);
    }
    
    
}
