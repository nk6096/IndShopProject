import db.DbConnect;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@MultipartConfig
public class Upload extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
try{
String product_name = request.getParameter("product_name");
String price = request.getParameter("price");
String info = request.getParameter("information");
String category = request.getParameter("category");
String area = request.getParameter("area");
System.out.println(area);
//code to get file from form request 
javax.servlet.http.Part f1=request.getPart("image1");
javax.servlet.http.Part f2=request.getPart("image2");
javax.servlet.http.Part f3=request.getPart("image3");
//String fname=file.getSubmittedFileName();
java.io.InputStream image1=f1.getInputStream();
java.io.InputStream image2=f2.getInputStream();
java.io.InputStream image3=f3.getInputStream();
//code end
ServletContext application=getServletContext();
DbConnect db=(DbConnect)application.getAttribute("db");
if(db==null){
db=new DbConnect();
application.setAttribute("db",db);
}
PreparedStatement insertProduct=db.getinsertProduct();
insertProduct.setString(1, product_name);
insertProduct.setString(2, price);
insertProduct.setString(3, info);
insertProduct.setString(4, category);
insertProduct.setString(5, area);
insertProduct.setBinaryStream(6, image1);
insertProduct.setBinaryStream(7, image2);
insertProduct.setBinaryStream(8, image3);
insertProduct.executeUpdate();
session.setAttribute("msg", "Product Uploaded Successfully");
response.sendRedirect("admin.jsp");
    
} catch (Exception ex) {
    session.setAttribute("msg", 
            "Product Upload Failed "+ex.getMessage());
    ex.printStackTrace();
    response.sendRedirect("admin.jsp");
} 
    }  
}
