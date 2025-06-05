""" 1. Easy
Print all even numbers from 2 to 20 (inclusive)"""

nums = list(range(1,21))

for i in nums:
    if i % 2 == 0:
        print(i,end=" ")


""" 2. Medium
Given a list of words, print only those words which have more than 4 characters"""

words = ["apple", "cat", "banana", "dog", "elephant"]

print()
filtered_words = [word for word in words if len(word) > 4]
print(filtered_words)

""" 3. Hard
Given a list of lists of integers, 
flatten it into a single list containing only the unique elements, 
sorted in ascending order, and print the result"""

data = [[3,2,7], [8,9,11], [34,7,12], [3,9,1]]

"""final_list = []
for sublist in data:
    for num in sublist:
        final_list.append(num)"""

final_list = [num for sublist in data for num in sublist]

# to remove duplications
unique_nums = set(final_list)

# to sort in ascending order
sorted_list = sorted(unique_nums)

print(sorted_list)
