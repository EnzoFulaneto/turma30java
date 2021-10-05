package com.MLDG.MinhaLojaDeGames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.MLDG.MinhaLojaDeGames.model.UserLogin;
import com.MLDG.MinhaLojaDeGames.model.Usuario;
import com.MLDG.MinhaLojaDeGames.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public Optional<Usuario> CadastrarUsuario(Usuario usuario) {
		Optional<Usuario> user = repository.findAllByUsuario(usuario.getUsuario());
		if(user.isPresent()) {
			return Optional.ofNullable(null);
		}
			
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
			
			return Optional.of(repository.save(usuario));
		}
	
	public Optional <UserLogin> Logar (Optional <UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder ();
		Optional <Usuario> usuario = repository.findAllByUsuario(user.get().getUsuario());
		
		if (usuario.isPresent()) {
			if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte [] encodeAuth = Base64.encodeBase64 (auth.getBytes(Charset.forName("US-ASCII")));
			
				String authHeader = "Basic " + new String (encodeAuth);
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());
				return user;
			}
		}
		return null;
	}
}