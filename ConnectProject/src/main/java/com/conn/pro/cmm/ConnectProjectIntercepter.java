package com.conn.pro.cmm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ConnectProjectIntercepter implements HandlerInterceptor  {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("[preHandle]");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		logger.info("[postHandle]");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex) throws Exception {
		logger.info("[afterCompletion]");
	}
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
//		// 1. handler 종류 확인 
//		// Controller에 있는 메서드이므로 HandlerMethod 타입인지 체크 
//		if( !( handler instanceof HandlerMethod ) ){ 
//			// return true이면 Controller에 있는 메서드가 아니므로, 그대로 컨트롤러로 진행 
//			return true; 
//		} 
//		String targetURI = request.getServletPath(); 
//		StringBuilder sb = new StringBuilder(); 
//		// request 정보 
//		logger.debug("=================== Start ====================");
//		sb.append( "\n#remoteIp : " ).append( request.getRemoteAddr() );
//		sb.append( "\n#targetURI : " ).append( targetURI );
//		sb.append( "\n#reqUrl : " ).append( request.getRequestURL().toString() );
//		sb.append( "\n#userAgent : " ).append( request.getHeader( "User-Agent" ) );
//		System.out.println( sb.toString() ); 
//		logger.debug("===============================================");
//		
//		return true;
//	}
//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
//		logger.debug("==================== END ======================");
//		logger.debug("===============================================");
//	}
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
//		logger.debug("is True");
//	}
}
