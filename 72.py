N = int(input())
arr = input().split(' ')
max = int(arr[0])
while N >=0:
	if int(arr[N-1]) > max:
		max = int(arr[N-1])
	N -= 1

print(max)