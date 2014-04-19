/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2014-04-14 16:26:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.atc.siterra.bup.sharegen.model.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"index.jsp\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<h1>Database Explorer</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row toggable\">\r\n");
      out.write("\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\tDatabase Type:\r\n");
      out.write("\t\t\t<select class=\"database form-control\">\r\n");
      out.write("\t\t\t\t<option value=\"sqlserver2000\">SQL Server 2000</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\tDatabase Name:\r\n");
      out.write("\t\t\t<input class=\"databaseName form-control\" \tplaceholder=\"Database Name\" value=\"ShareGen\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\tUsername:\r\n");
      out.write("\t\t\t<input class=\"databaseUsername form-control\" placeholder=\"Username\" value=\"semaan_app_user\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\tPassword:\r\n");
      out.write("\t\t\t<input class=\"databasePassword form-control\" placeholder=\"Password\" value=\"qcdb01\" type=\"password\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<button class=\"btn btn-success\">Connect</button>\r\n");
      out.write("\t\t\t<button class=\"btn btn-success\" name=\"command\" value=\"save\">Save</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"#\" class=\"taggle\">Toggle</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-3 scrollable\" style=\"height: 600px;overflow-y: scroll;overflow-x: hidden;\">\r\n");
      out.write("\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");

	Database db = new Database("ShareGen",
			"com.microsoft.jdbc.sqlserver.SQLServerDriver",
			"microsoft","sqlserver","QCSMN01","1433",
			"semaan_app_user","qcdb01",null);
	TableService svc = new TableService(db);

	TableService tableService = new TableService(db);
	List<Table> tables = tableService.getTables();

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<th>Tables (");
      out.print( tables.size() );
      out.write(")</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
	for(Table table : tables)
	{
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"index.jsp?table=");
      out.print( table.name );
      out.write('"');
      out.write('>');
      out.print( table.name );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
	}
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t<div style=\"height: 600px;overflow-y: scroll;overflow-x: hidden;\">\r\n");
      out.write("\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
	String tableName = request.getParameter("table");
	if(tableName != null)
	{
		List<Column> columns = tableService.getColumns(tableName);

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<th>Fields (");
      out.print( columns.size() );
      out.write(")</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Siterra Field</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Comment</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Update</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
		for(Column col : columns)
		{
			String pkStyle = "";
			if(col.isPrimaryKey)
				pkStyle = "font-weight:bold";
		
      out.write("\t\t\t<tr style=\"");
      out.print(pkStyle);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<td><span style=\"font-weight:bold\">");
      out.print( col.name );
      out.write("</span><br/><span style=\"font-size:0.65em\">");
      out.print( col.getTypeName());
      out.write('(');
      out.print( col.size );
      out.write(")</span></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"siterraField form-control\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"fieldComment form-control\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"btn btn-primary\">Edit</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
		}
	}

      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=table value=\"");
      out.print(tableName);
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<!-- script src=\"js/util.js\"></script>\r\n");
      out.write("<script src=\"js/atc.js\"></script-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
