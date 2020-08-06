package org.dxc.login.service;

import org.dxc.login.model.LoginBean;
import org.springframework.stereotype.Service;
@Service
public class LoginService {
	
	public boolean validate(LoginBean loginBean) {
		String user=loginBean.getUsername();
		String pass=loginBean.getPassword();
		if(pass.equals(user)) {
		return true;
		}
		else {
			return false;
		}
	}


		
	
}

