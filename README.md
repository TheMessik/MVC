# Model-View-Controller, explained simply with an example

The Model-View-Controller (MVC) paradigm is a simple tool to help structure
your code better, using listeners to react to changes in the data dynamically

## The flow
The flow of the application is as follows:

The Model stores the data present in the program. In this case, we shall store
a number, which shall be displayed to the screen. 
The Model provides methods to access and change the data

The View listens for changes in the Model using listeners and reacts accordingly

The Controller handles the interaction between the user and the program.
It sets up listeners for events in the view and propagates any changes to the model

So, the view looks at the model and constructs itself based on the data stored there, the controller looks at the model and decides what to do with different user interactions
(press of a button, change in input field...)

## Source code

JavaFX is required for this project to compile.

For those of you who don't feel like downloading an entire project, I've added the MVC.jar, so you can see the code in action (I still recommend compiling the code yourself tho)

Download the [MVC.jar](MVC.jar), go in your terminal to that location and call
`java -jar MVC.jar`

In case of questions, contact me at jozefj44@gmail.com
