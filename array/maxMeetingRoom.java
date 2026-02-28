
import java.util.*;

public class MeetingRooms {

    public static int minMeetingRooms(int[][] meetings) {

        int n = meetings.length;

        int[] start = new int[n];
        int[] end = new int[n];

        // separate start and end times
        for (int i = 0; i < n; i++) {
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int maxRooms = 0;

        int i = 0, j = 0;

        // two pointer traversal
        while (i < n && j < n) {

            // meeting started before previous ends → need new room
            if (start[i] < end[j]) {
                rooms++;
                i++;
            } else {
                // meeting finished → room freed
                rooms--;
                j++;
            }

            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {

        int[][] meetings = {
            {1,4},
            {2,5},
            {7,9},
            {3,6}
        };

        System.out.println(minMeetingRooms(meetings));
    }
}
