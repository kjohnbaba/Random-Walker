/*************************************************************************
 **  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *************************************************************************/
public class RandomWalker {

    public static void main(String[] args) {

    int step = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("(" + x + ", " + y + ")");

    for (int i = 0; i<step; i++){
        
    double randomizer = Math.random();
    
    if (randomizer < 0.25)
 x= x+1 ;
else if (randomizer < 0.5)
x= x-1;
else if (randomizer < 0.75)
y=y-1;
else if (randomizer< 1.0)
y=y+1;
System.out.println("(" + x + ", " + y + ")");
}
        
double sq = Math.pow(x, 2) + Math.pow(y, 2);
System.out.println("Squared Distance = "+ sq);
    }
}
