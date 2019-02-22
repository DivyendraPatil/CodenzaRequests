
# change this value for a different result
nterms = 10

# uncomment to take input from the user
#nterms = int(input("How many terms? "))

# first two terms
n1 = 1
n2 = 1
count = 0
i = 1

# check if the number of terms is valid
if nterms <= 0:
	print("Please enter a positive integer")
elif nterms == 1:
	print("Fibonacci sequence upto",nterms,":")
	print(n1)
else:
	print("Fibonacci sequence upto",nterms,":")
	while len(str(n1)) < 1000:
		 print(i," = ",n1,end=' , ')
		 print()
		 i = i+1
		 nth = n1 + n2
		 # update values
		 n1 = n2
		 n2 = nth
		 count += 1