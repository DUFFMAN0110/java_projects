package Practice_Java;



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
       int num = 1; 
        distL = 0;
        distR = spiral - 1;
        distU = 0;
        distD = spiral - 1;
        map = new int [spiral][spiral];
        
        do{
            for(int i = distU; i < distD; i++)
            {
                map[i][distL] = num;
                num++; 
            }
            for(int k = distL; k < distR; k++)
            {
                map[distD][k] = num;
                num++; 
            }
            for(int l = distD; l > distU; l--)
            {
                map[l][distR] = num;
                num++;
            }
            for(int g = distR ; g > distL ; g-- ){

            map[distU][g] = num; 
            num++;
            }
            if(distD != (spiral/2) -1)
            {
                distD--; 
            }
            else{
                distD = spiral/2 - 1; 
            }
            distU++; 
            distR--;
            if(distL != spiral - 2)
            {
                distL++; 
            }
            else{
                distL = spiral/2;
            }
        }while(map[distD][distL] != Math.pow(spiral,2) );
    }
    public void traverseOddSpiral()
    { 
        int middle = spiral / 2; 
        int num = 1; 
        distL = 0;
        distR = spiral - 1;
        distU = 0;
        distD = spiral - 1;
        map = new int [spiral][spiral];
        
        do{
            for(int i = distU; i < distD; i++)
            {
                map[i][distL] = num;
                num++; 
            }
            for(int k = distL; k < distR; k++)
            {
                map[distD][k] = num;
                num++; 
            }
            for(int l = distD; l > distU; l--)
            {
                map[l][distR] = num;
                num++;
            }
            for(int g = distR ; g >= distL + 1 ; g-- ){

            map[distU][g] = num; 
            num++;
            }
            distD--; 
            distU++; 
            distR--;
            distL++; 
        }while(num != Math.pow(spiral,2) );
        map[middle][middle] = (int)Math.pow(spiral,2);
    }

    public void forLoopOddSpiral(){
        int middle = spiral / 2; 
        int num = 1; 
        distL = 0;
        distR = spiral - 1;
        distU = 0;
        distD = spiral - 1;
        map = new int [spiral][spiral];
        for(int counter = 0; counter < spiral*spiral; counter++){
            for(int i = distU; i < distD; i++)
            {
                map[i][distL] = num;
                num++; 
            }
            for(int k = distL; k < distR; k++)
            {
                map[distD][k] = num;
                num++; 
            }
            for(int l = distD; l > distU; l--)
            {
                map[l][distR] = num;
                num++;
            }
            for(int g = distR ; g >= distL + 1 ; g-- ){

            map[distU][g] = num; 
            num++;
            }
            distD--; 
            distU++; 
            distR--;
            distL++; 
        }
        map[middle][middle] = (int)Math.pow(spiral,2);
    }
    public String toString()
    { 
        if(spiral % 2 == 0)
        {
            traverseEvenSpiral(); 
        }
        else{
            traverseOddSpiral();
        } 
        for(int[] row: map)
        {
            for(int num:row )
            {
                str += num + "\t"; 
            }
            str += "\n"; 
        }
        return str + "\n";
        
    }
}
