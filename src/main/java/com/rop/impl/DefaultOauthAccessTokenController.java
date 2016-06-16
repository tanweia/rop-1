package com.rop.impl;

import com.rop.RopRequestContext;
import com.rop.security.OauthAccessTokenController;


/**
 *@Todo:      访问令牌控制器-默认实现
 *@UserName:  tanwei
 *@Time:      2016年5月31日 下午2:53:42
 */
public class DefaultOauthAccessTokenController implements OauthAccessTokenController{

	public boolean isAccess(RopRequestContext ropRequestContex) {
		return true;
	}

	public boolean isValid(RopRequestContext ropRequestContex) {
		return true;
	}

}
