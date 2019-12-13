'''
Совпадают ли строки?
Напишите функцию bool Compare(string S1, string S2), определяющую, совпадают ли 2 строки.
Входные данные
Заданы 2 строки.

Выходные данные
Необходимо вывести  слово yes, если строки совпадают, и слово no в противном случае.
'''

def compare(s1, s2):
	if s1 == s2:
		return True
	else:
		return False	

s1 = input()
s2 = input()	
if compare(s1, s2):print('yes')
else:print('no')	