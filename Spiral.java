


public class Spiral 
{
    private String str = ""; 
    private int spiral; 
    private int[][] map;
    private int distL; // gonna start on the left side, ++ not --
    private int distR; // gonna star on the right side, (spiral - 1) --
    private int distU; // gonna start on the top/ y coordinate, ++ not -- until it equals spiral / 2
    private int distD; // gonna start on the bottom/ y coordinate down, -- not ++ until it equals / 2
    // once distU or distD == dist R or distL then end the coded


    public Spiral(int s)
    {
        spiral = s; 
    }
    public void traverseEvenSpiral()
    {
        //nested for loop
    }
    public void traverseOddSpiral()
    { 
        int num = 1; 
        distL = 0;
        distR = spiral - 1;
        distU = 0;
        distD = spiral - 1;
        map = new int [spiral][spiral];

        for(int i = 0; i < distR; i++)
        {
            map[i][distU] = num;
            num++; 
        }
        for(int k = 0; k < distR; k++)
        {
            map[distD][k] = num;
            num++; 
        }
        for(int l = 0; l > distD; l++)
        {
           //map
        }

    }
            
            
            
    

    public String toString()
    { 
        if(spiral % 2 == 0)
        {
            traverseEvenSpiral(); 
        }
        traverseOddSpiral(); 
        for(int[] row: map)
        {
            for(int num:row )
            {
                str += num + " "; 
            }
            str += "\n"; 
        }
        return str + "\n";
        
    }
}
