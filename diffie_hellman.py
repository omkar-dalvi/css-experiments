from random import *
import random
import math

def isPrime(x):
	if x >= 2:
		for y in range(2, x):
			if not (x % y):
				return False
	else:
		return False
	return True

primes = [i for i in range(1,1000) if isPrime(i)]
p = random.choice(primes)
print("Value of p",p)
g=randint(1,p-1)
print("Value of g",g)

a=int(input("Enter value of a:"))
b=int(input("Enter value of b:"))

A=pow(g,a)%p
B=pow(g,b)%p
print("Value of A:",A)
print("Value of B:",B)

APrime=pow(B,a)%p
BPrime=pow(A,b)%p
print("Value of A':",APrime)
print("Value of B':",BPrime)

