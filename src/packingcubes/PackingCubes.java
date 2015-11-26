package packingcubes;

public class PackingCubes {

    /**
     * Return the minimum cost of a cuboid box needed to pack N 1x1x1 cubes. The
     * cost of a box of dimensions d1xd2xd3 is d1+d2+d3.
     * 
     * @param N
     *            the number of 1x1x1 cubes that need to be packed
     * @return the cost of the cheapest box that can hold all N cubes without
     *         any additional space
     */

    public static int getMinimumCost(int N) {
        //start with the case of a box of N*1*1
        int lowestCost = N + 1 + 1;

        //try different whole numbers for dimension and correct the lowestCost 
        for (int length = 1; length <= N; length++) {
            if (N % length == 0) {
                int dimension = N / length;

                for (int width = 1; width <= dimension; width++) {
                    if (dimension % width == 0) {
                        int height = dimension / width;

                        int cost = height + width + length;
                        lowestCost = Math.min(lowestCost, cost);
                    }
                }
            }
        }
        return lowestCost;
    }
}
