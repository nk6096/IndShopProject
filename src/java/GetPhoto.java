import db.DbConnect;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class GetPhoto extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           try {
int pid=Integer.parseInt(request.getParameter("pid"));
System.out.print(pid);
ServletContext application=getServletContext();
DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement checkProduct=db.getcheckProduct();
    checkProduct.setInt(1, pid);
    ResultSet rs=checkProduct.executeQuery();
    if(rs.next()){
    response.getOutputStream().write(rs.getBytes(7)); 
} 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
