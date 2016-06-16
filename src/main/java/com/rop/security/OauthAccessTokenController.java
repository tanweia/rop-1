package com.rop.security;

import com.rop.RopRequestContext;


/**
 *@Todo:      授权校验
 *@UserName:  tanwei
 *@Time:      2016年5月31日 下午2:50:20
 */
public interface OauthAccessTokenController {
	
	/**
	 * 校验access_token是否有效
	 * @Title: isValid
	 * @param ropRequestContex
	 * @return
	 */
    boolean isValid(RopRequestContext ropRequestContex);
    
	 /**
	  * 服务方法是否向ISV开放
	  * @Title: isAccess
	  * @param ropRequestContex
	  * @return
	  */
    boolean isAccess(RopRequestContext ropRequestContex);
    
}
