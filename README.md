# FXFreebitcoAutoplay
FX Browser to autoplay multiply BTC on freebitco.in website.

This is a simple example project to show how to implement a way to execute a usefull script on a JavaFX WebView.
In this case the script implements a "Double when lose, minimum when win approach to earn BTC on a fair probability game". This will not ensure to make money as you need to have enogh funds to cover the worse possible case.

My tests tells me that with about 300.000 satoshis we can achieve a secure game autoplay betting the minimum amount of 1 Satoshi. This will not report bit benefits (about 2.000 or 3.000 satoshis per hour as average) but will not make you lose everything.

The parameters of game used in tests:
       BET AMOUNT: 0.00000001
	   PAYOUT: 2.00

Compilation
      Clone the project
	  Execute maven build: "mvn clean install"

Run app:
     java -jar FXFreebitcoAutoplay-jar-with-dependencies.jar

Requeriments
     Java version: 1.8+ (if using openjdk javafx api is needed to run the app).
     
Also, as this is an OpenSource GNU GPL solution, feel free to adapt it to any other faucets like freebitco.in, as it is only needed to add the script and bit of work on the view controller. Its also possible to change the play approach by changing the script content

You can send any donation to my wallet address 15nfsqNbUCUgtmKyhXaUa2PytoCuryiDEZ .

And you can start earning on freebitco.in on this url https://freebitco.in/?r=4047796



