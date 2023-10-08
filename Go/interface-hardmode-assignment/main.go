package main

import (
	"fmt"
	"io"
	"os"
)

func main() {
	args := os.Args
	if len(args) < 2 {
		fmt.Println("Invalid command. Try go run main.go <filename>")
		os.Exit(1)
	}

	filename := args[1]

	file, err := os.Open(filename)

	if err != nil {
		fmt.Printf("Error in opening file %v", filename)
		os.Exit(1)
	}

	io.Copy(os.Stdout, file)
}
