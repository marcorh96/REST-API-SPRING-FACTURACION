package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;
import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.services.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        Usuario usuario = usuarioService.findByUsername(authentication.getName());
        Map<String, Object> info = new HashMap<String, Object>();
        info.put("info_adicional", "Hola que tal: " + authentication.getName());
        info.put("nombre",   usuario.getNombre());
        info.put("apellido",  usuario.getApellido());
        info.put("email", usuario.getEmail());
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        return accessToken;
    }

}
