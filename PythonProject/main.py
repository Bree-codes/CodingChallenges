import json
import csv

# Input and output file paths
input_file = '/home/bree/Downloads/hostel_issues_dataset.jsonl'
output_file = '/home/bree/Downloads/complaints.csv'

# Read the JSONL file line by line
with open(input_file, 'r', encoding='utf-8') as jsonl_file:
    data = [json.loads(line) for line in jsonl_file]

# Check if the file has data
if not data:
    print("JSONL file is empty.")
    exit()

# Use keys of the first JSON object as CSV headers
headers = data[0].keys()

# Write data to CSV
with open(output_file, 'w', newline='', encoding='utf-8') as csv_file:
    writer = csv.DictWriter(csv_file, fieldnames=headers)
    writer.writeheader()
    writer.writerows(data)

print(f"Conversion complete! CSV file saved as: {output_file}")
