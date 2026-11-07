public class Assignment01Q05 {
    public static int rec(int[][]met,int i,int j, int n){
        if (i==j)
            return n;
        int len = met.length;
        int max = len*len+1;
        for (int k=0;k<len;k++){
            if (met[i][k]==1){
                int[][] m1 = met.clone();
                m1[i][k]=0;
                int path = rec(m1, k, j, n+1);
                if (path < max)
                    max = path;
            }
        }
        return max;

    }
    public static int findShortestPath(int[][] m, int i, int j) {
        int result = rec(m, i, j, 0);
        int len = m.length;
        if (result == (len*len+1))
            return -1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}