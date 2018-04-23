
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Customer,models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer,user : models.users.User,filter:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Search",user, filter)/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
    """),format.raw/*5.5*/("""<div class="col-md-12">
		"""),_display_(/*6.4*/if(flash.containsKey("success"))/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
			  """),format.raw/*7.6*/("""<div class="alert alert-success">
			      """),_display_(/*8.11*/flash/*8.16*/.get("success")),format.raw/*8.31*/("""
			  """),format.raw/*9.6*/("""</div>
		""")))}),format.raw/*10.4*/(""" 

		
               
                    """),format.raw/*14.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*15.22*/for(o <- customer.getOrders()) yield /*15.52*/ {_display_(Seq[Any](format.raw/*15.54*/("""

                        """),format.raw/*17.25*/("""<p>Order Number: """),_display_(/*17.43*/o/*17.44*/.getId()),format.raw/*17.52*/("""</p>
                        <p>Order Date: """),_display_(/*18.41*/o/*18.42*/.getOrderDateString()),format.raw/*18.63*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*32.26*/for(i <- o.getItems()) yield /*32.48*/ {_display_(Seq[Any](format.raw/*32.50*/("""

                        """),format.raw/*34.25*/("""<tr>
                        <td>"""),_display_(/*35.30*/i/*35.31*/.getId),format.raw/*35.37*/("""</td>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName()),format.raw/*36.52*/("""</td>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getQuantity()),format.raw/*37.45*/("""</td>
                        <td>&euro; """),_display_(/*38.37*/("%.2f".format(i.getPrice()))),format.raw/*38.66*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getItemTotal))),format.raw/*39.68*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*42.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*48.68*/("%.2f".format(o.getOrderTotal))),format.raw/*48.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*52.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>
         """)))}),format.raw/*56.11*/("""<!-- End of For loop -->
       
        </div>



""")))}),format.raw/*62.2*/("""
















"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,filter)

  def f:((models.users.Customer,models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,filter) => apply(customer,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:18:52 IST 2018
                  SOURCE: /media/sf_student/Finished/year2project/year2project/app/views/viewOrders.scala.html
                  HASH: 9744b20c4da3ddf754aa9de8da35e18e6c2364e4
                  MATRIX: 993->1|1138->75|1195->104|1222->106|1257->133|1295->134|1326->139|1378->166|1418->198|1457->200|1489->206|1559->250|1572->255|1607->270|1639->276|1679->286|1749->328|1859->411|1905->441|1945->443|1999->469|2044->487|2054->488|2083->496|2155->541|2165->542|2207->563|2839->1168|2877->1190|2917->1192|2971->1218|3032->1252|3042->1253|3069->1259|3131->1294|3141->1295|3183->1316|3245->1351|3255->1352|3290->1366|3359->1408|3409->1437|3478->1479|3530->1510|3639->1588|3870->1792|3924->1824|4035->1908|4050->1914|4107->1950|4251->2063|4333->2115
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|45->14|46->15|46->15|46->15|48->17|48->17|48->17|48->17|49->18|49->18|49->18|63->32|63->32|63->32|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|70->39|70->39|73->42|79->48|79->48|83->52|83->52|83->52|87->56|93->62
                  -- GENERATED --
              */
          