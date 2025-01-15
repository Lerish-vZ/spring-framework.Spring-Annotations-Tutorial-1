package net.springannotations.lazy;

import org.springframework.stereotype.Component;

@Component
public class LazyLoader {
    public LazyLoader() {
        System.out.println("LazyLoader...");
    }
}
