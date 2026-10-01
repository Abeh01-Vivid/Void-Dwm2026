package main

import (
    "fmt"
    "net/http"
)

// helloHandler serves HTTP requests
func helloHandler(w http.ResponseWriter, r *http.Request) {
    fmt.Fprint(w, "Welcome to my web application API!")
}

func main() {
    // Route requests matching "/" to helloHandler
    http.HandleFunc("/", helloHandler)

    fmt.Println("Server is running securely on port 8080...")
    // Start listening on localhost port 8080
    if err := http.ListenAndServe(":8080", nil); err != nil {
        panic(err)
    }
}

