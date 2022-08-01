package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {

        for (int i = 0; i < sideLength; i++)
        {
            for (int k = 0; k < sideLength; k++)
            {
                if(i == Math.round(((sideLength / 2)*10)/10) || k == (((sideLength / 2)*10)/10))
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
