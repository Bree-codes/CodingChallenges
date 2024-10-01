import array

# Create an array of integers
arr = array.array('i', [1, 2, 3, 4, 5, 6])

# Convert array to list and print it
print(arr.tolist())

# Check if the element is in the array before trying to find its index
try:
    val = arr.index(3)
    print(f"The Element is at index: ",val)
except ValueError:
    print("Error: The Element is not in the array.")

# Remove the element '2' from the array and print the updated array
arr.remove(2)
print("Array after removing 2:", arr.tolist())

# Append '100' to the array and print the updated array
arr.append(100)
print("Array after appending 100:", arr.tolist())

# Insert '20' at index 3 and print the updated array
arr.insert(3, 20)
print("Array after inserting 20 at index 3:", arr.tolist())
