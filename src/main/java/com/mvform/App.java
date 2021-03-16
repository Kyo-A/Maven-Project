package com.mvform;

import org.joda.time.LocalTime;
import org.jsoup.Jsoup;

import com.entities.Greeter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String htmlText = "<h1>Hello World!</h1>";
    	System.out.println(htmlText);
    	
    	System.out.println(Jsoup.parse(htmlText).text());
    	
    	// 1- Declarer et initiliser une nouvelle variable, puis l afficher en console
    	// Puis "re-packager" votre application et constatez (Gestion cycle de vie)
    	
    	String car = "Renault";
    	System.out.println(car);
    	
    	// 2- Déclarez la nouvelle dépendance suivante :
    	
    	LocalTime currentTime = new LocalTime();
    	System.out.println("Il est " + currentTime);
    	
    	Greeter greeter = new Greeter();
    	System.out.println(greeter.sayHello());
    	
    	
    }
}
