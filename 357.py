"""
В метании молота состязается n спортcменов. Каждый из них сделал m бросков.
Победителем соревнований объявляется тот спортсмен, у которого максимален наилучший результат по всем броскам. Таким образом, программа должна найти значение максимального элемента в данном массиве, а также его индексы (то есть номер спортсмена и номер попытки).

Входные данные
Программа получает на вход два числа n и m, являющиеся числом строк и столбцов в массиве. 
Далее во входном потоке идет n строк по m чисел, являющихся элементами массива.

Выходные данные
Программа выводит значение максимального элемента, затем номер строки и номер столбца, в котором он встречается.
Если в массиве несколько максимальных элементов, то нужно вывести минимальный номер строки, в которой встречается такой элемент, а если в этой строке таких элементов несколько, то нужно вывести минимальный номер столбца. Не забудьте, что все строки и столбцы нумеруются с 0.

"""
def isInt(value):
	try:
		int(value)
		return True
	except:
		ValueError
		return False

checkInput = input()
if checkInput[0] != " " and checkInput[2] != " ":
	inputData = checkInput.split()
	#check array not empty
	if inputData and len(inputData) == 2 and isInt(inputData[0]) and isInt(inputData[1]):
		n = int(inputData[0])
		m = int(inputData[1])
		if n > 0 and m > 0:
			startArray = []
			arrayForIndex = list()
			global maxElement 
			maxElement = 0
			#read data
			for i in range(n):
				startArray.append([ j for j in input().split()])	
			#find max element
			for i in range(0,int(n)):
				if len(startArray[i]) < m:
					exit(0)
				for j in range(0,len(startArray[i])):
					#check input data
					if startArray[i][j] and isInt(startArray[i][j]):
						#write index in maxElement array index
						if int(startArray[i][j]) > int(maxElement):
							maxElement = startArray[i][j]
							arrayForIndex.insert(int(maxElement),[i,j]);
					else:
						exit(0)

			print(maxElement)
			print(arrayForIndex[len(arrayForIndex)-1][0],arrayForIndex[len(arrayForIndex)-1][1])

