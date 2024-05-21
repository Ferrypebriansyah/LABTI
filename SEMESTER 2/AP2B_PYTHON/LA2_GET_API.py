## GET API

import requests

url = "http://localhost:3000/users"
response = requests.get(url)

if response.status_code == 200:
    data = response.json()
    print(data)
else:
    print("Failed to get data from API")

    