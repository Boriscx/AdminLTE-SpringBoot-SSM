package com.cy.pj.sys.service;

import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.pojo.PageObject;

public interface SysRoleService {

    int saveObject(SysRole sysRole);

    int deleteObject(Integer id);

    PageObject<SysRole> findPageObject(String name, Integer pageCurrent, Integer pageSize);


}
