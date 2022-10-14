package js;

import java.util.*;

public class avgSmallestLargest {
    public static void main(String args[]) {
        Integer[] num = { 1,4,3, 4};

 int min = Collections.min(Arrays.asList(num));
 int max = Collections.max(Arrays.asList(num));

int min_count = 0;
for (int i = 0; i < num.length; i++)
    if (num[i] == min)
        min_count++;
 
int max_count = 0;
for (int i = 0; i < num.length; i++)
    if (num[i] == max)
        max_count++;


int sum=min*min_count+max*max_count;
double avg=sum/(min_count+max_count);
System.out.println(avg);

    }
}
