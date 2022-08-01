package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height)
    {
        for (int i = 0; i < height; i++)
        {
            for(int k = 0; k <length; k++)
            {
                if(i == 0 || i == height - 1 || k == 0 || k == length -1)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
