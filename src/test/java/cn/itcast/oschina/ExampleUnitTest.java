package cn.itcast.oschina;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        int a = Optional.ofNullable(demo(1,3)).map(b->b+1).orElse(100);
        System.out.println(a);
    }
    public int demo(int  a, int b){
        return a+b;
    }
}