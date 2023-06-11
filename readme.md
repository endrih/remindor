This is a simple spring-boot application with an integrated Angular frontend. The frontend lives inside the client folder, 
while the server part lives under the server folder.
The client builds its output to the static content folder of the server, from where it is served.

On the server side, the /api... paths are served from the controllers, while the rest are re-routed to Angular for handling. 
In order to avoid having to create a special handler to enable Angular routing, the Angular routes use useHash=true, 
"#" as part of the path. This seems to work well. 

For now, this is intended as just a starting template with no specific functionality included.
