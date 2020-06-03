import random
import math
def isCoPrime(i,z):
	if(math.gcd(i,z)==1 and i!=z):
		return True
	return False
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
q= random.choice(primes)
print("Value of p:",p)
print("Value of q:",q)
n=p*q
z=(p-1)*(q-1)
coprimes = [i for i in range(1,z) if isCoPrime(i,z)]
e = random.choice(coprimes)
print("Public key("+str(n)+","+str(e)+")")
for i in range(1,z):
	if(i*e%z==1):
		d=i
print("Private key(d)=",d)
messl=[]
asc=[]
en=[]
de=[]
sent=""
received=""
message=input("Enter message")
for i in message:
	messl.append(i)
for i in messl:
	asc.append(ord(i))
for i in asc:
    en.append(pow(i,d)%n)
for i in en:
    de.append(pow(i,e)%n)
for i in de:
    sent+=str(i)
for i in asc:
    received+=str(i)
print("Value of M=",sent)
print("Value of M'=",received)
if(sent==received):
    print("Accept message")
else:
    print("Reject message")
