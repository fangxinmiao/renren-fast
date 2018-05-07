package io.renren.modules.other.controller;

import io.renren.modules.other.entity.Foo;
import io.renren.modules.sys.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * Created by fangxm on 2017-08-28.
 */
@Controller
public class FooController {

    @Autowired
    public FooController(FooService fooService) {
        //this.fooService = fooService;

        Foo foo = new Foo();
        foo.setA("1");
        foo.setB("2");
        foo.setC(3L);
        foo.setD(new Date());
        fooService.save(foo);
    }
}
