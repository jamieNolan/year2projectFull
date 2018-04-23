
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.users.Login],List[models.Product],models.users.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],products: List[models.Product],user : models.users.User, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.111*/(""" """),_display_(/*1.113*/main("Home",user,
filter)/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""

"""),format.raw/*4.1*/("""<div id="myCarousel" class="carousel slide" data-interval="false">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>
  <div class="carousel-inner">
    <div class="item active">
      <img src="http://www.gsfdcy.com/data/img/34/1510311-furniture-wallpaper.jpg" style="width:100%" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
          <div class="col-md-12">
            <div class="col-md-6">
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <a class="btn btn-lg btn-primary site-btn  style=" background-color:transparent " " href=""""),_display_(/*29.106*/routes/*29.112*/.HomeController.LivingRoom()),format.raw/*29.140*/("""">View Living Room</a>
            </div>
            </a>
          </div>
          </a>

        </div>
      </div>
    </div>
    <div class="item">
      <img src="http://wallpaperstock.net/kitchen-in-red_wallpapers_17619_2560x1440.jpg" style="width:100%" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
          <div class="col-md-12">
            <div class="col-md-6">
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <a class="btn btn-lg btn-primary site-btn  style=" background-color:transparent " " href=""""),_display_(/*54.106*/routes/*54.112*/.HomeController.Kitchen()),format.raw/*54.137*/("""">View Kitchen </a>

              <h1> </h1>
              </a>
              <h3></h3>
            </div>

          </div>

        </div>
      </div>
    </div>
    <div class="item">
      <img src="https://wallpaperstock.net/bedroom-design-wallpapers_25540_1920x1080.jpg" style="width:100%" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
          <div class="col-md-12">
            <div class="col-md-6">
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <a class="btn btn-lg btn-primary site-btn  style=" background-color:transparent " " href=""""),_display_(/*82.106*/routes/*82.112*/.HomeController.Bedroom()),format.raw/*82.137*/("""">View BedRoom</a>

              </a>
            </div>
          </div>

        </div>
      </div>
    </div>

    <div class="item">
      <img src="http://vivianliving.com/wp-content/uploads/2016/09/bath.jpg" style="width:100%" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
          <div class="col-md-12">
            <div class="col-md-6">
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <br> </br>
              <a class="btn btn-lg btn-primary site-btn  style=" background-color:transparent " " href=""""),_display_(/*108.106*/routes/*108.112*/.HomeController.Bathroom()),format.raw/*108.138*/("""">View Bathroom </a>

              </a>
              </a>
            </div>

          </div>

        </div>
      </div>
    </div>






  </div>


  <!-- Controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="icon-prev"></span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="icon-next"></span>
  </a>
</div>
<br></br>
<br></br>







<div class="container">









  <div class="col-md-3">


    <a href=""""),_display_(/*158.15*/routes/*158.21*/.HomeController.LivingRoom()),format.raw/*158.49*/("""">
      <img src="https://wallpaperstock.net/clean-and-modern-living-room-wallpapers_42470_1920x1080.jpg" alt="Lights" style="width:100%">
    </a>
    <div class="caption">
      <p>Our living room furtnite is made with the upmost care and best materials you will find at a great price.</p>
    </div>



  </div>

  <div class="col-md-3">
    <a href=""""),_display_(/*170.15*/routes/*170.21*/.HomeController.Kitchen()),format.raw/*170.46*/("""">

      <img src="https://wallpaperstock.net/apartment-1-wallpapers_12687_1920x1080.jpg" alt="Lights" style="width:100%">
    </a>



    <p>Our kitchens are made in the highest quality marble and wood.</p>


  </div>


  <div class="col-md-3">
    <a href=""""),_display_(/*184.15*/routes/*184.21*/.HomeController.Bedroom()),format.raw/*184.46*/("""">

      <img src="https://wallpaperstock.net/wallpapers/thumbs1/28908hd.jpg" alt="Lights" style="width:100%">
    </a>

    <div class="caption">

      <p>Our beds and furtniture are made from the highest quality wood and the most comfortable jersey.</p>

    </div>

  </div>

  <div class="col-md-3">


    <a href=""""),_display_(/*200.15*/routes/*200.21*/.HomeController.Bathroom()),format.raw/*200.47*/("""">
      <img src="http://drabtofabdesign.com/wp-content/uploads/2018/02/Modern-bathroom-designs-and-ideas-Setup-Modern-bathroom-in-budget.jpg"
        alt="Lights" style="width:100%">
    </a>
    <div class="caption">

      <p>Our bathrooms will give a sheen to any new or existing home at a quality price.</p>


    </div>

  </div>




  <br></br>
  <br></br>
  <br></br>
  <br></br>






  <br></br>
  <br></br>
  <br></br>
  <br></br>



  <div id="googleMap" style="height:400px;width:100%;"></div>
  <script>
    function myMap() """),format.raw/*235.22*/("""{"""),format.raw/*235.23*/("""
      """),format.raw/*236.7*/("""var myCenter = new google.maps.LatLng(53.291058, -6.362994);
      var mapProp = """),format.raw/*237.21*/("""{"""),format.raw/*237.22*/("""
        """),format.raw/*238.9*/("""center: myCenter,
        zoom: 12,
        scrollwheel: false,
        draggable: false,
        mapTypeId: google.maps.MapTypeId.ROADMAP
      """),format.raw/*243.7*/("""}"""),format.raw/*243.8*/(""";
      var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
      var marker = new google.maps.Marker("""),format.raw/*245.43*/("""{"""),format.raw/*245.44*/("""
        """),format.raw/*246.9*/("""position: myCenter
      """),format.raw/*247.7*/("""}"""),format.raw/*247.8*/(""");
      marker.setMap(map);
    """),format.raw/*249.5*/("""}"""),format.raw/*249.6*/("""
  """),format.raw/*250.3*/("""</script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAy_YIP24mmAQLnPuN40Zo-ib9vLIgaVsc&callback=myMap"></script>
  """)))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],products:List[models.Product],user:models.users.User,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,products,user,filter)

  def f:((Form[models.users.Login],List[models.Product],models.users.User,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,products,user,filter) => apply(loginForm,products,user,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 21:18:51 IST 2018
                  SOURCE: /media/sf_student/Finished/year2project/year2project/app/views/home.scala.html
                  HASH: 54b4b697db43891640217480e1d3b8b232d1eae2
                  MATRIX: 1011->1|1216->110|1245->112|1277->137|1316->139|1344->141|2428->1197|2444->1203|2494->1231|3298->2007|3314->2013|3361->2038|4201->2850|4217->2856|4264->2881|5042->3630|5059->3636|5108->3662|5651->4177|5667->4183|5717->4211|6101->4567|6117->4573|6164->4598|6453->4859|6469->4865|6516->4890|6866->5212|6882->5218|6930->5244|7499->5784|7529->5785|7564->5792|7674->5873|7704->5874|7741->5883|7914->6028|7943->6029|8100->6157|8130->6158|8167->6167|8220->6192|8249->6193|8310->6226|8339->6227|8370->6230
                  LINES: 28->1|33->1|33->1|34->2|34->2|36->4|61->29|61->29|61->29|86->54|86->54|86->54|114->82|114->82|114->82|140->108|140->108|140->108|190->158|190->158|190->158|202->170|202->170|202->170|216->184|216->184|216->184|232->200|232->200|232->200|267->235|267->235|268->236|269->237|269->237|270->238|275->243|275->243|277->245|277->245|278->246|279->247|279->247|281->249|281->249|282->250
                  -- GENERATED --
              */
          