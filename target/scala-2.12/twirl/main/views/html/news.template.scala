
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

object news extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<!doctype html>

<html>
<head>
    							<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href=""""),_display_(/*15.14*/routes/*15.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.61*/("""" rel="stylesheet">
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.versioned("javascripts/script.js")),format.raw/*16.63*/(""""></script>

<meta charset="UTF-8">

<title> TGN </title>
</head>
<body>
        
        <nav>
                <a href="/">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="/"><img src="assets/images/tgn.png" alt="tgn"></a>
            
       
    </a>
    </nav>
 
    <ul>
             
        <li><a href="/support">Support</a></li>
        <li><a href="/reviews">Reviews</a></li>
        <li><a href="/news"class='active-page'>News</a></li>
        <li><a href="/videos">Videos</a></li>
        </ul>

<H1> Gaming News </H1>
<h2>Check Out What's Trending!</h2>
<div>
<h3>Microsoft announces more backwards compatible Games for Xbox ONE
    </h3>
    <div class="img">
    
        <img src="assets/images/xbox.jpg" alt="xbox Logo">
    

    <div>
    <P>In the news this week, Microsoft had announced that they had more backwards compatible
        plans for their console and that they would be revealing them on their "Inside Xbox" live stream.
        In our opinion, they did not disappoint with great classic titles being announced.
        Such titles include:<br>
        <br>
        <strong>
            Destroy All Humans:
        </strong>
        <br> 
            
            Destroy All Humans puts you in the shoes of an extraterrestrial Alien tasked 
            with causing all sorts of Havoc on Planet Earth. With its open world, free roam environment, it wouldn't be considered a chore
            to pick up this classic again <br>
        <br>
       <strong> 
           Conker: Live and Reloaded:
         </strong>
         <br>

            This classic platformer, which is a remastered version of the Nintendo 64 title tells the story of Conker. 
            An orange squirrel that only wants to get back to his home after a bad night out.
            Don't Let this game's "cutsey" style throw you off though, it was given an "M" rating for a reason!
            <br>
        <br>

        <strong>
            Elder Scrolls III: Morrowind
        </strong>
        <br>
            A title that is debatedly Bethesda's breakthrough game in the Open world
            RPG Genre with a medieval mythical setting. It contains character customisation
            to immerse the player in a world of knights, magic and demons.
            Not to mention that this game led the developers to more critically acclaimed
            games, spanning two sequels and the highly praised Fallout Francise! 
            <br>
        <br>
        </P>
        <div>
        <h3> Epic Games introduces "Controversial" new item for Fortnite Battle Royale</h3>
        <img src="assets/images/fortnite.jpg" alt="fortnite thumbnail">
        <P>
            An update for Fortnite: Battle Royale has finally rolled out which contains a new throwable item named
            <strong>"port-a-fort"</strong>. This lets the player instantly build a fort to protect themselves from enemy fire
            which, in a pinch, can prove useful but could diminish overall skill from the game. 

        </P>
        <div>
            <h3>Overkill's The Walking Dead gets a new character story trailer</h3>
            <img src="assets/images/walkingdead.jpg" alt="Maya The Walking Dead" >
        <p>
                Released earlier in the week, the new trailer of <strong>Overkill's The Walking Dead</strong> is Nothing Short of Atmospheric.
                The new trailer is focused on <strong>Maya</strong>. A former Hospital nurse who, by the looks of things, had to defend herself
                against a horde of walkers from day 1 and has had to make some rash and hard decisions for her survival.<br>
                <br>
                With two characters already revealed, hopefully within the coming months, we can expect more characters to be on the horizon
                <strong>Overkills the Walking Dead</strong> is a four player co-op game that plunges the player in a the universe of Robert Kirkmans <strong>The Walking Dead</strong>.
                Set in Washington D.C, Fear the Dead and Fight the living as in a torn up world, nobody can be trusted.<br>
                <br>
               <strong>Overkills' The Walking Dead</strong> will hit store shelves and be available for digital download in Fall '18
        </p>
        <iframe width="560" height="315" src="https://www.youtube.com/embed/-0J8we7aa-A" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
    </div>
        </div>
            </div>
                </div>
           
        <footer>
            <p>Second Year Project:
            Alan Kelly Anthony Koleoso
            </a></p>
          </footer>
        """))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 16:49:23 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/news.scala.html
                  HASH: dacb8f2bbfec3cd5d07cfe9faaafb5daa7563682
                  MATRIX: 958->1|1078->26|1108->30|1588->483|1603->489|1665->530|1727->565|1742->571|1805->613
                  LINES: 28->1|33->1|35->3|47->15|47->15|47->15|48->16|48->16|48->16
                  -- GENERATED --
              */
          