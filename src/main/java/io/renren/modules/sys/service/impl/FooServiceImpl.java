package io.renren.modules.sys.service.impl;

import io.renren.modules.other.entity.Foo;
import io.renren.modules.other.mapper.FooMapper;
import io.renren.modules.sys.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fangxm on 2017-08-28.
 */
@Service
public class FooServiceImpl implements FooService {

    private final FooMapper fooMapper;

    @Autowired
    public FooServiceImpl(FooMapper fooMapper) {
        this.fooMapper = fooMapper;
    }

    @Override
    public Foo queryFooById(Long id) {
        return null;
    }

    @Override
    public void save(Foo foo) {
        fooMapper.save(foo);
    }
}
