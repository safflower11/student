package com.lut.student.web.controller;

import com.lut.student.util.Message;
import com.lut.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "学生控制器")
public class StudentController {

    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message<String> add(){

        return MessageUtil.success("添加学生成功");
    }

    @GetMapping("/delete")
    @ApiOperation(value="删除学生")
    @ApiImplicitParam(name="stuid",value = "学号",paramType = "query",dataType = "int")
    @ApiImplicitParams({
            @ApiImplicitParam(name="stuid",value = "学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "名字",paramType = "query",dataType = "string")
    })
    public Message<String> delete(int stuid,String name){
        return MessageUtil.success("删除学生成功");
    }

}
