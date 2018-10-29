package io.github.weechang.moreco.rbac.dao;

import io.github.weechang.moreco.rbac.domain.RbacRoleDept;
import io.github.weechang.moreco.base.dao.JpaDao;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author zhangwei
 * date 2018/10/26
 * time 18:10
 */
public interface RoleDeptDao extends JpaDao<RbacRoleDept> {

    List<RbacRoleDept> findAllByRoleIdAndDeptIdContains(Long roleId, List<Long> deptIds);
}
