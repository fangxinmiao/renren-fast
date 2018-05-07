package io.renren.modules.other.mapper;

import io.renren.modules.other.entity.Foo;
import io.renren.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by fangxm on 2017-08-28.
 */
@Mapper
@Repository
public interface FooMapper extends BaseDao<Foo> {
}
