package io.mikael.poc.test;

import io.mikael.poc.UrlParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParseTest {

    private static final String URLS[] = {
            "http://a_host:12345/a_path?k1=v1&k2=v2&k2=v3",
            "http://666666:333/9999999?k1=v1&k2=v2&k2=v3",
            "http://a_host:12345/a_path?k1=v1&k2=v2#/a_fragment?f1_p=f1_v&f2_p=f2_v",
            "http://user:pass@host:12345/path",
            "//user:pass@host:12345/path",
            "/path?k1=v1&k2=v2&k2=v3",
            "/path",
            "?k1=v1&k2=v2&k2=v3",
    };

    @Test
    @DisplayName("Parse URLs")
    void parseTest() throws Exception {
        for (final String url : URLS) {
            System.out.printf("%70s ", url);
            UrlParser.Result r = UrlParser.parse(url);
            System.out.println(r);
        }
    }

}
