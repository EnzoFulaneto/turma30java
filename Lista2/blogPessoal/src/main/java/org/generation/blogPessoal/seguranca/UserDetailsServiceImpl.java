package org.generation.blogPessoal.seguranca;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional <Usuario> user = userRepository.findAllByUsuario(username);
		user.orElseThrow (() -> new UsernameNotFoundException (username + "not found."));
		return user.map(UserDetailsImpl:: new).get();
	}
}