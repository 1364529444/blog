package com.cloud.eurekaserverauth.config;

import com.cloud.eurekaserverauth.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

public class Oauth2Config extends AuthorizationServerConfigurerAdapter {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailsService myUserDetailsService;

/*    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient(ConsParams.Auth.GET_CLIENT_ID)
                .secret(ConsParams.Auth.GET_SECRET)
                //有效时间 2小时
                .accessTokenValiditySeconds(ConsParams.Auth.GET_TOKEN_VALIDITY_SECONDS)
                //密码授权模式和刷新令牌
                .authorizedGrantTypes(ConsParams.Auth.GE_TAUTHORIZED_GRANT_TYPES)
                .scopes(ConsParams.Auth.GE_TSCOPES);
    }*/
    //配置 Token 的节点 和 Token 服务
/*    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

        endpoints.tokenStore(tokenStore())
                .authenticationManager(authenticationManager)
                .userDetailsService(myUserDetailsService)
                .accessTokenConverter(jwtTokenEnhancer());
    }*/
}
