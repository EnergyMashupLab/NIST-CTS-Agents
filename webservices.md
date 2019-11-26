Controller and Model Class for Restful Web Services

REST API
An API is an application programming interface. It is a set of rules that allow programs to talk to each other. The developer creates the API on the server and allows the client to talk to it.

REST determines how the API looks like. It stands for “Representational State Transfer”. It is a set of rules that developers follow when they create their API. One of these rules states that you should be able to get a piece of data when you link to a specific URL.

Each URL is called a request while the data sent back to you is called a response.
A request is made up of four things:
•	The endpoint
•	The method
•	The headers
•	The data (or body)

End-point structure
root-endpoint/?
The root-endpoint is the starting point of the API you’re requesting from. The path determines the resource you’re requesting for.

Controller Class
Controller receives HTTP requests from the Spring front controller and simply delegates them forward to a service layer.

Spring Boot annotations for handling different HTTP request types
•	@RequestMapping — For handling any request type
•	@GetMapping — GET request
•	@PostMapping — POST request
•	@PutMapping — PUT request
•	@DeleteMapping — DELETE request
Example:

