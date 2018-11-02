import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}

class solution4 {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() == 0){
            return new ArrayList<Interval>();
        }
        if(intervals.size() == 1){
            return intervals;
        }
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];
        for(int i = 0; i < intervals.size(); i++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> result = new ArrayList<Interval>();
        int x = 0;
        int s = start[0], e = end[0];
        while(x < intervals.size()){
            if(start[x] > e){
                result.add(new Interval(s, e));
                s = start[x];
                e = end [x];
            }
            else{
                e = end[x];
            }
            if(x == intervals.size() - 1){
                result.add(new Interval(s, e));
            }
            x ++;
        }
        return result;
    }
}