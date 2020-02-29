package tasks.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesListTest {
    public RemoveDuplicatesList expected(Integer... i){
        return new RemoveDuplicatesList(Arrays.asList(i));
    }

    public RemoveDuplicatesList actual(Integer... i){
        RemoveDuplicatesList ans = expected(i);
        ans.removeDuplicates();
        return ans;
    }

    @Test
    public void removeDuplicates() {
        assertEquals(expected(1,2,3), actual(1,1,2,2,3,3));
        assertEquals(expected(1), actual(1));
        assertEquals(expected(1), actual(1,1));
        assertEquals(expected(3,2,1,5), actual(3,3,2,2,1,1,5));
    }
}