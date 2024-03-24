
## post with exception
    curl -v -X POST http://localhost:8080/payment

## post with body
    curl -v -X POST http://127.0.0.1:8080/payment -d '{"amount": 1000}' -H \
    "Content-Type: application/json"