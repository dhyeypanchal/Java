public class insertinterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < newInterval.length; i++) {
            System.out.print(newInterval[i]+" ");
        }
        return intervals;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{6,9}};
        int[] newInterval={ 2, 5};
        insert(intervals, newInterval);
    }
}   
