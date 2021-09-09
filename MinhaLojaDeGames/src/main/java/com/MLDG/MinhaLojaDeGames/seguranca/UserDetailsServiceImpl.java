package com.MLDG.MinhaLojaDeGames.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MLDG.MinhaLojaDeGames.model.Usuario;
import com.MLDG.MinhaLojaDeGames.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional <Usuario> user = usuarioRepository.findAllByUsuario(username);
		user.orElseThrow(() -> new UsernameNotFoundException (username + "not found."));
		
		return user.map(UserDetailsImpl :: new).get();
	}
}