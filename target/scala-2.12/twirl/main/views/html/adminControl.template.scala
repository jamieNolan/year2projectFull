
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object adminControl extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.users.Customer],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(productList: List[models.Product],customerList: List[models.users.Customer], user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Administrator Settings",user,filter)/*5.44*/{_display_(Seq[Any](format.raw/*5.45*/("""






   



    """),format.raw/*16.5*/("""<div class="container">
            <div class="row">
            
           
            
                <div class="col-md-10 col-md-offset-1">
        
                    <div class="panel panel-default panel-table">
                      <div class="panel-heading">
                        <div class="row">
                          <div class="col col-xs-6">
                            <h3 class="panel-title">Currently Registered Customers</h3>
                          </div>
                          <div class="col col-xs-6 text-right">
                              <a href=""""),_display_(/*30.41*/routes/*30.47*/.HomeController.addUser()),format.raw/*30.72*/("""">
                                  <button class="btn peach-gradient btn-rounded">Click here to register a new admin</button>
                                </a>
                                                        
                          </div>
                        </div>
                      </div>
                      <div class="panel-body">
                        <table class="table table-striped table-bordered table-list">
                          <thead>

                           """),_display_(/*41.29*/for(c<- customerList) yield /*41.50*/{_display_(Seq[Any](format.raw/*41.51*/("""
                            """),format.raw/*42.29*/("""<tr>
                                <th>Delete User</th>
                                
                                <th>Name</th>
                                <th>Email</th>
                            </tr>
                            
                          </thead>
                          <tbody>
                               
                                  <tr>
                                    <td align="center">
                                      
                                      <a href=""""),_display_(/*55.49*/routes/*55.55*/.AdminController.deleteCustomer(c.getEmail, filter)),format.raw/*55.106*/("""" class="fa fa-trash">
                                        <span class="btn btn-danger"></span>
                                    </td>
                                    <td>"""),_display_(/*58.42*/c/*58.43*/.getFirstName),format.raw/*58.56*/("""</td>            
                                    <td>"""),_display_(/*59.42*/c/*59.43*/.getEmail),format.raw/*59.52*/("""</td>
                                  </tr>
                                  
                                
                                </tbody>
                       
                      """)))}),format.raw/*65.24*/("""

                    """),format.raw/*67.21*/("""</table>
                      </div>
                      <a href=""""),_display_(/*69.33*/routes/*69.39*/.HomeController.addUser()),format.raw/*69.64*/("""" button="btn btn-primary"></a>                     
                    </div>
        
        </div></div></div>

        <div class="container">
            <div class="row">
            
           
            
                <div class="col-md-10 col-md-offset-1">
        
                    <div class="panel panel-default panel-table">
                      <div class="panel-heading">
                        <div class="row">
                          <div class="col col-xs-6">
                            <h3 class="panel-title">Currently Registered Customers</h3>
                          </div>
                          <div class="col col-xs-6 text-right">
                              <a href=""""),_display_(/*88.41*/routes/*88.47*/.HomeController.addProduct()),format.raw/*88.75*/("""">
                                  <button class="btn peach-gradient btn-rounded">Click here to add a new product</button>
                                </a>
                                                        
                          </div>
                        </div>
                      </div>
                      <div class="panel-body">
                          <table class="table table-striped table-bordered table-list">
                            <thead>
  
            <tr>
            
            <th>Product ID</th>
            
            <th>Product Price</th>
            
            <th>Description</th>
            <th>Qty</th>
            <th>Amount Sold</th>
        
            
            
            
            </tr>
            
            </thead>
            
            <tbody>
            
            
            """),_display_(/*119.14*/for(g<-productList) yield /*119.33*/{_display_(Seq[Any](format.raw/*119.34*/("""
            """),format.raw/*120.13*/("""<tr>
            
            <td>"""),_display_(/*122.18*/g/*122.19*/.getId),format.raw/*122.25*/("""</td>
            
            <td>"""),_display_(/*124.18*/g/*124.19*/.getPrice),format.raw/*124.28*/("""</td>
            
            <td>"""),_display_(/*126.18*/g/*126.19*/.getName),format.raw/*126.27*/("""</td>
            <td>"""),_display_(/*127.18*/g/*127.19*/.getStock),format.raw/*127.28*/("""</td>
            <td>"""),_display_(/*128.18*/g/*128.19*/.increaseSold(_)),format.raw/*128.35*/("""</td>
            
            <td>
             <a href=""""),_display_(/*131.24*/routes/*131.30*/.AdminController.deleteProduct(g.getId)),format.raw/*131.69*/("""" class="button-xs btn-primary">
                 <span class="glyphicon glyphicon-remove-circle"></span>
             </a>
            </td>
            <td>
              <a href=""""),_display_(/*136.25*/routes/*136.31*/.HomeController.updateProduct(g.getId)),format.raw/*136.69*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>



            </td>
                
        
            </tr>
        
        
        """)))}),format.raw/*148.10*/("""
            """),format.raw/*149.13*/("""</tbody>
            
            </table> 
            

  <div class="btn-toolbar">





    </div>







</div>
   </div>
  </div>
</div>
</div>











   <div class="container">
      <div class="row">
      
     
      
          <div class="col-md-10 col-md-offset-1">
  
              <div class="panel panel-default panel-table">
                <div class="panel-heading">
                  <div class="row">
                    <div class="col col-xs-6">
                      <h3 class="panel-title">Currently Registered Customers</h3>
                    </div>
                    <div class="col col-xs-6 text-right">
                        <a href=""""),_display_(/*198.35*/routes/*198.41*/.HomeController.addProduct()),format.raw/*198.69*/("""">
                            <button class="btn peach-gradient btn-rounded">Click here to add a new product</button>
                          </a>
                                                  
                    </div>
                  </div>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered table-list">
                      <thead>

      <tr>
      
      <th>Product ID</th>
      
      <th>Product Price</th>
      
      <th>Description</th>
      <th>Qty</th>
      
  
      
      
      
      </tr>
      
      </thead>
      
      <tbody>
      
      
      """),_display_(/*229.8*/for(g<-productList) yield /*229.27*/{_display_(Seq[Any](format.raw/*229.28*/("""
      """),format.raw/*230.7*/("""<tr>
      
      <td>"""),_display_(/*232.12*/g/*232.13*/.getId),format.raw/*232.19*/("""</td>
      
      <td>"""),_display_(/*234.12*/g/*234.13*/.getPrice),format.raw/*234.22*/("""</td>
      
      <td>"""),_display_(/*236.12*/g/*236.13*/.getName),format.raw/*236.21*/("""</td>
      <td>"""),_display_(/*237.12*/g/*237.13*/.getStock),format.raw/*237.22*/("""</td>
      
      <td>
       <a href=""""),_display_(/*240.18*/routes/*240.24*/.AdminController.deleteProduct(g.getId)),format.raw/*240.63*/("""" class="button-xs btn-primary">
           <span class="glyphicon glyphicon-remove-circle"></span>
       </a>
      </td>
      <td>
        <a href=""""),_display_(/*245.19*/routes/*245.25*/.HomeController.updateProduct(g.getId)),format.raw/*245.63*/("""" class="button-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>



      </td>
          
  
      </tr>
  
  
  """)))}),format.raw/*257.4*/("""
      """),format.raw/*258.7*/("""</tbody>
      
      </table> 
      





    </div>
  </div>
</div>
</div>
</div>











































""")))}))
      }
    }
  }

  def render(productList:List[models.Product],customerList:List[models.users.Customer],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(productList,customerList,user,filter)

  def f:((List[models.Product],List[models.users.Customer],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (productList,customerList,user,filter) => apply(productList,customerList,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:18:51 IST 2018
                  SOURCE: /media/sf_student/Finished/year2project/year2project/app/views/adminControl.scala.html
                  HASH: dd07268ab560c14a16238c9723a393bbd3277667
                  MATRIX: 1022->2|1235->122|1263->125|1313->167|1351->168|1396->186|2016->779|2031->785|2077->810|2615->1321|2652->1342|2691->1343|2748->1372|3305->1902|3320->1908|3393->1959|3603->2142|3613->2143|3647->2156|3733->2215|3743->2216|3773->2225|4006->2427|4056->2449|4153->2519|4168->2525|4214->2550|4959->3268|4974->3274|5023->3302|5923->4174|5959->4193|5999->4194|6041->4207|6104->4242|6115->4243|6143->4249|6207->4285|6218->4286|6249->4295|6313->4331|6324->4332|6354->4340|6405->4363|6416->4364|6447->4373|6498->4396|6509->4397|6547->4413|6634->4472|6650->4478|6711->4517|6922->4700|6938->4706|6998->4744|7238->4952|7280->4965|7980->5637|7996->5643|8046->5671|8743->6341|8779->6360|8819->6361|8854->6368|8905->6391|8916->6392|8944->6398|8996->6422|9007->6423|9038->6432|9090->6456|9101->6457|9131->6465|9176->6482|9187->6483|9218->6492|9287->6533|9303->6539|9364->6578|9545->6731|9561->6737|9621->6775|9806->6929|9841->6936
                  LINES: 28->2|33->3|35->5|35->5|35->5|46->16|60->30|60->30|60->30|71->41|71->41|71->41|72->42|85->55|85->55|85->55|88->58|88->58|88->58|89->59|89->59|89->59|95->65|97->67|99->69|99->69|99->69|118->88|118->88|118->88|149->119|149->119|149->119|150->120|152->122|152->122|152->122|154->124|154->124|154->124|156->126|156->126|156->126|157->127|157->127|157->127|158->128|158->128|158->128|161->131|161->131|161->131|166->136|166->136|166->136|178->148|179->149|228->198|228->198|228->198|259->229|259->229|259->229|260->230|262->232|262->232|262->232|264->234|264->234|264->234|266->236|266->236|266->236|267->237|267->237|267->237|270->240|270->240|270->240|275->245|275->245|275->245|287->257|288->258
                  -- GENERATED --
              */
          