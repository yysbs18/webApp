package net.imwork.amorgemini.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/3/15.
 */
@Service
@Transactional
public class ShiroRealm extends AuthorizingRealm {
    /***
     *权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
//        //获取登录的用户名
//        User user=userService.findByName(loginName);
//        if(user!=null){
//
//            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
////登录的用户有多少个角色
//            info.setRoles(user.getRolesName());
//            List<UserRole> roleList=user.getRoleList();
//            for(Role role:roleList){
////角色有多少个权限
//                info.addStringPermissions(role.getPermissionNames());
//            }
//            return info;
//        }
        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        User user = userService.findByName(token.getUsername());
//        if(user != null) {
//            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
//        }
        return null;
    }
}
