# Maximum Perimeter Triangle

[```Hackerrank```](https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem)

## Problem
Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle with the maximum possible perimeter. Print the lengths of its sides as  space-separated integers in non-decreasing order.

If there are several valid triangles having the maximum perimeter:
* Choose the one with the longest maximum side.
* If more than one has that maximum, choose from them the one with the longest minimum side.
* If more than one has that maximum as well, print any one them.
* If no non-degenerate triangle exists, print ```-1```.

For example, assume there are stick lengths ```[1,2,3,4,5,10]```. The triplet ```(1,2,3)``` will not form a triangle. Neither will ```(4,5,10)``` or ```(2,3,5)```, so the problem is reduced to ```(2,3,4)``` and ```(3,4,5)```. The longer perimeter is ```3+4+5=12```.

