/**
 * Copyright (C), 2019-2019,
 * FileName: SayHelloByName
 * Author:   a
 * Date:     2019 3 20 0020 15:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.common;

import org.springframework.stereotype.Component;

@Component
public class SayHelloByName {

    /** 
    * @Description: 通过输入名字返回 你好：name 
    * @Param:  
    * @return:  
    * @Author: 陈腾帅
    * @Date: 2019-03-20 
    */
    public String sayHelloByName(String name) {
        return "你好:" + name;
    }
}