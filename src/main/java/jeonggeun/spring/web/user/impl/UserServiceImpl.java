package jeonggeun.spring.web.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jeonggeun.spring.web.user.UserService;
import jeonggeun.spring.web.user.UserVO;
import jeonggeun.spring.web.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	/*
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}*/
	@Override
	public UserVO getUser(UserVO vo) {
	return userDAO.getUser(vo);
	}

}
