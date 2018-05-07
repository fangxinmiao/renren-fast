package io.renren.modules.sys.service;

import io.renren.modules.other.entity.Foo;

/**
 * Created by fangxm on 2017-08-28.
 */
public interface FooService {

    Foo queryFooById(Long id);

    void save(Foo foo);
}
