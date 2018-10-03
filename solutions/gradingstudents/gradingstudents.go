package main

import "fmt"

func main() {
	var numStudents int

	fmt.Scanf("%v", &numStudents)

	for i := 0; i < numStudents; i++ {
		var grade int

		fmt.Scanf("%v", &grade)

		fmt.Println(doSamsRoundingRule(grade))
	}
}

func doSamsRoundingRule(grade int) int {
	switch {
	case grade < 38:
		return grade
	default:
		nextMultiple := nextMultipleOf5(grade)

		if nextMultiple-grade < 3 {
			return nextMultiple
		} else {
			return grade
		}
	}
}

func nextMultipleOf5(grade int) int {
	var multiple int
	factor := 1

	for multiple < grade {
		multiple = 5 * factor
		factor++
	}

	return multiple
}
