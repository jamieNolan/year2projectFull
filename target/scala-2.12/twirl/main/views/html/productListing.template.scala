
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

object productListing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.Product,models.users.User,play.api.Environment,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: models.Product,user: models.users.User,e: play.api.Environment, filter:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Product Listing",user, filter)/*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""
    """),format.raw/*4.5*/("""<br>
    <br>
   
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3">
                <div id="imaginary_container"> 
                    <div class="input-group stylish-input-group input-append">
                        <form action=""""),_display_(/*12.40*/routes/*12.46*/.HomeController.search()),format.raw/*12.70*/("""" method"GET">
                        <input type="text" class="form-control" name="filter" value=""""),_display_(/*13.87*/filter),format.raw/*13.93*/("""" placeholder="Search">
                          </form>
                      
                        <span class="input-group-addon">
                            <button type="submit">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>  
                        </span>
                    </div>
                </div>
            </div>
      </div>
    </div>
    <div class="container-fluid">
        <div class="content-wrapper">	
            <div class="item-container">	
                <div class="container">	
                    <div class="col-md-12">
                            <div class="autoFit">
                        <div class="product col-md-3 service-image-left">
                        
                            <center>
                        
                                          
                      """),_display_(/*37.24*/if(e.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*37.99*/ {_display_(Seq[Any](format.raw/*37.101*/("""
                        """),format.raw/*38.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*38.69*/(p.getId + ".jpg")),format.raw/*38.87*/(""""/></td>
                    """)))}/*39.23*/else/*39.28*/{_display_(Seq[Any](format.raw/*39.29*/("""
                        """),format.raw/*40.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*41.22*/("""            
                
                            """),format.raw/*43.29*/("""</center>
                        </div>
                        
                    </div>
                   
                        
                    <div class="col-md-7">
                        <div class="product-title"><p>Name: """),_display_(/*50.62*/p/*50.63*/.getName),format.raw/*50.71*/(""" """),format.raw/*50.72*/("""</p></div>
                        <div class="product-desc"><p>Description: """),_display_(/*51.68*/p/*51.69*/.getDescription),format.raw/*51.84*/("""</p></div>
                        <div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
                        <hr>
                        <div class="product-price"><p>Price:  €"""),_display_(/*54.65*/("%.2f".format(p.getPrice))),format.raw/*54.92*/("""</p></div>
                        <div class="product-stock"><p>Stock: """),_display_(/*55.63*/p/*55.64*/.getStock),format.raw/*55.73*/(""" """),format.raw/*55.74*/("""</p></div>
                        
                        
                        <hr>
                        <div class="btn-group cart">
                            <a href=""""),_display_(/*60.39*/routes/*60.45*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*60.79*/(""""button type="button" class="btn btn-success">
                                Add to cart 
                            </button></a>
                        </div>
                       
                    </div>
                </div> 
            </div>



            <a href=""""),_display_(/*71.23*/routes/*71.29*/.ShoppingCtrl.addComment(p.getId,"")),format.raw/*71.65*/("""">
                    <button class="btn btn-primary">Submit a review.</button>
            </a>




        
            <div class="container-fluid">		
                <div class="col-md-12 product-info">
                        <ul id="myTab" class="nav nav-tabs nav_tabs">
                             <li><a href="#service-three" data-toggle="tab">Comments</a>
                            """),_display_(/*83.30*/for(g<-p.getComments()) yield /*83.53*/{_display_(Seq[Any](format.raw/*83.54*/("""
                                """),format.raw/*84.33*/("""<p>Review:  """),_display_(/*84.46*/g/*84.47*/.getCommenting),format.raw/*84.61*/("""             """),format.raw/*84.74*/("""</p>





                            """)))}),format.raw/*90.30*/("""
                            
                         
                            
                            







                            """),format.raw/*102.29*/("""</li>
                            

                        </ul>
                    
                           

                        </div>
                        <div class="tab-pane fade" id="service-three">
                                                    
                        </div>
                    </div>
                    <hr>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*119.2*/("""
"""))
      }
    }
  }

  def render(p:models.Product,user:models.users.User,e:play.api.Environment,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(p,user,e,filter)

  def f:((models.Product,models.users.User,play.api.Environment,String) => play.twirl.api.HtmlFormat.Appendable) = (p,user,e,filter) => apply(p,user,e,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:24:02 IST 2018
                  SOURCE: /media/sf_student/Finished/year2project/year2project/app/views/productListing.scala.html
                  HASH: 87971c6444643ac6b2209bdfd4c2b3f59b514e49
                  MATRIX: 1011->1|1187->84|1214->86|1258->122|1296->123|1327->128|1643->417|1658->423|1703->447|1831->548|1858->554|2797->1466|2881->1541|2922->1543|2975->1568|3046->1612|3085->1630|3134->1661|3147->1666|3186->1667|3239->1692|3354->1776|3440->1834|3709->2076|3719->2077|3748->2085|3777->2086|3882->2164|3892->2165|3928->2180|4275->2500|4323->2527|4423->2600|4433->2601|4463->2610|4492->2611|4700->2792|4715->2798|4770->2832|5081->3116|5096->3122|5153->3158|5576->3554|5615->3577|5654->3578|5715->3611|5755->3624|5765->3625|5800->3639|5841->3652|5911->3691|6089->3840|6543->4263
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|43->12|43->12|43->12|44->13|44->13|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|74->43|81->50|81->50|81->50|81->50|82->51|82->51|82->51|85->54|85->54|86->55|86->55|86->55|86->55|91->60|91->60|91->60|102->71|102->71|102->71|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|121->90|133->102|150->119
                  -- GENERATED --
              */
          