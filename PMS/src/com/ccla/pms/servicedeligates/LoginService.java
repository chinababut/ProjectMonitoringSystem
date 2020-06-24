package com.ccla.pms.servicedeligates;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ccla.pms.dao.LoginCheckerDao;
import com.ccla.pms.dto.LogginCheckerDto;
import com.ccla.pms.error.InternalDbProblem;
import com.ccla.pms.vo.LogginCheckerVo;

public class LoginService {

	String userId;
	String password;

	static {

	}

	public boolean loginValidater(LogginCheckerVo vo) throws InternalDbProblem {

		LogginCheckerDto dto = null;
		ResultSet rs = null;
		dto = new LogginCheckerDto();
		dto.setUserid(vo.getUserid());
		dto.setPassword(vo.getPassword());
		try {
			rs = LoginCheckerDao.getLogins();
			if (rs != null) {

				while (rs.next()) {

					if (vo.getUserid().equals(rs.getString(1)) && vo.getPassword().equals(rs.getString(2)))
						return true;
					else
						return false;
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InternalDbProblem(e.getMessage());

		} catch (SQLException e) {

			e.printStackTrace();
			throw new InternalDbProblem(e.getMessage());
		}

		return true;
	}

}
