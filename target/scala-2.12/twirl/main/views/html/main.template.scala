
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
/*7.2*/import helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,models.users.User,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(title: String,user : models.users.User, filter: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">

   <head>
           <link rel="stylesheet" href=""""),_display_(/*15.42*/routes/*15.48*/.Assets.versioned("bootsrap/css/bootstrap.min.css")),format.raw/*15.99*/("""" >
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
       <title>"""),_display_(/*20.16*/title),format.raw/*20.21*/("""</title>
       <link rel="stylesheet" media="screen" href=""""),_display_(/*21.53*/routes/*21.59*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.100*/("""">
       <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.58*/routes/*22.64*/.Assets.versioned("images/favicon.png")),format.raw/*22.103*/("""">
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
       
   </head>
   <div class="container">
           <nav class="navbar navbar-icon-top navbar-default navbar-fixed-top">
               <div class="container-fluid">
                   <!-- Brand and toggle get grouped for better mobile display -->
                   <div class="navbar-header">
                       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                           <span class="sr-only">Toggle navigation</span>
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                           <span class="icon-bar"></span>
                       </button>
                       <a class="navbar-brand" href=""""),_display_(/*37.55*/routes/*37.61*/.HomeController.Home("")),format.raw/*37.85*/("""">Furniture Co</a>
                   </div>
                   <!-- Collect the nav links, forms, and other content for toggling -->
                   <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                       <ul class="nav navbar-nav">
                           <li><a href=""""),_display_(/*42.42*/routes/*42.48*/.HomeController.Home("")),format.raw/*42.72*/("""">Home <span class="sr-only">(current)</span></a></li>
             

                           <li class="dropdown">
                               <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Products<span class="caret"></span></a>
                               <ul class="dropdown-menu">
                                   <li><a href=""""),_display_(/*48.50*/routes/*48.56*/.HomeController.Bathroom()),format.raw/*48.82*/("""">Bathroom</a></li>
                                   <li><a href=""""),_display_(/*49.50*/routes/*49.56*/.HomeController.Kitchen()),format.raw/*49.81*/("""">Kitchen</a></li>
                                   <li><a href=""""),_display_(/*50.50*/routes/*50.56*/.HomeController.Bedroom()),format.raw/*50.81*/("""">Bedroom</a></li>
                                   <li><a href=""""),_display_(/*51.50*/routes/*51.56*/.HomeController.LivingRoom()),format.raw/*51.84*/("""">Living room</a></li>
                               </ul>
                           </li>
                       </ul>
                       
                       <ul class="nav navbar-nav navbar-right">
                          
                        <ul class="nav navbar-nav navbar-right">
                                <li><a href=""""),_display_(/*59.47*/routes/*59.53*/.HomeController.search(0,filter)),format.raw/*59.85*/(""""> 
                                        <span class="glyphicon glyphicon-search"></span>                           </a></li>
                              <li>
                                    """),_display_(/*62.38*/if(user!=null)/*62.52*/{_display_(Seq[Any](format.raw/*62.53*/("""
                                        """),format.raw/*63.41*/("""<a href=""""),_display_(/*63.51*/routes/*63.57*/.ShoppingCtrl.showBasket()),format.raw/*63.83*/("""">
                                                <span class="glyphicon glyphicon-shopping-cart"></span>
                                              </a>
                                       """)))}/*66.41*/else/*66.45*/{_display_(Seq[Any](format.raw/*66.46*/("""
            
                                       """)))}),format.raw/*68.41*/("""

                              """),format.raw/*70.31*/("""</li>

                           <li class="dropdown">
                               
                               <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                   <i class="fa fa-user-circle-o"></i>
                                   Account <span class="caret"></span>
                               </a>

                               <ul class="dropdown-menu">
                                   
                                   
                                    
                                   <li  """),_display_(/*83.42*/if(title=="Login")/*83.60*/{_display_(Seq[Any](format.raw/*83.61*/("""class="active"""")))}),format.raw/*83.76*/(""">
                                       """),_display_(/*84.41*/if(user!=null)/*84.55*/{_display_(Seq[Any](format.raw/*84.56*/("""
                                   """),format.raw/*85.36*/("""<a href=""""),_display_(/*85.46*/routes/*85.52*/.LoginController.logout()),format.raw/*85.77*/("""">Logout </a>
                                   <a href=""""),_display_(/*86.46*/routes/*86.52*/.AdminController.adminControl()),format.raw/*86.83*/("""">Administrator Settings</a>
                                   """)))}/*87.37*/else/*87.41*/{_display_(Seq[Any](format.raw/*87.42*/("""
                                       """),format.raw/*88.40*/("""<a href=""""),_display_(/*88.50*/routes/*88.56*/.LoginController.login()),format.raw/*88.80*/("""">Login</a>
                                   """)))}),format.raw/*89.37*/("""                           
                               

                                   """),_display_(/*92.37*/if(user != null)/*92.53*/{_display_(Seq[Any](format.raw/*92.54*/("""
                                  
                                   
                                   """)))}/*95.37*/else/*95.41*/{_display_(Seq[Any](format.raw/*95.42*/("""
                                    """),format.raw/*96.37*/("""<li role="separator" class="divider"></li>
                                    <li><a href=""""),_display_(/*97.51*/routes/*97.57*/.HomeController.addCustomer()),format.raw/*97.86*/("""">Register </a></li>
                                   """)))}),format.raw/*98.37*/("""

                                   
                                 

                               """),format.raw/*103.32*/("""</ul>
                           </li>
                       </ul>
                   </div><!-- /.navbar-collapse -->
               </div><!-- /.container-fluid -->
           </nav>
       </div>
   <body>
"""),_display_(/*111.2*/content),format.raw/*111.9*/("""



         

       """),format.raw/*117.8*/("""<script src=""""),_display_(/*117.22*/routes/*117.28*/.Assets.versioned("javascripts/main.js")),format.raw/*117.68*/("""" type="text/javascript"></script>
   </body>
   <div class="push"></div>
</div>

<div class="footer" id="footer">
    <div class="container">
    
            <hr/>        
            <div class="row">
                <div class="col-sm-6">Furniture Co Footer</div>
                <div class="col-sm-6 ">
                        <a href="facebook" class="fa fa-facebook"></a>
                        <a href="twitter" class="fa fa-twitter"></a>
                    </div>
            </div> 
        </div>
        

</footer>


</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,filter:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,filter)(content)

  def f:((String,models.users.User,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,filter) => (content) => apply(title,user,filter)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:18:52 IST 2018
                  SOURCE: /media/sf_student/Finished/year2project/year2project/app/views/main.scala.html
                  HASH: 04676065500768d4840ab9ea76ce120f1e94d604
                  MATRIX: 651->7|1000->24|1165->96|1194->98|1306->183|1321->189|1393->240|1812->632|1838->637|1926->698|1941->704|2004->745|2091->805|2106->811|2167->850|3121->1777|3136->1783|3181->1807|3526->2125|3541->2131|3586->2155|4026->2568|4041->2574|4088->2600|4184->2669|4199->2675|4245->2700|4340->2768|4355->2774|4401->2799|4496->2867|4511->2873|4560->2901|4935->3249|4950->3255|5003->3287|5231->3488|5254->3502|5293->3503|5362->3544|5399->3554|5414->3560|5461->3586|5678->3784|5691->3788|5730->3789|5815->3843|5875->3875|6525->4498|6552->4516|6591->4517|6637->4532|6706->4574|6729->4588|6768->4589|6832->4625|6869->4635|6884->4641|6930->4666|7016->4725|7031->4731|7083->4762|7167->4827|7180->4831|7219->4832|7287->4872|7324->4882|7339->4888|7384->4912|7463->4960|7587->5057|7612->5073|7651->5074|7778->5182|7791->5186|7830->5187|7895->5224|8015->5317|8030->5323|8080->5352|8168->5409|8301->5513|8539->5724|8567->5731|8617->5753|8659->5767|8675->5773|8737->5813
                  LINES: 24->7|29->8|34->9|36->11|40->15|40->15|40->15|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|62->37|62->37|62->37|67->42|67->42|67->42|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|75->50|76->51|76->51|76->51|84->59|84->59|84->59|87->62|87->62|87->62|88->63|88->63|88->63|88->63|91->66|91->66|91->66|93->68|95->70|108->83|108->83|108->83|108->83|109->84|109->84|109->84|110->85|110->85|110->85|110->85|111->86|111->86|111->86|112->87|112->87|112->87|113->88|113->88|113->88|113->88|114->89|117->92|117->92|117->92|120->95|120->95|120->95|121->96|122->97|122->97|122->97|123->98|128->103|136->111|136->111|142->117|142->117|142->117|142->117
                  -- GENERATED --
              */
          