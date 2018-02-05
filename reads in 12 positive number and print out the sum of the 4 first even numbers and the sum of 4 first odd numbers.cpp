#include <iostream> 

using namespace std;

int main()

{

	int i=0,o=4, e=4, sumeven=0,n=12,sumodd=0;

	int *memo;

	 

	cout<<"Size of array = ";

	cin>>n;

	memo = (int *)malloc(n * sizeof(int));

		

	for(i=0;i<n;i++) {

		cin>>memo[i];

	}

	

	cout << "\nValues in Array\n";

	

	for(i=0;i<n;i++) {

		if (memo[i] % 2 == 0){

			if (e) {

				sumeven += memo[i];

				e--;

			}

		} else {

			if (o) {

				sumodd += memo[i];

				o--;

			}

		}

		if (!(o || e)) {

			break;

		}

	}

	

	cout << "Sum of evens :: "<<sumeven<<"\nSum of odds :: "<<sumodd;

	return 0;

}

