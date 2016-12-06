package handler;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import Models.User;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	private RedirectStrategy redirectStrategy=new DefaultRedirectStrategy();
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		HttpSession session=request.getSession();
		// TODO Auto-generated method stub
		Object authUser= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("username", ((User) authUser).getusername());
		session.setAttribute("authorities", authentication.getAuthorities());
		
		
		
		String targetUrl=determineTargetUrl(authentication);
		redirectStrategy.sendRedirect(request, response, targetUrl);
		
	}

	protected String determineTargetUrl(Authentication authentication) {
		// TODO Auto-generated method stub
		Set<String>authorities=AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		if(authorities.contains("ROLE_ADMIN")){
			return "/login";
		}
		else if(authorities.contains("ROLE_USER")){
			return "/Userview";
			
		}
		else {
			throw new IllegalStateException();
		}
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	
}
