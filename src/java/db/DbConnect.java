package db;
import java.sql.*;
public class DbConnect {
    private Connection c;
    private Statement st;
    private PreparedStatement insertUser,checkProduct,
            checkUser,userDetails,checkadmin,
            insertProduct,getProduct,handmade,handicraft,
            bags,bedsheet,footware,cart,getcart,
            orderinfo,removecart,orderproduct,getoid,
            getpid,getorder,delcart,updateprofile;
    public Statement getSt() {
        return st;
    }
    public PreparedStatement getupdateprofile() {
        return updateprofile;
    }
    public PreparedStatement getdelcart() {
        return delcart;
    }
    public PreparedStatement getgetorder() {
        return getorder;
    }
    public PreparedStatement getgetpid() {
        return getpid;
    }
    public PreparedStatement getgetoid() {
        return getoid;
    }
    public PreparedStatement getorderproduct() {
        return orderproduct;
    }
     public PreparedStatement getremovecart() {
        return removecart;
    }
    public PreparedStatement getorderinfo() {
        return orderinfo;
    }
    public PreparedStatement getgetcart() {
        return getcart;
    }
    public PreparedStatement getcart() {
        return cart;
    }
     public PreparedStatement gethandmade() {
        return handmade;
    }
      public PreparedStatement gethandicraft() {
        return handicraft;
    }
       public PreparedStatement getbags() {
        return bags;
    }
        public PreparedStatement getInsertUser() {
        return insertUser;
    }
         public PreparedStatement getbedsheet() {
        return bedsheet;
    }
    public PreparedStatement getfootware() {
        return footware;
    }
    public PreparedStatement getCheckUser() {
        return checkUser;
    }
    public PreparedStatement getcheckadmin() {
        return checkadmin;
    }
    public PreparedStatement getUserDetails() {
        return userDetails;
    }
    public PreparedStatement getinsertProduct() {
        return insertProduct;
    }
    public PreparedStatement getgetProduct() {
        return getProduct;
    }
    public PreparedStatement getcheckProduct() {
        return checkProduct;
    }
    public DbConnect(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
                "indshop", "indshop");
        st = c.createStatement();
        insertUser = c.prepareStatement("insert into USER_INFO values(?,?,?,?,?,?)");
        checkUser=c.prepareStatement("select * from user_info where email=? and password=?");
        checkadmin=c.prepareStatement("select * from admin where aid=? and password=?");
        userDetails=c.prepareStatement("select * from user_info where email=?");
        insertProduct = c.prepareStatement("insert into PRODUCT (name,price,info,category,area,image1,image2,image3) values(?,?,?,?,?,?,?,?)");
        getProduct = c.prepareStatement("select * from PRODUCT");
        checkProduct = c.prepareStatement("select * from PRODUCT where pid=?");
        footware = c.prepareStatement("select * from PRODUCT where category=?");
        bedsheet = c.prepareStatement("select * from PRODUCT where category=?");
        bags = c.prepareStatement("select * from PRODUCT where category=?");
        handicraft = c.prepareStatement("select * from PRODUCT where category=?");
        handmade = c.prepareStatement("select * from PRODUCT where category=?");
        cart = c.prepareStatement("insert into cart (email,pid,product_qty) values(?,?,?)");
        getcart = c.prepareStatement("select * from PRODUCT where pid IN (select pid from cart where email=?)");
        orderinfo = c.prepareStatement("insert into order_info (user_email,user_name,user_phone,user_address,total_amount) values(?,?,?,?,?)");
        removecart = c.prepareStatement("delete from cart where email=? and pid=?");
        orderproduct = c.prepareStatement("insert into order_product  values(?,?,?)");
        getoid = c.prepareStatement("select max(oid) from order_info where  user_email=?");
        getpid = c.prepareStatement("select * from cart where email=?");
        getorder = c.prepareStatement("select * from PRODUCT where pid IN (select pid from order_product where oid=?)");
        delcart = c.prepareStatement("delete from cart where email=?");
        updateprofile = c.prepareStatement("update user_info set name=?,phone=?,address=? where email=?");
    }catch(Exception ex){
    ex.printStackTrace();
    }
   }
}