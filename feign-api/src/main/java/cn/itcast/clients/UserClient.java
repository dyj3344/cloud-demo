package cn.itcast.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pojo.User;

@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);

}
