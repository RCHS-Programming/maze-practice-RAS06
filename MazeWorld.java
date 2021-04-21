import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Platform for the Maze.   
 * 
 * @author (Riz) 
 * @version (1)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * NOTE: Each panel is 133 x 133. 
     * NOTE: Lining up requires you to change either the short side of the edge by 12/2 (6) or the long side by 25/2 (13(12.5 but loss of precision)). 
     *  
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        //Outer Walls
        for(var i = 0; i < 16; i++) 
        {
            //Top Wall
            addObject(new Wall("edge.png"), 25 + 50 * i, 12);   
            
            //Bottom Wall
            addObject(new Wall("edge.png"), 25 + 50 * i, 587);
            
            //Left Wall
            addObject(new Wall("edge2.png"), 12, 25 + 50 * i);
            
            //Right Wall
            addObject(new Wall("edge2.png"), 800 - 12, 25 + 50 * i);
        }
        
        //Maze Walls 
            //Major Splice Segment One
        for(var x = 0; x < 13; x++) 
        {
           addObject (new Wall("edge.png"),25 + 50 * x, 127);
        }
           
                        //Minor Splices Segment One - Two
                    for(var b = 0; b < 2; b++)
                    {
                        addObject (new Wall ("edge2.png"), 254, 155 - 50 * b);
                        
                            //Segement One - Null
                        addObject (new Wall ("edge2.png"), 528, -10 + 50 * b);
                    }
                    addObject (new Wall ("edge.png"), 242, 79);
                    addObject (new Wall ("edge.png"), 192, 79);
                    
                    addObject (new Wall ("edge.png"), 541, 66);
                    addObject (new Wall ("edge.png"), 566, 66);
        
            //Major Splice Segment Two
        for(var y = 0; y < 13; y++) 
        {
           addObject (new Wall("edge.png"),775 - 50 * y, 254);
        }
        
                        //Minor Splices Segment Two - Three
                    for(var b = 0; b < 2; b++)
                    {
                        addObject (new Wall ("edge2.png"), 508, 282 - 50 * b);
                    }
                    addObject (new Wall ("edge.png"), 521, 200);
                    addObject (new Wall ("edge.png"), 546, 200);
            
            //Major Splice Segment Three
        for(var z = 0; z < 13; z++) 
        {
           addObject (new Wall("edge.png"),25 + 50 * z, 381);
        }
        
                        //Minor Splices Segment Three - Four
                    for(var b = 0; b < 2; b++)
                    {
                        addObject (new Wall ("edge2.png"), 254, 407 - 50 * b);
                    }
        
            //Major Splice Segment Four
        for(var a = 0; a < 13; a++) 
        {
           addObject (new Wall("edge.png"),775 - 50 * a, 500);
        }
        
                        //Minor Splices Segment Four - Null
                    for(var b = 0; b < 1; b++)
                    {
                        addObject (new Wall ("edge2.png"), 508, 478 - 50 * b);
                    }
    }
}
