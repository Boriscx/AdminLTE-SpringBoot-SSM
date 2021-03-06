package com.cy.pj.sys.controller;

import com.cy.pj.sys.entity.SysDept;
import com.cy.pj.sys.pojo.JsonResult;
import com.cy.pj.sys.service.SysDeptService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept/")
public class SysDeptController {
    private SysDeptService sysDeptService;
    public SysDeptController(SysDeptService sysDeptService){
        this.sysDeptService = sysDeptService;
    }

    @GetMapping("doFindObjects")
    public JsonResult<List> doFindObjects(){
        return new JsonResult<>(sysDeptService.findObjects());
    }

    @GetMapping("doFindZTreeNodes")
    public JsonResult<List> doFindZTreeNodes(){
        return new JsonResult<>(sysDeptService.findZTreeMap());
    }

    @PostMapping("doSaveObject")
    public JsonResult<Integer> doSaveObject(@Validated SysDept sysDept){
        sysDeptService.saveObject(sysDept);
        return new JsonResult<>("保存成功");
    }

    @PostMapping("doUpdateObject")
    public JsonResult<Integer> doUpdateObject(@Validated SysDept sysDept){
        sysDeptService.updateObject(sysDept);
        return new JsonResult<>("修改保存完毕");
    }

    @PostMapping("doDeleteObject")
    public JsonResult<Integer> doDeleteObject(Integer id){
        return new JsonResult<>(sysDeptService.deleteObject(id));
    }
}
