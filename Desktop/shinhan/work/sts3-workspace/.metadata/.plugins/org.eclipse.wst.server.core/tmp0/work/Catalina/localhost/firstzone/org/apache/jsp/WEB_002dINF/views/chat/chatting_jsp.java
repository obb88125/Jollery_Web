/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-12-05 01:03:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1732591392405L));
    _jspx_dependants.put("jar:file:/C:/Users/User/Desktop/shinhan/work/sts3-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springLagacy/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/chatting.css\" />\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"EnterOut_div\">\r\n");
      out.write("			<input type=\"text\" id=\"user\" class=\"form-control\" placeholder=\"유저명\">\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-default enter_Btn\"\r\n");
      out.write("				id=\"btnConnect\">연결</button>\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-default out_Btn\"\r\n");
      out.write("				id=\"btnDisconnect\" disabled>종료</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"chat\"></div>\r\n");
      out.write("			<div class=\"input_Btn input_wrap\">\r\n");
      out.write("				<input type=\"text\" name=\"msg\" id=\"msg\" placeholder=\"대화 내용을 입력하세요.\"\r\n");
      out.write("					class=\"form-control\" disabled>\r\n");
      out.write("				<button class=\"btn_send\">전송</button>\r\n");
      out.write("			</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		var ws;\r\n");
      out.write("		$('#btnConnect').click(function() {         \r\n");
      out.write("			if ($('#user').val().trim() == ''){\r\n");
      out.write("				alert('유저명을 입력하세요.');$('#user').focus();\r\n");
      out.write("			}else{\r\n");
      out.write("				\r\n");
      out.write("			ws = new WebSocket(\"ws://\" + location.host + \"/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/chatserver\");\r\n");
      out.write("			ws.onopen = function(evt) { \r\n");
      out.write("				ws.send('1#' + $('#user').val() + '#');\r\n");
      out.write("				// 현재 사용자(나)가 입장했다고 서버에게 통지(유저명 전달)\r\n");
      out.write("				// 본인은 1# +user로 지정 -> 웹소켓 서버에서 상대방은 2#으로 지정했음. \r\n");
      out.write("				// 따라서 1#인지, 2#인지에 따라, 나와 상대방의 메시지를 구분가능\r\n");
      out.write("				$('#user').attr('readonly', true); //이미 접속한 유저명 수정 못하게 막기\r\n");
      out.write("				$('#btnConnect').attr('disabled', true); //연결 되었으니 연결 버튼 비활성화\r\n");
      out.write("				$('#btnDisconnect').attr('disabled', false); //종료 버튼 활성화\r\n");
      out.write("				$('#msg').attr('disabled', false); //메시지 입력 활성화\r\n");
      out.write("			};\r\n");
      out.write("			\r\n");
      out.write("			ws.onmessage = function(evt) {\r\n");
      out.write("				let no = evt.data.substring(0, 1); // 웹소켓에서는 JSON 형식으로 통신\r\n");
      out.write("				//evt_data =  MessageEvent {isTrusted: true, data: '1#작성자#', \r\n");
      out.write("				// origin: 'ws://localhost:9090/myapp', lastEventId: '', source: null, …} 형태로 들어옴'\r\n");
      out.write("				let user = evt.data.substring(2, evt.data.length - 1);\r\n");
      out.write("				let index = evt.data.indexOf(\"#\", 2);\r\n");
      out.write("				let txt = evt.data.substring(index + 1);\r\n");
      out.write("\r\n");
      out.write("				if (no == '1') {\r\n");
      out.write("					print(user, txt);\r\n");
      out.write("				} else if (no == '2') {\r\n");
      out.write("					index = evt.data.indexOf(\":\", 2);\r\n");
      out.write("					user = evt.data.substring(2, index);\r\n");
      out.write("					txt = evt.data.substring(index + 1);\r\n");
      out.write("					printOther(user, txt);\r\n");
      out.write("				}\r\n");
      out.write("			};\r\n");
      out.write("\r\n");
      out.write("			ws.onclose = function(evt) {\r\n");
      out.write("				console.log('소켓이 닫힙니다.');\r\n");
      out.write("			};\r\n");
      out.write("\r\n");
      out.write("			ws.onerror = function(evt) {\r\n");
      out.write("				console.log(evt.data);\r\n");
      out.write("			};\r\n");
      out.write("		 } \r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		// 메세지 전송 및 아이디\r\n");
      out.write("		\r\n");
      out.write("		function print(user, txt) {\r\n");
      out.write("			if (txt.trim() =='') return;\r\n");
      out.write("			let temp = '';\r\n");
      out.write("			temp += '<div class=\"message_container\">';\r\n");
      out.write("			temp += ' <span style=\"font-size:12px;color:#777;margin-bottom: 3px;\">'\r\n");
      out.write("					+ new Date().toLocaleTimeString([], {\r\n");
      out.write("						hour : '2-digit',\r\n");
      out.write("						minute : '2-digit'\r\n");
      out.write("					}) + '</span>';\r\n");
      out.write("			temp += '<div class=\"message_background\">';\r\n");
      out.write("			temp += '<div class=\"message\">';\r\n");
      out.write("			temp += txt;\r\n");
      out.write("			temp += '</div>';\r\n");
      out.write("			temp += '</div>';\r\n");
      out.write("			temp += '</div>';\r\n");
      out.write("			$('#chat').append(temp);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		// 다른 client 접속		\r\n");
      out.write("		var isFirstMessage = {}; // 각 사용자가 처음으로 메시지를 보냈는지 저장하는 객체\r\n");
      out.write("		function printOther(user, txt) {\r\n");
      out.write("			if (txt.trim() == '') {\r\n");
      out.write("				// 메시지 본문이 빈 문자열인 경우 아무 것도 하지 않음\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			let temp = '';\r\n");
      out.write("			if (!isFirstMessage[user]) { // 사용자가 처음으로 메시지를 보냈을 때만 입장 메시지를 출력\r\n");
      out.write("				temp += '<div class=\"coming_user\">';\r\n");
      out.write("				temp += \"'\" + user + \"' 이(가) 접속했습니다.\";\r\n");
      out.write("				temp += '</div>';\r\n");
      out.write("				isFirstMessage[user] = true;\r\n");
      out.write("			}\r\n");
      out.write("			temp += '<div class=\"yourChat_message\">';\r\n");
      out.write("			temp += '🍟' + user;\r\n");
      out.write("			temp += '<div class=\"your_message_background\">';\r\n");
      out.write("			temp += '<div class=\"your_message\">' + txt + '</div>';\r\n");
      out.write("			temp += ' <span style=\"font-size:12px;color:#777;margin-bottom: 3px;\">'\r\n");
      out.write("					+ new Date().toLocaleTimeString([], {\r\n");
      out.write("						hour : '2-digit',\r\n");
      out.write("						minute : '2-digit'\r\n");
      out.write("					}) + '</span>';\r\n");
      out.write("			temp += '</div>';\r\n");
      out.write("			temp += '</div>';\r\n");
      out.write("\r\n");
      out.write("			$('#chat').append(temp);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		$('#user').keydown(function() {\r\n");
      out.write("			if (event.keyCode == 13) {\r\n");
      out.write("				$('#btnConnect').click();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		$(\".btn_send\").on(\"click\", function() {\r\n");
      out.write("			let _msg =  $(\"#msg\").val();\r\n");
      out.write("			//서버에게 메시지 전달\r\n");
      out.write("			//2#유저명#메시지\r\n");
      out.write("			ws.send('2#' + $('#user').val() + '#' + _msg); //서버에게\r\n");
      out.write("			print($('#user').val(), _msg); //본인 대화창에\r\n");
      out.write("			$('#msg').val('');\r\n");
      out.write("			$('#msg').focus();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$('#msg').keydown(function() {\r\n");
      out.write("			if (event.keyCode == 13) {\r\n");
      out.write("				$(\".btn_send\").trigger(\"click\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		$('#btnDisconnect').click(function() {\r\n");
      out.write("			ws.close();\r\n");
      out.write("\r\n");
      out.write("			$('#user').attr('readonly', false);\r\n");
      out.write("			$('#user').val('');\r\n");
      out.write("\r\n");
      out.write("			$('#btnConnect').attr('disabled', false);\r\n");
      out.write("			$('#btnDisconnect').attr('disabled', true);\r\n");
      out.write("\r\n");
      out.write("			$('#msg').val('');\r\n");
      out.write("			$('#msg').attr('disabled', true);\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		function rand(min, max) {\r\n");
      out.write("			return Math.floor(Math.random() * (max - min + 1)) + min;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		$(function() {\r\n");
      out.write("			var aa = rand(1,15);\r\n");
      out.write("			$(\"#chat\").css({\"background-image\": `url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/chat_bg${aa}.jpg\")`});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/chat/chatting.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("path");
    // /WEB-INF/views/chat/chatting.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/chat/chatting.jsp(9,0) '${pageContext.servletContext.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.servletContext.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager());
    return false;
  }
}