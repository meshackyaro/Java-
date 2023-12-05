number = int(input("Enter number: "))

positive_count = 0
negative_count = 0
zero_count = 0
count = 0

while number != -1:
	if number > 0:
		positive_count += 1
	if number < -1:
		negative_count += 1
	if number == 0:
		zero_count += 1
	number = int(input("Enter number: "))
print("Number of positive numbers is ", positive_count)
print("Number of negative numbers is ", negative_count)
print("Number of zeros is ", zero_count)