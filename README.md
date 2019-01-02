```
$ curl -H "Content-Type: application/json" -d '{"name":"Jeff"}' http://localhost:8080/book
{"name":"Jeff","id":1}
 $ 
 $ curl -H "Content-Type: application/json" -d '{"name":"Jeff"}' http://localhost:8080/book
{"name":"Jeff","id":1}
 $ 
 $ curl -H "Content-Type: application/json" -d '{"name":"Jake"}' http://localhost:8080/book
{"name":"Jake","id":2}
 $ 
 $ curl -H "Content-Type: application/json" -d '{"name":"Zack"}' http://localhost:8080/book
{"name":"Zack","id":3}
 $ 
 $ curl http://localhost:8080/book
[{"name":"Jeff","id":1},{"name":"Jake","id":2},{"name":"Zack","id":3}]
 $ 
 $ curl http://localhost:8080/book/1
{"name":"Jeff","id":1}
 $ 
 $ curl http://localhost:8080/book/2
{"name":"Jake","id":2}
 $ 
 $ curl http://localhost:8080/book/3
{"name":"Zack","id":3}
 $ 
```
