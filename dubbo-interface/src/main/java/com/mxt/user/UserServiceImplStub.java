package com.mxt.user;

/**
 * @author Simple
 * @date 2021/3/1 10:40
 */
public class UserServiceImplStub implements IUserService {

    private final  IUserService userService;
    //服务容器会给我们注入具体实现
    public UserServiceImplStub(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String hello(String name) {
        //此处编写统一的处理逻辑
        if(name == null || "".equals(name.trim())){
            return "400,无效参数";
        }
        return userService.hello(name);
    }
}
