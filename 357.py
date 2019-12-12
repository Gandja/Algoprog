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
inputData = input().split()
n = int(inputData[0])
m = int(inputData[1])
startArray = []
global maxElement
global k
global f
for i in range(n):
	startArray.append([ j for j in input().split()])
maxElement = startArray[0][0]
k = 0
f = 0
for i in range(0,int(n)):
	for j in range(0,len(startArray[i])):
		if int(startArray[i][j]) > int(maxElement):
			maxElement = startArray[i][j]
			k = i
			f = j
print(maxElement)
print(k,f)


