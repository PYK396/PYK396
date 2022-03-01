import java.util.*;
import java.awt.*;

public class Husky extends Critter {
      private int move;   
//Here we'll build a constructor that will allow the charcters in this segement to be identified
      public Color getColor(){
         return Color.YELLOW; 
      } 
//toString allows us to manpulate the movement of the charcters     
      public String toString(){
         if(move % 24 < 4){
             return "P";
         }else if(move % 24 < 8){
             return "Y";
         }else{
             return "K";
         }
     }
//Here we'll be instructing the charcters how to interact with other charcters that have been extended in to the program         
      public Action getMove(CritterInfo info){
         move++;
         if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
         }else if(info.getFront() == Neighbor.EMPTY){
            return Action.RIGHT;
         }else{
            return Action.LEFT;
         }
      }
}

//NEW Extension

import java.util.*;
import java.awt.*;

public class Husky extends Critter {
      private int move;   
//Here we'll build a constructor that will allow the charcters in this segement to be identified
      public Color getColor(){
         return Color.YELLOW; 
      } 
//toString allows us to manpulate the movement of the charcters     
      public String toString(){
         if(move % 24 < 4){
             return "P";
         }else if(move % 24 < 8){
             return "Y";
         }else{
             return "K";
         }
     }
//Here we'll be instructing the charcters how to interact with other charcters that have been extended in to the program         
      public Action getMove(CritterInfo info){
         move++;
         if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
         }else if(info.getFront() == Neighbor.EMPTY){
            return Action.RIGHT;
         }else{
            return Action.LEFT;
         }
      }
}

//NEW Extension

import java.util.*;
import java.awt.*;

public class Husky extends Critter {
      private int move;   
//Here we'll build a constructor that will allow the charcters in this segement to be identified
      public Color getColor(){
         return Color.YELLOW; 
      } 
//toString allows us to manpulate the movement of the charcters     
      public String toString(){
         if(move % 24 < 4){
             return "P";
         }else if(move % 24 < 8){
             return "Y";
         }else{
             return "K";
         }
     }
//Here we'll be instructing the charcters how to interact with other charcters that have been extended in to the program         
      public Action getMove(CritterInfo info){
         move++;
         if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
         }else if(info.getFront() == Neighbor.EMPTY){
            return Action.RIGHT;
         }else{
            return Action.LEFT;
         }
      }
}

//NEW Extension

import java.util.*;
import java.awt.*;
//Here we'll build a constructor that will allow the charcters in this segement to be identified
   public class Bear extends Critter{
      private Color color;
      private int move;
      
      public Bear(boolean polar){
         if(polar){
            color = Color.WHITE;
         }else{
            color = Color.BLACK;
         }
      }
          
      public Color getColor(){
         return color; 
      } 
//toString allows us to manpulate the movement of the charcters      
      public String toString(){
         if(move % 2 == 0){
            return "/";
      }else{
         return "\\";
      }
     }
//Here we'll be instructing the charcters how to interact with other charcters that have been extended in to the program        
      public Action getMove(CritterInfo info){
         move++;
         if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
         }else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
         }else{
            return Action.LEFT;
         }
      }
}