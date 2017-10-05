package io.mikael.poc.test;

import io.mikael.poc.UrlParser;
import org.junit.Test;

public class HelloTest {

    @Test
    public void helloTest() throws Exception {
        UrlParser.parse("http://a_host:12345/a_path?k1=v1&k2=v2&k2=v3");
        UrlParser.parse("http://a_host:12345/a_path?k1=v1&k2=v2#/a_fragment?f1_p=f1_v&f2_p=f2_v");
    }

}
