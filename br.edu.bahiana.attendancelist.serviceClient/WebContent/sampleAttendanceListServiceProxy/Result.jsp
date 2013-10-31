<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAttendanceListServiceProxyid" scope="session" class="br.edu.bahiana.attendancelist.service.AttendanceListServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAttendanceListServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAttendanceListServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAttendanceListServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.edu.bahiana.attendancelist.service.AttendanceListService getAttendanceListService10mtemp = sampleAttendanceListServiceProxyid.getAttendanceListService();
if(getAttendanceListService10mtemp == null){
%>
<%=getAttendanceListService10mtemp %>
<%
}else{
        if(getAttendanceListService10mtemp!= null){
        String tempreturnp11 = getAttendanceListService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String username_1id=  request.getParameter("username16");
            java.lang.String username_1idTemp = null;
        if(!username_1id.equals("")){
         username_1idTemp  = username_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        long logIn13mtemp = sampleAttendanceListServiceProxyid.logIn(username_1idTemp,password_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(logIn13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String teacherID_3id=  request.getParameter("teacherID25");
        long teacherID_3idTemp  = Long.parseLong(teacherID_3id);
        br.edu.bahiana.attendancelist.service.GetScholarshipPeriodsResponse getScholarshipPeriods20mtemp = sampleAttendanceListServiceProxyid.getScholarshipPeriods(teacherID_3idTemp);
if(getScholarshipPeriods20mtemp == null){
%>
<%=getScholarshipPeriods20mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">items:</TD>
<TD>
<%
if(getScholarshipPeriods20mtemp != null){
br.edu.bahiana.attendancelist.service.ScholarshipPeriodContract[] typeitems23 = getScholarshipPeriods20mtemp.getItems();
        String tempitems23 = null;
        if(typeitems23 != null){
        java.util.List listitems23= java.util.Arrays.asList(typeitems23);
        tempitems23 = listitems23.toString();
        }
        %>
        <%=tempitems23%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>