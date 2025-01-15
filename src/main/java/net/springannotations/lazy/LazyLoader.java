package net.springannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //only creates spring bean on demand
public class LazyLoader {
    public LazyLoader() {
        System.out.println("LazyLoader...");
    }
}
