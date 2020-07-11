# FXFreebitcoAutoplay
FX Browser to autoplay multiply BTC on freebitco.in website.

This is a simple example project to show how to implement a way to execute a usefull script on a JavaFX WebView.

In this example you will be able to autoclaim satoshis every hour. The logic is simple, you need to login to your freebitco.in account from this app, and once login you have to click start to start autoclaim every hour. Once the program is started it will reload the page when the countdown arrives 0 seconds (actually there are 2 reloads as freebitco.in refresh the page automatically). This first  reload is followed by a second one triggered by this software and after it the softare clicks the claim button to add money to your account.


Compilation
      Clone the project
	  Execute maven build: "mvn clean install"

Run app:
     java -jar FXFreebitcoAutoplay-jar-with-dependencies.jar

Requeriments
     Java version: 1.8+ (if using openjdk javafx api is needed to run the app).
     
Also, as this is an OpenSource GNU GPL solution, feel free to adapt it to any other faucets like freebitco.in, as it is only needed to add the script and bit of work on the view controller. Its also possible to change the play approach by changing the script content

You can send any donation to my wallet address 36FgUzZHPmy7DBanQZKmYUVi9c44iu6g8q .

And you can start earning on freebitco.in on this url https://freebitco.in/?r=4047796

<a href="https://www.buymeacoffee.com/kikovalle" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-blue.png" alt="Buy Me A Coffee" style="height: 51px !important;width: 217px !important;" ></a>

