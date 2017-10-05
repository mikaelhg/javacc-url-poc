package io.mikael.poc.test;

import io.mikael.poc.UrlParser;
import org.junit.Test;

public class HelloTest {

    static final String URLS[] = {
            "http://a_host:12345/a_path?k1=v1&k2=v2&k2=v3",
            "http://a_host:12345/a_path?k1=v1&k2=v2#/a_fragment?f1_p=f1_v&f2_p=f2_v"
    };

    @Test
    public void helloTest() throws Exception {

        for (final String url : URLS) {
            UrlParser.Result r = UrlParser.parse(url);
            System.out.println(r);
        }
    }

}
