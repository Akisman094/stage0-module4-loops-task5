package school.mjc.stage0.loops.task5;

public class Hourglass
{
    public void printHourglassOfGivenSize(int height)
    {
        int halfHeight = Math.round(height / 2);

        for (int i = 0; i <= height; i++) {
            if (i == halfHeight) continue;
            for (int j = 0; j < height; j++) {
                System.out.print(j >= Math.min(i, height-i) && j < Math.max(i, height-i) ? "8" : " ");
            }
            System.out.println();
        }
    }
}
