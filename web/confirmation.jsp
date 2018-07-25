<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@page import="db.DbConnect"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.ResultSet"%>
<%
     HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
    String e=(String)ud.get("email");
    DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement userDetails=db.getUserDetails();
    userDetails.setString(1, e);
    ResultSet rs=userDetails.executeQuery();
    if(rs.next()){
        String pass=rs.getString(6);
        //MAil send COde
try{
    final String AEMAIL="indshopindia@gmail.com";
    final String APASS="Indshop@1";
    String SEMAIL=e;
    String SUB="Order Confirmation - Your Order with IndShop has been successfully placed!";
     int oid = 0;
    String PRODUCT = null;
    PreparedStatement getoid=db.getgetoid();
    getoid.setString(1, String.valueOf(ud.get("email")));
    ResultSet rst=getoid.executeQuery();
    if(rst.next()){
     oid = rst.getInt(1);
     rst.close();
    }
    PreparedStatement getorder=db.getgetorder();
    getorder.setInt(1, oid);
    ResultSet rstl=getorder.executeQuery();
    if(rstl.next()){
        int i=0;
            do{
            PRODUCT = "Product :"+ rstl.getString(2)+"   Rs."+rstl.getString(3)+"<br/>";
            }while(rstl.next());
    }
    String BODY="<b>Hi "+ud.get("name")+"</b><h3>Delivery Address</h3><b>"+ud.get("name")+
            "</b> <br/> Mobile No : "+ud.get("number")+" <br/> Address : "+ud.get("address")+"<br/><br/>"+
            PRODUCT+"<br/>Your Product will be delivered within 3 working days";
    Properties props=new Properties();
    props.put("mail.smtp.host","smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port","465");
    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth","true");
    props.put("mail.smtp.port","465");
    Session ses=Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(AEMAIL,APASS);
                }
            }
            );
    
    Message message=new MimeMessage(ses);
    message.setFrom(new InternetAddress(AEMAIL));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(SEMAIL));
    message.setSubject(SUB);
    message.setContent(BODY,"text/html" );
    Transport.send(message);
}
catch(Exception ex){
    ex.printStackTrace();
    session.setAttribute("msg","Mail Send Failed ."+ex.getMessage());
}
response.sendRedirect("order.jsp");
                //end--MAil send COde
    }
    else{
        session.setAttribute("msg", "Order Not Deliverable");
response.sendRedirect("profile.jsp");
    }
     }else{
        session.setAttribute("msg", "Please Login First");
        response.sendRedirect("loginpage.jsp");
    }
%>