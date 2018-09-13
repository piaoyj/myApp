package test.java.com.example.project;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    @Tag("hoge")
    public void test1() {
        System.out.println("[hoge] test1");
    }

    @Test
    @Tag("fuga")
    public void test2() {
        System.out.println("[fuga] test2");
    }

    @Test
    @Tag("hoge")
    @Tag("fuga")
    public void test3() {
        System.out.println("[hoge, fuga] test3");
    }

    @Test
    @Tag("hoge")
    @Tag("piyo")
    public void test4() {
        System.out.println("[hoge, piyo] test4");
    }
}
