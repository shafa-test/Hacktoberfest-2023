package main

import "fmt"

type shape interface {
	getArea() float64
}

type square struct {
	sideLength float64
}
type rectangle struct {
	base   float64
	height float64
}

func main() {
	sq := square{
		sideLength: 7.5,
	}

	re := rectangle{
		base:   10.5,
		height: 7,
	}

	printArea(sq)
	printArea(re)
}

func printArea(s shape) {
	fmt.Println(s.getArea())
}

func (sq square) getArea() float64 {
	return sq.sideLength * sq.sideLength
}

func (re rectangle) getArea() float64 {
	return 0.5 * re.base * re.height
}
