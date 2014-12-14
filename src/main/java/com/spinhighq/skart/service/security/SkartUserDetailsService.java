package com.spinhighq.skart.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spinhighq.skart.model.Users;
import com.spinhighq.skart.repository.UsersRepository;

/**
 * @author bharath
 * 
 */
@Configuration
@Service
public class SkartUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersRepository usersRepo;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		
		Users user = usersRepo.findByUserName(userName);
		
		/*if (null == user){
			throw new UsernameNotFoundException("cannot find user " +userName);
		}*/

		return new User("test", "password", getGrantedAuthorities("test"));
	}

	private Collection<? extends GrantedAuthority> getGrantedAuthorities(String
			username) {
		return AuthorityUtils.createAuthorityList("ROLE_USER");
			}

}
