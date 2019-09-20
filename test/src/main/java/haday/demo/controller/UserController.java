package haday.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import haday.demo.entity.first.User;
import haday.demo.service.IUserService;

/**
 * @Description: TODO
 * @Author: dingj
 * @TIME: 2019年9月12日 - 下午5:47:00
 */

@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/getAllUser")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@PostMapping(value = "/addUser")
	public int addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PostMapping(value = "/deleteUser")
	public int deleteUser(@RequestBody User user) {
		return userService.deleteUser(user);
	}

}
