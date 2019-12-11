n = int(input())
sequince = input().split(" ")
for i in range(0,n-1):
	buf = sequince[i+1]
	sequince[i+1] = sequince[i]
	
