N = int(input())
arr = input().split(' ')
while N >= 0:
	temp = arr[len(arr)-1]
	arr.pop()
	arr.insert(0,temp)
	N -= 1
print(" ".join(arr))


