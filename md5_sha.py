import hashlib
import time
print("Implementing MD5")
print("-----------------")
print()
str = input("Enter string:")
stime=time.time()
# print(stime)
result = hashlib.md5(str.encode())
print("The hexadecimal equivalent of hash is : ", end ="")
print(result.hexdigest())
etime=time.time()
print(stime-etime)
print()
print("Implementing SHA")
print("-----------------")
print()
stime=time.time()
result = hashlib.sha1(str.encode())
print("The hexadecimal equivalent of SHA1 is : ",result.hexdigest())
etime=time.time()
print(etime-stime)



