package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int i = 0; i <cathetusLength; i++)
        {
            for (int k = 0; k <cathetusLength; k++)
            {
                if(k <= i)
                    System.out.printf("8");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
