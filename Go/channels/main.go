package main

import (
	"fmt"
	"net/http"
	"time"
)

func main() {
	links := []string{
		"http://google.com",
		"http://facebook.com",
		"http://stackoverflow.com",
		"http://go.dev",
		"http://amazon.com",
	}

	c := make(chan string) // create a channel of string

	for _, link := range links {
		go checkLink(link, c)
	}

	// for {
	// 	go checkLink(<-c, c)
	// }

	for l := range c {
		go func(link string) {
			time.Sleep(3 * time.Second)
			go checkLink(link, c)
		}(l)
	}

}

func checkLink(link string, c chan string) {
	_, err := http.Get(link)
	if err != nil {
		fmt.Println(link, "might be down!")
		c <- link
		return
	}

	fmt.Println(link, "is up!")
	c <- link
}
