j=0

sumeven=0

sumodd=0

memo=[] 



for i in range (8):
	x=int(input("enter no. \n")) 
	memo.insert(i,x)
print(memo)

for i in range(8):
	if memo[i] % 2 == 0:
		if (j==4):
			break
		sumeven = sumeven + memo[i]
		print(memo[i])
		j=+1

print("Sum of first 4 even",sumeven)



for i in range(8):

	if memo[i] % 2 == 1:

		if (j==4):

			break

		sumodd = sumodd + memo[i]

		print(memo[i])

		j=+1

print("Sum of first 4 even",sumodd)

OP:
enter no. 
1
enter no. 
2
enter no. 
3
enter no. 
4
enter no. 
5
enter no. 
6
enter no. 
7
enter no. 
8
[1, 2, 3, 4, 5, 6, 7, 8]
2
4
6
8
Sum of first 4 even 20
1
3
5
7
Sum of first 4 even 16
